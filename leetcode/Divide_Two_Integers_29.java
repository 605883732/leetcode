
public class Divide_Two_Integers_29 {

	public int divide(int dividend, int divisor) {
		/*Òç³öÇé¿ö***/
		if( dividend==Integer.MIN_VALUE&&divisor==-1) return Integer.MAX_VALUE;
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        int result = 0;
        int plus = 1;
        while(a>=b){
        	if(b+b>a){
        		a = a-b;
        		b =(long)Math.abs((long)divisor);
        		result+=plus;
        		plus =1;
        	}
        	else {
        		b=b+b;
        		plus+=plus;
        		
        	}
        	
        }
        if((dividend>0&&divisor<0)||(dividend<0&&divisor>0))
        	return -result;
        return result;
    }
	public static void main(String[] args) {
		Divide_Two_Integers_29 d29 = new Divide_Two_Integers_29();
		System.out.println(d29.divide( -2147483648, -2147483648));

	}

}
