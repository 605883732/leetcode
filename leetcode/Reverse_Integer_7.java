/*
 * ¼ûÊéÉÏ×¢ÊÍ
 */
public class Reverse_Integer_7 {
	
    public int reverse(int x) {
    	int ret=0;
    	while(x!=0){
    		if(Math.abs(ret)>214748364) return 0; 
    		ret=ret*10+x%10;
    		x=x/10;
    	}
    	return ret;
    }
	public static void main(String[] args) {
		Reverse_Integer_7 r = new Reverse_Integer_7();
		System.out.println(r.reverse(123));
	}

}
