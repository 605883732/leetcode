
public class Reverse_Bits_190 {
	public int reverseBits(int n) {
		int result = 0;
		/*java�����λ�Ƿ���λ�����Ǳ����װ���������Ƿ���λ���������޷�������***/
       for(int i=0;i<=31;i++){
    	   int temp = n&1;/*ȡ����ǰ���λ**/
    	   result = result|(temp<<(31-i));/*ȡ�������λ���ڽ�������λ��***/
    	   n=n>>1;
       }
       return result;
    }
	public static void main(String[] args) {
		Reverse_Bits_190 r190 = new Reverse_Bits_190();
		System.out.println(r190.reverseBits(43261596 ));

	}

}
