import java.util.ArrayList;
import java.util.List;

/*���ݣ������ⷨ***/
public class Restore_Ip_Addresses_93 {

	public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();//���ؽ��
        int len = s.length();//�ַ�������
        if(len>12) return result;//������ȴ���12,�϶�����IP
        int part1;
        int part2;
        int part3;
        int part4;
        String sub;
        for(int i=0;i<=2;i++){
        	if(!(len>=i+1)) continue;
        	sub = s.substring(0,i+1);
        	if(sub.charAt(0)=='0'&&sub.length()>=2) continue;/*����м�������λ��0,�Ҳ�Ϊ0,�򲻿���***/
        	part1 = Integer.parseInt(sub);//ע��subString ��������β
        	//System.out.print(part1+" ");
        	if(!(len>=i+1&& part1>=0 && part1<=255)){
        		continue;
        	} //�������������
        	for(int j=i+1;j<=i+3;j++){
        		if(!(len>=j+1)) continue;
        		sub = s.substring(i+1,j+1);
            	if(sub.charAt(0)=='0'&&sub.length()>=2) continue;/*����м�������λ��0,�Ҳ�Ϊ0,�򲻿���***/
        		part2 = Integer.parseInt(sub);
        		//System.out.print(part2+" ");
        		if(!(len>=j+1&& part2>=0 && part2<=255)){
            		continue;
            	} //�������������
        		for(int k=j+1;k<=j+3;k++){
        			if(!(len>=k+1)) continue;
        			sub = s.substring(j+1,k+1);
                	if(sub.charAt(0)=='0'&&sub.length()>=2) continue;/*����м�������λ��0,�Ҳ�Ϊ0,�򲻿���***/
        			part3 = Integer.parseInt(sub);
        			//System.out.print(part3+" ");
        			if(!(len>=k+1&& part3>=0 && part3<=255)){
                		continue;
                	} //�������������
        			for(int q=k+1;q<=k+3;q++){
        				if(!(len==q+1)) continue;
        				//System.out.println(q+1);
        				sub = s.substring(k+1,q+1);
        	        	if(sub.charAt(0)=='0'&&sub.length()>=2) continue;/*����м�������λ��0,�Ҳ�Ϊ0,�򲻿���***/
        				part4 = Integer.parseInt(sub);
        				//System.out.println(part4);
            			if(!(len==q+1&& part4>=0 && part4<=255)){/*ע�����ﳤ�ȱ������q+1,��Ϊ����β��***/
                    		continue;
                    	} //�������������
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
