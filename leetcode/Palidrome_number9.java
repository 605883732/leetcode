/*
 * 判断一个整数是否为回环整数，不准使用额外空间
 */
public class Palidrome_number9 {
	public boolean isPalindrome(int x) {
        if(x<0) return false;//负数，返回false
        /*从两边往中间比，若不相同则返回false*****/
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
