
public class Find_Minimum_in_Rotated_Sorted_Array_153 {
	 public int findMin(int[] nums) {
	        if(nums == null || nums.length == 0) return 0;
	        if(nums.length == 1) return nums[0];
	        int temp = nums[0];
	        int start = 0;
	        int end = nums.length - 1;
	        while(start < end - 1){
	        	int mid = start + (end - start) / 2;
	        	if(nums[mid] > temp){ //如果该数比最左边元素大，要找的点在右边
	        		start = mid;
	        	}
	        	else{ //如果该数比最左边元素小，要找的点在左边
	        		end = mid;
	        	}
	        }
	        if(nums[start] < temp) return nums[start];
	        if(nums[end] < temp) return nums[end];
	        return temp;
	        
	    }
}	
