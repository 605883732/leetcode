
public class Path_Sum_112 {
	int sum;
	boolean flag = false;
	public boolean hasPathSum(TreeNode root, int sum) {
        this.sum = sum;	 
		dfs(root,0);
		return flag;
    }
	void dfs(TreeNode node, int result){
		if(node == null) return;
		result+=node.val;
		if(node.left==null && node.right==null){ /*Ò¶½Úµã***/
			if(result==sum) flag =true;
		}
		else {
			dfs(node.left,result);
			dfs(node.right,result);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
