/*求 n 的阶乘末尾0的数目****/
public class Factorial_Trailing_Zeroes_172 {
	public int trailingZeroes(int n) {
		int result =0;
		while(n>0){
			result+=n/5;
			n=n/5;
		}
		return result;
    }
	public static void main(String[] args) {
		Factorial_Trailing_Zeroes_172 ftz172 = new Factorial_Trailing_Zeroes_172();
		System.out.println(ftz172.trailingZeroes(100));

	}

}
