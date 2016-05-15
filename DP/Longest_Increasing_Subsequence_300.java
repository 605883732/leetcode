
public class Longest_Increasing_Subsequence_300 {

	public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return 1;
	 	int[] result = new int[nums.length];
        result[0] = 1;
        int max = 1;
        for(int i=1;i<nums.length;i++){
        	int max_temp = 1;
        	for(int j=0;j<i;j++){
        		if(nums[j] < nums[i]){
        			max_temp = Math.max(result[j]+1, max_temp);
        		}
        	}
        	result[i] = max_temp;
        	max = Math.max(max_temp,max);
        	
        }
        return max;
        
 }
	public static void main(String[] args) {
		

	}

}
