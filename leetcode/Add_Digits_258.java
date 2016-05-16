
public class Add_Digits_258 {

	public int addDigits(int num) {
		int sum = 0;
        while(num!=0){
        	sum+= num%10;
            num = num/10;
            if(num==0) {
            	if(sum>=10){
            		num=sum;
                	sum=0;
            	}
            	else return sum;
            }
        }
		return sum;
    }
	public static void main(String[] args) {
		Add_Digits_258 a258 = new Add_Digits_258();
		System.out.println(a258.addDigits(5));

	}

}
