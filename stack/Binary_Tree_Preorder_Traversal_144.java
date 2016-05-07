import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*用迭代法实现先根遍历***/
/*用栈实现***/
public class Binary_Tree_Preorder_Traversal_144 {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root==null) return result;
        stack.push(root);
        while(!stack.empty()){
        	TreeNode cur = stack.pop();
        	result.add(cur.val);
        	
        	/*右儿子先进栈，这样左儿子能先出来**/
        	if(cur.right!=null)
        		stack.push(cur.right);
        	if(cur.left!=null)
        		stack.push(cur.left);  	
        }
        return result;
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(5);
		TreeNode three = new TreeNode(0);
		TreeNode four = new TreeNode(2);
		TreeNode five = new TreeNode(4);
		TreeNode six = new TreeNode(6);
		root.left = null;
		root.right = null;
		one.left = three;
		one.right = four;
		two.left = five;
		two.right = six;
		Binary_Tree_Preorder_Traversal_144 b144 = new Binary_Tree_Preorder_Traversal_144();
		List<Integer> a = b144.preorderTraversal(root);
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}

	}

}
