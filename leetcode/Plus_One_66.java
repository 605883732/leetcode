
public class Plus_One_66 {

    int[] plusOne(int[] digits) {
        int size = digits.length-1; //size表示数组的最后一位
        int number = digits[size]+1;
        int j=size;
        boolean flag = true;//判断是否为99999....
        /**如果全都是9***/
        for(int i=0;i<=size;i++){
        	if(digits[i]!=9){
        		flag=false;
        	}
        }
        if(flag){
        	int [] digits_copy=new int[digits.length+1];
        	digits_copy[0]=1;
        	for(int i=1;i<digits_copy.length;i++){
        		digits_copy[i]=0;
        	}
        	return digits_copy;
        }
        while(number==10){
        	digits[j]=0;
        	number=digits[--j]+1;
        }
        digits[j]++;
        return digits;
    }
	public static void main(String[] args) {
		Plus_One_66 po = new Plus_One_66();
		int number[]={1,2,3,4,5,6};
		int answer [] = po.plusOne(number);
        for(int i=0;i<answer.length;i++){
        	System.out.print(answer[i]);
        }
	}

}
