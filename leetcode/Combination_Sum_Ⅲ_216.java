import java.util.ArrayList;
import java.util.List;


public class Combination_Sum_Ⅲ_216 {
	int k; //几个数字
	int n;
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	public List<List<Integer>> combinationSum3(int k, int n) {
	      this.k = k;  
	      this.n =n;
	      dfs(0,0,1,new ArrayList<Integer>());
	      return result;
	}
	void dfs(int count,int cur_sum,int start,List<Integer> each){
		if(cur_sum>n) return;
		if(count==k){
			if(cur_sum==n){ //满足条件
				result.add(new ArrayList<Integer>(each));
				return;
			}
			return;
		}
		for(int i=start;i<=9;i++){
			cur_sum+=i;
			count++;
			each.add(i);
			dfs(count,cur_sum,i+1,each);
			cur_sum-=i;
			count--;
			each.remove(each.size()-1);
		}
	}
	public static void main(String[] args) {
		Combination_Sum_Ⅲ_216 c216 = new Combination_Sum_Ⅲ_216();
		List<List<Integer>> rs = c216.combinationSum3(3,9);
		for(int i=0;i<rs.size();i++){
			for(int j=0;j<rs.get(i).size();j++){
				System.out.print(rs.get(i).get(j)+" ");
			}
			System.out.println();
		}

	}

}
