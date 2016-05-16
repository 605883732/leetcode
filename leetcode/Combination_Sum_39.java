import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Combination_Sum_39 {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	int target;
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
        this.target = target;
        dfs(candidates,0,new ArrayList<Integer>(),0);
        return result;
    }
	void dfs(int candidates[],int cur_sum,List<Integer> each,int start){
		if(cur_sum==target){
			result.add(each);
			return;
		}
		if(cur_sum>target) return;
		for(int i=start;i<candidates.length;i++){
			cur_sum+=candidates[i];
			List<Integer> temp = new ArrayList<Integer>();
			temp.addAll(each);
			temp.add(candidates[i]);
			dfs(candidates,cur_sum,temp,i);
			cur_sum-=candidates[i];
		}
	}
	public static void main(String[] args) {
		Combination_Sum_39 c39 = new Combination_Sum_39();
		int candidates[] = {2,3,6,7};
		List<List<Integer>> rs =c39.combinationSum(candidates, 7);
		for(int i=0;i<rs.size();i++){
			for(int j=0;j<rs.get(i).size();j++){
				System.out.print(rs.get(i).get(j)+" ");
			}
			System.out.println();
		}

	}

}
