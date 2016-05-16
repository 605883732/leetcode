
public class Reverse_Bits_190 {
	public int reverseBits(int n) {
		int result = 0;
		/*java中最高位是符号位，我们必须假装把它当作非符号位，即当作无符号整数***/
       for(int i=0;i<=31;i++){
    	   int temp = n&1;/*取出当前最低位**/
    	   result = result|(temp<<(31-i));/*取出的最低位放在结果的最高位上***/
    	   n=n>>1;
       }
       return result;
    }
	public static void main(String[] args) {
		Reverse_Bits_190 r190 = new Reverse_Bits_190();
		System.out.println(r190.reverseBits(43261596 ));

	}

}
