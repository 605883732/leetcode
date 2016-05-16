/*二分查找法***/
public class Search_for_a_Range_34 {
	public int[] searchRange(int[] nums, int target) {
        int len =nums.length;
        int low = 0;
        int high = len -1;
        int result[] = new int[2];
        result[0]=-1;result[1]=-1;
        if(nums==null) return result;
        /*二分查找过程***/
        while(low<=high){
        	int mid = low+(high-low)/2;
        	if(nums[mid]<target){
        		low = mid+1;
        	}
        	else if(nums[mid]>target){
        		high=mid-1;
        	}
        	else if(nums[mid]==target){
        		result[0] = mid;
        		result[1] = mid;
        		int temp = mid;
        		while(mid-1>=0 && nums[mid-1]==target){
        			mid = mid-1;
        			result[0] = mid;
        		}
        
        		mid = temp;
        		while(mid+1<len&&nums[mid+1]==target){
        			mid = mid+1;
        			result[1] = mid;
        		}
        		break;
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		int nums[]={1,1,2};
		Search_for_a_Range_34 s34 = new Search_for_a_Range_34();
		int a[] =s34.searchRange(nums, 1);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}

	}

}
