/*ʵ��sqrt����****/
public class Sqrt_69 {

	public int mySqrt(int x) {
        int result = 0;
        for(int i=0;i<=x;i++){
        	if(i*i==x) return i;
        	if((long)i*i>x){ /*ע��������Long��ֹi*i���***/
        		 return i-1;
        	}
        }
        return 0;
    }
	public static void main(String[] args) {
		Sqrt_69 s69 = new Sqrt_69();
		System.out.println(s69.mySqrt(2147483647));
	}

}
