/*��m!=n����ô��ĩλ�ض���0����Ϊ[m,n]�ض�������ż����������ĩλ��0����m=n��ʱ�򣬺��涼��0��ǰ��ľ��������Χ�ڵ�����λ�������ͬ����**/
public class Bitwise_And_of_NUmbers_Range_201 {
	 public int rangeBitwiseAnd(int m, int n) {
	        int result = m;
	        int offset = 0;
	        while(m!=n){
	        	m=m>>1;//����
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
