import java.util.ArrayList;
import java.util.List;

/*回溯，迭代解法***/
public class Restore_Ip_Addresses_93 {

	public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();//返回结果
        int len = s.length();//字符串长度
        if(len>12) return result;//如果长度大于12,肯定不是IP
        int part1;
        int part2;
        int part3;
        int part4;
        String sub;
        for(int i=0;i<=2;i++){
        	if(!(len>=i+1)) continue;
        	sub = s.substring(0,i+1);
        	if(sub.charAt(0)=='0'&&sub.length()>=2) continue;/*如果中间数字首位是0,且不为0,则不可能***/
        	part1 = Integer.parseInt(sub);//注意subString 不包括结尾
        	//System.out.print(part1+" ");
        	if(!(len>=i+1&& part1>=0 && part1<=255)){
        		continue;
        	} //如果条件不满足
        	for(int j=i+1;j<=i+3;j++){
        		if(!(len>=j+1)) continue;
        		sub = s.substring(i+1,j+1);
            	if(sub.charAt(0)=='0'&&sub.length()>=2) continue;/*如果中间数字首位是0,且不为0,则不可能***/
        		part2 = Integer.parseInt(sub);
        		//System.out.print(part2+" ");
        		if(!(len>=j+1&& part2>=0 && part2<=255)){
            		continue;
            	} //如果条件不满足
        		for(int k=j+1;k<=j+3;k++){
        			if(!(len>=k+1)) continue;
        			sub = s.substring(j+1,k+1);
                	if(sub.charAt(0)=='0'&&sub.length()>=2) continue;/*如果中间数字首位是0,且不为0,则不可能***/
        			part3 = Integer.parseInt(sub);
        			//System.out.print(part3+" ");
        			if(!(len>=k+1&& part3>=0 && part3<=255)){
                		continue;
                	} //如果条件不满足
        			for(int q=k+1;q<=k+3;q++){
        				if(!(len==q+1)) continue;
        				//System.out.println(q+1);
        				sub = s.substring(k+1,q+1);
        	        	if(sub.charAt(0)=='0'&&sub.length()>=2) continue;/*如果中间数字首位是0,且不为0,则不可能***/
        				part4 = Integer.parseInt(sub);
        				//System.out.println(part4);
            			if(!(len==q+1&& part4>=0 && part4<=255)){/*注意这里长度必须等于q+1,因为到结尾了***/
                    		continue;
                    	} //如果条件不满足
            			else{
            				result.add(String.valueOf(part1)+"."+String.valueOf(part2)+"."+String.valueOf(part3)+"."+String.valueOf(part4));
            			}
        			}
        		}
        	}
        }
        return result;
		
    }
	public static void main(String[] args) {
		String s ="010010";
		Restore_Ip_Addresses_93 r93 = new Restore_Ip_Addresses_93();
		List a =r93.restoreIpAddresses(s);
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}

	}

}
