/*计算完全二叉树节点树***/
/*思路：二分法，如果该点最左边深度和最右边深度相同，说明以该点为根的子树是满二叉树***/
/*递归求解**/
public class Count_Complete_Tree_Nodes_222 {
	
	public int countNodes(TreeNode root) {
        int left = left_depth(root);
        int right = right_depth(root);
        if(left==right) return (1<<left)-1;/*移位运算优先级很低，要加括号****/
        else return 1+countNodes(root.left)+countNodes(root.right);
        
    }
	int left_depth(TreeNode node){//最左边深度
		int a = 0;
		while(node!=null){
			a++;
			node=node.left;
		}
		return a;
	}
	int right_depth(TreeNode node){//最右边深度
		int a = 0;
		while(node!=null){
			a++;
			node=node.right;
		}
		return a;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode one = new TreeNode(2);
		TreeNode two = new TreeNode(1);
		root.left = one;
		one.right = two;
		root = null;
		Count_Complete_Tree_Nodes_222 c222 = new Count_Complete_Tree_Nodes_222();
		System.out.println(c222.countNodes(root));
	}

}
