
public class Power_of_Two_231 {
	public boolean isPowerOfTwo(int n) {
        if(n==1||n==2) return true;
		long i=2;//用int 可能会溢出
		
		while(i<n){
			i = i<<1;
		
			//System.out.println(i);
			if(i>=n) break;
		}
        if(i==n) return true;
        return false;
    }
	public static void main(String[] args) {
		Power_of_Two_231 p231 = new Power_of_Two_231();
		System.out.println(p231.isPowerOfTwo(1073741825));

	}

}
