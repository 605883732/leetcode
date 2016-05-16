/*当m!=n，那么最末位必定等0，因为[m,n]必定包含奇偶数，相与最末位等0。当m=n的时候，后面都是0，前面的就是这个范围内的数按位相与的相同部分**/
public class Bitwise_And_of_NUmbers_Range_201 {
	 public int rangeBitwiseAnd(int m, int n) {
	        int result = m;
	        int offset = 0;
	        while(m!=n){
	        	m=m>>1;//右移
	        	n=n>>1;
	        	offset++;
	        }
	        return m<<offset;
	    }
	public static void main(String[] args) {
		Bitwise_And_of_NUmbers_Range_201 b201 = new Bitwise_And_of_NUmbers_Range_201();
		System.out.println(b201.rangeBitwiseAnd(5,7));
		System.out.println(5&7);

	}

}
