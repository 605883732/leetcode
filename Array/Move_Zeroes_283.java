
public class Move_Zeroes_283 {
	public void moveZeroes(int[] nums) {
		int begin = 0;
		int num_zero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
            	swap(nums,begin,i);
            	begin ++;
            }else{
            	num_zero ++;
            }
        }
        for(int i=begin;i<nums.length;i++){
        	nums[i] = 0;
        }
    }
	void swap(int nums[],int i,int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
