import java.util.HashMap;
import java.util.Map;


public class Contains_Duplicate_II_219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
        	if(map.containsKey(nums[i])){
        		int a = map.get(nums[i]);
        		if(i - a <= k) return true;
        		else map.put(nums[i], i);
        	}else{
        		map.put(nums[i], i);
        	}
        }
        return false;
    }
}
