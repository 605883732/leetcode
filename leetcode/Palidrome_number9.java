/*
 * �ж�һ�������Ƿ�Ϊ�ػ���������׼ʹ�ö���ռ�
 */
public class Palidrome_number9 {
	public boolean isPalindrome(int x) {
        if(x<0) return false;//����������false
        /*���������м�ȣ�������ͬ�򷵻�false*****/
		int div=1;
        while(x/div>=10){
        	div=div*10;
        }
        while(x!=0){
        	 int left=x/div;
             int right=x%10;
             if(left!=right) return false;
             x=x%div;
             x=x/10;
             div=div/100;
        }
        return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palidrome_number9 p = new Palidrome_number9();
		System.out.println(p.isPalindrome(1221));
	}

}
