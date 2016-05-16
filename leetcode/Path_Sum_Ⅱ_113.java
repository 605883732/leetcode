import java.util.ArrayList;
import java.util.List;


public class Path_Sum_Ⅱ_113 {
	List<List<Integer>> result= new ArrayList<List<Integer>>();
	int sum;
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		this.sum = sum;
		dfs(root,new ArrayList<Integer>(),0);
		return result;
	        
	   }
	void dfs(TreeNode node, List<Integer> each,int result){
		if(node == null) return;
		result+=node.val;
		each.add(node.val);
		if(node.left==null && node.right==null){ /*叶节点***/
			if(result==sum) {
				List<Integer> a = new ArrayList<Integer>();
				a.addAll(each);/*复制List****/
				this.result.add(a);
			}
		}
		else {
			dfs(node.left,each,result);
			dfs(node.right,each,result);
		}
		each.remove(each.size()-1); /*退出时将该节点移出***/
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		TreeNode one = new TreeNode(4);
		TreeNode two = new TreeNode(8);
		TreeNode three = new TreeNode(11);
		TreeNode four = new TreeNode(7);
		TreeNode five = new TreeNode(7);
		root.left = one;
		root.right =two;
		one.left =three;
		two.left = four;
		two.right = five;
		Path_Sum_Ⅱ_113 p113 = new Path_Sum_Ⅱ_113();
		List<List<Integer>> a = p113.pathSum(root,20);
		for(int i=0;i<a.size();i++){
			for(int j=0;j<a.get(i).size();j++){
				System.out.print(a.get(i).get(j)+" ");
			}
			System.out.println();
		}

	}

}
