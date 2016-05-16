/*深度优先搜索***/
public class Sum_Root_to_Leaf_Numbers_129 {
	int sum=0;
	public int sumNumbers(TreeNode root) {
		String s = "";
		dfs(root,s);
		return sum;
    }
	void dfs(TreeNode root,String s){ /*s用来记录该路径上的字符串****/
		if(root==null) return;
		s = s+root.val;
		if(root.left==null && root.right ==null){/*到叶节点计算值***/
			sum+=Integer.parseInt(s);
		}
		dfs(root.left,s);
		dfs(root.right,s);
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode one = new TreeNode(2);
		TreeNode two = new TreeNode(3);
		//TreeNode three = new TreeNode(22);
		root.left = one;
		root.right = two;
		//two.left =three;
		Sum_Root_to_Leaf_Numbers_129 s129 = new Sum_Root_to_Leaf_Numbers_129();
		System.out.println(s129.sumNumbers(root));
	}

}
