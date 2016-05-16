import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Subset��_90 {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		 Arrays.sort(nums);
	        List<Integer> each = new ArrayList<Integer>();
	        result.add(each);//���ռ�����
	        
	        for(int i=0;i<nums.length;i++){
	        	find(nums,i,each);
	        }
	        return result;
    }
	void find(int []nums,int i,List<Integer> each){ /*�ݹ����***/
		List<Integer> cur = new ArrayList<Integer>();
		cur.addAll(each);
		cur.add(nums[i]);
		if(!(result.contains(cur))) result.add(cur);
		for(int j=i+1;j<nums.length;j++){
			find(nums,j,cur);
		}
	}
	public static void main(String[] args) {
		int nums[] = {1,2,2,2};
		Subset��_90 s90 = new Subset��_90();
		List<List<Integer>> result = s90.subsetsWithDup(nums);
		for(int i=0;i<result.size();i++){
			for(int j=0;j<result.get(i).size();j++){
				System.out.print(result.get(i).get(j)+" ");
			}
			System.out.println();
		}

	}

}
