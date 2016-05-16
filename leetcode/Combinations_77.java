import java.util.ArrayList;
import java.util.List;


public class Combinations_77 {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	int k;
public List<List<Integer>> combine(int n, int k) {
		if(k==0) return result;
        int visited[] = new int[n+1]; //0表示未用过，1表示用过，下标0不用
        List<Integer> each = new ArrayList<Integer>();
        this.k = k;
        dfs(visited,0,each,1);
        return result;
        
    }
	void dfs(int visited[],int jishu,List<Integer> each,int start){		
		if(jishu == k){
			result.add(each);
			return;
		}
		if(start>=visited.length)
			return;
		for(int i=start;i<visited.length;i++){
			if(visited[i]==0){ //未访问过
				List<Integer> temp = new ArrayList<Integer>();
				temp.addAll(each);
				temp.add(i);
				jishu++;
				visited[i] = 1;
				dfs(visited,jishu,temp,i+1);
				/*清理工作***/
				visited[i] = 0;
				jishu--;
			}
			
		}
	}
	public static void main(String[] args) {
		Combinations_77 c77 = new Combinations_77();
		List<List<Integer>> rs =c77.combine(1, 2);
		for(int i=0;i<rs.size();i++){
			for(int j=0;j<rs.get(i).size();j++){
				System.out.print(rs.get(i).get(j)+" ");
			}
			System.out.println();
		}

	}

}
