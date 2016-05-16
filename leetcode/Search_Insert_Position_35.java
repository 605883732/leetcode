/*二分查找***/
public class Search_Insert_Position_35 {

	public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if(nums==null) return 0;
        int low = 0;
        int high =len-1;
        while(low<=high){
        	int mid = low+(high-low)/2;
        	if(nums[mid] == target) return mid;
        	else if(nums[mid]<target){
        		low = mid+1;
        	}else if(nums[mid]>target){
        		high = mid-1;
        	}
        }
        return Math.max(low,high);/*未找到，返回low,high中大的那个，即为要插入的位置***/
        
    }
	public static void main(String[] args) {
		int nums[]={1,3,5,6};
		Search_Insert_Position_35 s35 = new Search_Insert_Position_35();
		System.out.println(s35.searchInsert(nums, 0));

	}

}
