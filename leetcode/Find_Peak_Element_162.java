/*二分查找peak数***/
public class Find_Peak_Element_162 {

	 public int findPeakElement(int[] nums) {
	        int len = nums.length;
	        if(len==1) return 0; 
	        int low = 0;
	        int high = len-1;
	        while(low<high){
	        	int mid = low+(high-low)/2;
	        	if(nums[mid+1]>nums[mid]){ //右边有peak数
	        		low = mid+1;
	        	}else if(nums[mid+1]<nums[mid]){
	        		high = mid;  //左边并且包括这个点可能有peak数
	        	}	
	        }
	        /*当low=high时，那个数就是需要的结果****/
	        return low;
	 }
	public static void main(String[] args) {
		int nums[] = {1,2,3,1};
		Find_Peak_Element_162 f162 = new Find_Peak_Element_162();
		System.out.println(f162.findPeakElement(nums));

	}

}
