/*实现sqrt方法****/
public class Sqrt_69 {

	public int mySqrt(int x) {
        int result = 0;
        for(int i=0;i<=x;i++){
        	if(i*i==x) return i;
        	if((long)i*i>x){ /*注意这里用Long防止i*i溢出***/
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
