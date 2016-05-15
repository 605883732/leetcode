import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Permutations_Ⅱ_47 {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	public List<List<Integer>> permuteUnique(int[] nums) {
		Arrays.sort(nums);
		int visited[] = new int[nums.length];
        dfs(nums,new ArrayList<Integer>(),visited);
        return result;
    }
	void dfs(int nums[],List<Integer> each,int visited[]){
		if(each.size()==nums.length){//找到一条
			List<Integer> a = new ArrayList<Integer>(each);//创建一个新变量
			if(!result.contains(a)) result.add(a); //不含重复
			return;
		}
		for(int i=0;i<nums.length;i++){
			if(visited[i]==0){//未被访问过
				each.add(nums[i]);
				visited[i] = 1;
				dfs(nums,each,visited);
				visited[i] = 0;
				each.remove(each.size()-1);
				while(i<nums.length-1&&nums[i+1]==nums[i]){ /*剪枝，没有这一步会超时，重复的就不用考虑了****/
					i++;
				}
			}
		}
	}
	public static void main(String[] args) {
		Permutations_Ⅱ_47 p47 = new Permutations_Ⅱ_47();
		int nums[]={1,1,2};
		List<List<Integer>> rs = p47.permuteUnique(nums);
		for(int i=0;i<rs.size();i++){
			for(int j=0;j<rs.get(i).size();j++){
				System.out.print(rs.get(i).get(j)+" ");
			}
			System.out.println();
		}

	}

}
