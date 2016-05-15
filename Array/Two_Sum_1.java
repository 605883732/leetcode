import java.util.HashMap;
import java.util.Map;


public class Two_Sum_1 {

	public int[] twoSum(int[] nums, int target) {
		int result [] = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++){
			int a = nums[i];
			int b = target - a;
			if(map.containsKey(b)){
				result[0] = map.get(b);
				result[1] = i;
				break;
			}else{
				map.put(a, i);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
