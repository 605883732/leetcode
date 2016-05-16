
public class Minimum_Size_Subarray_Sum_209 {
	public int minSubArrayLen(int s, int[] nums) {
		if(nums==null) return 0;
        int start = 0;
        int end = 0;
        int sum=0;
        int result = Integer.MAX_VALUE;
        while(end<nums.length){
        	sum+=nums[end];
        	//System.out.println(sum);
        	if(sum>=s){ //Âú×ãÌõ¼ş

        		while((sum-nums[start])>=s) {
        			//System.out.println(sum);
        			sum = sum-nums[start];
        			start++;		
        		}
        		if(end-start+1<result) result =end-start+1;
        		sum = sum-nums[start];
        		//System.out.println(sum+" "+result);
        		start++;
        	}
        	end++;
        }
        if(result==Integer.MAX_VALUE) return 0;
        return result;
    }
	public static void main(String[] args) {
		int[] nums={4};
		Minimum_Size_Subarray_Sum_209 m209 = new Minimum_Size_Subarray_Sum_209();
		System.out.println(m209.minSubArrayLen(4,nums));
		
	}

}
