/*深度优先搜索***/
public class Minimum_Depth_of_Binary_Tree_111 {

	 public int minDepth(TreeNode root) {
		 	if(root==null) return 0;
		 	if(root.left==null) return 1+minDepth(root.right);
		 	if(root.right==null) return 1+minDepth(root.left);
	        return 1+Math.min(minDepth(root.left ), minDepth(root.right));
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
