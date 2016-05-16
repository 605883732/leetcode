import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;


public class Sum_15 {

	public List<List<Integer>> threeSum(int[] nums) {
	      Arrays.sort(nums);
	      List<List<Integer>> result = new ArrayList<List<Integer>>();
	      if(nums.length<3) return result;
	      int len = nums.length;
	      int low = 0;
	      int high = 0;
	      for(int i=0;i<len-2;i++){
	    	  low=i+1;
	    	  high=len-1;
	    	  while(low<high){
	    		  if(nums[i]+nums[low]+nums[high]==0){
	    			  result.add(Arrays.asList(nums[i],nums[low],nums[high])); /*找到一组加入结果***/
	    			  while(high>low && nums[high-1]==nums[high]){
	    				  high--;//相同的不用再考虑了
	    			  }
	    			  while(low<high &&nums[low+1]==nums[low]){
	    				  low++;//相同的不用再考虑了
	    			  }
	    			  high--;
	    			  low++;
	    		  }
	    		  else if(nums[i]+nums[low]+nums[high]>0) high--;/*结果比0大***/
	    		  else low++;/*结果比0小***/
	    	  }
	    	  while(i<len-2&&nums[i+1]==nums[i]) i++; //相同的不用再考虑了
	      }
	      return result;
	}
	public static void main(String[] args) {
		Sum_15 s15 =new Sum_15();
		int nums[]={7,-1,14,-12,-8,7,2,-15,8,8,-8,-14,-4,-5,7,9,11,-4,-15,-6,1,-14,4,3,10,-5,2,1,6,11,2,-2,-5,-7,-6,2,-15,11,-6,8,-4,2,1,-1,4,-6,-15,1,5,-15,10,14,9,-8,-6,4,-6,11,12,-15,7,-1,-9,9,-1,0,-4,-1,-12,-2,14,-9,7,0,-3,-4,1,-2,12,14,-10,0,5,14,-1,14,3,8,10,-8,8,-5,-2,6,-11,12,13,-7,-12,8,6,-13,14,-2,-5,-11,1,3,-6};
				List<List<Integer>> a = s15.threeSum(nums);
		
		for(List<Integer> item:a){
			for(int i=0;i<item.size();i++){
				System.out.print(item.get(i)+" ");
			}
			System.out.println();
		}

	}

}
