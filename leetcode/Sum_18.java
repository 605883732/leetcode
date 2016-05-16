import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Sum_18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
	    Arrays.sort(nums); 
	    for(int i=0;i<nums.length-1;i++){
	    	for(int j=i+1;j<nums.length ;j++){
	    		int twosum = nums[i]+nums[j];
	    		int start = j+1;
	    		int end = nums.length-1;
	    		while(start<end){
	    			while(start==i||start==j) start++;
		    		while(end==i||end==j) end--;
		    		if(twosum+nums[start]+nums[end]==target){
		    			List<Integer> each = new ArrayList<Integer>();
		    			each.add(nums[i]);each.add(nums[j]);
		    			each.add(nums[start]);each.add(nums[end]);
		    			if(!result.contains(each)) result.add(each);
		    			start++;end--;
		    		}else if(twosum+nums[start]+nums[end]>target){
		    			end--;
		    		}else if(twosum+nums[start]+nums[end]<target){
		    			start++;
		    		}
	    		}
	    	}
	    }
	    return result;
    }
	public static void main(String[] args) {
		int[] s = {1,0,-1,0,-2,2};
		Sum_18 s18 = new Sum_18();
		List<List<Integer>> result = s18.fourSum(s, 0);
		for(int i=0;i<result.size();i++){
			for(int j=0;j<result.get(i).size();j++){
				System.out.print(result.get(i).get(j)+" ");
			}
			System.out.println();
		}

	}

}
