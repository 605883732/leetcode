import java.util.ArrayList;
import java.util.List;


public class Summary_Ranges_228 {
	public List<String> summaryRanges(int[] nums) {
        int m = nums.length;
        List<String> result = new ArrayList<String>();
        if(nums ==null || nums.length == 0) return result;
        String start = "";
        String pre = "";
        for(int i=0;i<m;i++){
        	if(start.equals("")){
        		start = String.valueOf(nums[i]);
        		pre = String.valueOf(nums[i]);
        	}else{
        		int a = Integer.parseInt(pre);
        		if(nums[i] - a == 1){
        			pre = String.valueOf(nums[i]);
        			continue;
        		}else{
        			if(start.equals(pre)){
        				result.add(start);
        			}else{
        				String temp = start + "->" + pre;
	        			result.add(temp);
        			}
        			start = String.valueOf(nums[i]);
        			pre = String.valueOf(nums[i]);
        		}
        	}
        }
        if(start.equals(pre)){
			result.add(start);
		}else{
			String temp = start + "->" + pre;
			result.add(temp);
		}
        return result;
        
 }
}
 