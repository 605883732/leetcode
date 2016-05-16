/*深度优先搜索***/
/*从左向右遍历和从右向左遍历相等，则为对称树*****/
public class Symmetric_Tree_101 {
	String l="";//从左向右遍历
	String r="";//从右向左遍历
	public boolean isSymmetric(TreeNode root) {
		if(root==null) return true; //如果是空树，返回true
		dfs_l(root);//从左向右深度优先
		dfs_r(root);//从右向左深度优先
		System.out.println(l);
		System.out.println(r);
		if(l.equals(r)) return true;
		else return false;
		
    }
	void dfs_l(TreeNode root){
		if(root==null){
			l=l+" ";
			return;
		}
		l= l+root.val;
		dfs_l(root.left);
		dfs_l(root.right);
	}
	
	void dfs_r(TreeNode root){
		if(root==null){
			r=r+" ";
			return;
		}
		r= r+root.val;
		dfs_r(root.right);
		dfs_r(root.left);
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode one = new TreeNode(2);
		TreeNode two = new TreeNode(2);
		//TreeNode three = new TreeNode(3);
		//TreeNode four = new TreeNode(4);
		//TreeNode five = new TreeNode(6);
		root.left = one;
		root.right = two;
		
		Symmetric_Tree_101 s101 = new Symmetric_Tree_101();
		System.out.println(s101.isSymmetric(root));

	}

}
