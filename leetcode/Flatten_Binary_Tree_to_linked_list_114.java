/*深度优先搜索**/
public class Flatten_Binary_Tree_to_linked_list_114 {
	TreeNode result;/*正在扩展的节点***/
	public void flatten(TreeNode root) {
		if(root==null) return; //空树，直接返回
		result = root;
		TreeNode right = root.right;/*需要用一个临时变量保存右节点，因为会在递归过程中变化**/
		dfs(root.left);
		dfs(right);
    }
	
	void dfs(TreeNode node){
		if(node==null) return;
		TreeNode right = node.right;/*需要用一个临时变量保存右节点，因为会在递归过程中变化**/
		result.left =null;
		result.right = node;/*将当前遍历到的节点连在正在扩展节点的右儿子***/
		result = result.right;
		dfs(node.left);
		dfs(right);
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode one = new TreeNode(2);
		TreeNode two = new TreeNode(5);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(6);
		root.left = one;
		root.right = two;
		one.left = three;
		one.right = four;
		two.right = five;
		Flatten_Binary_Tree_to_linked_list_114 f114 = new Flatten_Binary_Tree_to_linked_list_114();
		f114.flatten(root);
		while(root!=null){
			System.out.println(root.val);
			root=root.right;
		}
		

	}

}
