/*�������������ַ������������ǵĺ�****/
public class Add_Binary_67 {

    public String addBinary(String a, String b) {
        String longer = a.length()>=b.length()?a:b;//���ַ�����longer
        String smaller = a.length()>=b.length()?b:a;//���ַ�����smaller
        int flag = 0; //�Ƿ���Ҫ��λ
        int sum[] = new int[longer.length()+1];//����������
        int d = smaller.length()-1;
        int e = 0;
        int s = sum.length-1;//������鳤��-1
        for(int i=longer.length()-1;i>=0;i--){
        	if(d<0){//������ľ�
        		e=Integer.parseInt(""+longer.charAt(i))+flag;
        		if(e>=2){//��Ҫ��λ
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
            	d--;//���ַ����±��1
            	if(e>=2){//��Ҫ��λ
            		flag=1;
            		e=e-2;
            		sum[s--]=e;
            	}else{
            		flag=0;
            		sum[s--]=e;
            	}
        	}	
        }
        if(flag==1) { //���տ�����Ҫ��һλ
        	sum[0]=1;
        }
        StringBuffer sb = new StringBuffer();
        int j=0;
        if(sum[0]==0) j=1; //�����λ��0,��ʾ����û�н�λ����ӵ�һλ��ʼ��ȡ
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
