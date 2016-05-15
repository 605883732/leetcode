import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Permutations_��_47 {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	public List<List<Integer>> permuteUnique(int[] nums) {
		Arrays.sort(nums);
		int visited[] = new int[nums.length];
        dfs(nums,new ArrayList<Integer>(),visited);
        return result;
    }
	void dfs(int nums[],List<Integer> each,int visited[]){
		if(each.size()==nums.length){//�ҵ�һ��
			List<Integer> a = new ArrayList<Integer>(each);//����һ���±���
			if(!result.contains(a)) result.add(a); //�����ظ�
			return;
		}
		for(int i=0;i<nums.length;i++){
			if(visited[i]==0){//δ�����ʹ�
				each.add(nums[i]);
				visited[i] = 1;
				dfs(nums,each,visited);
				visited[i] = 0;
				each.remove(each.size()-1);
				while(i<nums.length-1&&nums[i+1]==nums[i]){ /*��֦��û����һ���ᳬʱ���ظ��ľͲ��ÿ�����****/
					i++;
				}
			}
		}
	}
	public static void main(String[] args) {
		Permutations_��_47 p47 = new Permutations_��_47();
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
