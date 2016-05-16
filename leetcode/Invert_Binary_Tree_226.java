import java.util.ArrayList;
import java.util.List;

/*后根遍历**/
/*用后根遍历是为了从最下层开始交换****/
public class Invert_Binary_Tree_226 {
	
	public TreeNode invertTree(TreeNode root) {
		return postOrder(root);
    }
	TreeNode postOrder(TreeNode node){
		if(node==null) return null;
		TreeNode l =postOrder(node.left);/*当前节点的左儿子***/
		TreeNode r =postOrder(node.right);/*当前节点的右儿子***/
		
		/*左儿子，右儿子交换位置****/
		TreeNode temp = node.left;
		node.left = r;
		node.right =l;
		return node;
		
	}
	
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode one = new TreeNode(2);
		TreeNode two = new TreeNode(3);
		//TreeNode three = new TreeNode(3);
		//TreeNode four = new TreeNode(4);
		//TreeNode five = new TreeNode(6);
		root.left = one;
		root.right = two;
		Invert_Binary_Tree_226 i226 = new Invert_Binary_Tree_226();
		TreeNode a =i226.invertTree(root);
		System.out.println(a.val);
		System.out.println(a.left.val);
		System.out.println(a.right.val);
	}

}
