/*给两个二进制字符串，返回他们的和****/
public class Add_Binary_67 {

    public String addBinary(String a, String b) {
        String longer = a.length()>=b.length()?a:b;//长字符串给longer
        String smaller = a.length()>=b.length()?b:a;//短字符串给smaller
        int flag = 0; //是否需要进位
        int sum[] = new int[longer.length()+1];//结果存放数组
        int d = smaller.length()-1;
        int e = 0;
        int s = sum.length-1;//结果数组长度-1
        for(int i=longer.length()-1;i>=0;i--){
        	if(d<0){//短数组耗尽
        		e=Integer.parseInt(""+longer.charAt(i))+flag;
        		if(e>=2){//需要进位
            		flag=1;
            		e=e-2;
            		sum[s--]=e;
            	}else{
            		flag=0;
            		sum[s--]=e;
            	}
        	}
        	else{
        		e = Integer.parseInt(""+longer.charAt(i))+Integer.parseInt(""+smaller.charAt(d))+flag;
            	d--;//短字符串下标减1
            	if(e>=2){//需要进位
            		flag=1;
            		e=e-2;
            		sum[s--]=e;
            	}else{
            		flag=0;
            		sum[s--]=e;
            	}
        	}	
        }
        if(flag==1) { //最终可能需要进一位
        	sum[0]=1;
        }
        StringBuffer sb = new StringBuffer();
        int j=0;
        if(sum[0]==0) j=1; //如果首位是0,表示最终没有进位，则从第一位开始截取
        for(int i=j;i<sum.length;i++){
        	sb.append(sum[i]);
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		
		Add_Binary_67 aa = new Add_Binary_67();
		String a = "1111";
		String b = "1111";
		System.out.println(aa.addBinary(a, b));
	}

}
