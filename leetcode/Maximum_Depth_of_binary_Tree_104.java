/*树的深度优先搜索****/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Maximum_Depth_of_binary_Tree_104 {
	public int maxDepth(TreeNode root) {
       return root==null?0:1+Math.max(maxDepth(root.left),maxDepth(root.right));
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(100);
		TreeNode one = new TreeNode(50);
		TreeNode two = new TreeNode(55);
		TreeNode three = new TreeNode(22);
		root.left = one;
		root.right = two;
		two.left =three;
		Maximum_Depth_of_binary_Tree_104 m104 = new Maximum_Depth_of_binary_Tree_104();
		System.out.println(m104.maxDepth(root));

	}

}
