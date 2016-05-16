/*Î»ÔËËã£¬hashset***/
public class Single_Number_136 {
	public int singleNumber(int[] nums) {
        int a=0;
		for(int i=0;i<nums.length;i++){
        	a=a^nums[i];
        }
		return a;
    }
	public static void main(String[] args) {
		Single_Number_136  s136 = new Single_Number_136();
		int nums[]={-1};
		System.out.println(Integer.toBinaryString(-2));

	}

}
