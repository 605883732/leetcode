/*
 * 和 First Missing Positive 41类似
 */
public class Find_the_Duplicate_Number_287 {
	public int findDuplicate(int[] nums) {
        int m = nums.length; // 从 1 ~ (m-1)
        int start = 0; //从 0 ~ start -1 已经填了正确的数字
        int i = 0;
        while(i < m){
        	if(nums[i] == i+1){ //该位置上填了正确的数
        		i ++ ;
        	}else{
        		if(nums[nums[i] - 1] == nums[i]){
        			return nums[i];
        		}else{
        			/*这中交换一定要写在函数里，否则nums[i]变化了,结果就出错**/
        			swap(nums,i,nums[i]-1);  
        		}
        	}
        }
        return 0;
        
    }
	void swap(int nums[],int i,int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public static void main(String[] args) {
		Find_the_Duplicate_Number_287  f287 = new Find_the_Duplicate_Number_287();
		int []arr = {2,1,1};
		System.out.println(f287.findDuplicate(arr));

	}

}
