import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//二叉树后根遍历非递归
/*
 * 要保证根结点在左孩子和右孩子访问之后才能访问，因此对于任一结点P，先将其入栈。
 * 如果P不存在左孩子和右孩子，则可以直接访问它；或者P存在左孩子或者右孩子，但是其左孩子和右孩子都已被访问过了
 * ，则同样可以直接访问该结点。若非上述两种情况，
 * 则将P的右孩子和左孩子依次入栈，这样就保证了每次取栈顶元素的时候，左孩子在右孩子前面被访问，左孩子和右孩子都在根结点前面被访问。
 */
public class Binary_Tree_Postorder_Traversal_145 {
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode pre = null;//前一次访问的结点 
        if(root == null) return result;
        stack.push(root);
        while(!stack.isEmpty()){
        	TreeNode node = stack.peek();
        	
        	//如果当前结点没有孩子结点或者孩子节点都已被访问过 
        	/*这里说明一下，如果pre是当前节点的左儿子或右儿子，则说明当前节点的两个儿子都已访问过
        	 * 因为按入栈顺序，左右儿子都在当前节点上面，只有左右儿子都出栈，才会到当前节点，
        	 * 所以如果当前节点和前面出栈的节点是父子关系，说明当期节点的儿子已经全部出栈**/
        	if((node.left  == null && node.right ==null) ||
        		(pre!=null &&(pre == node.left || pre == node.right))){
        		pre = node;
        		result.add(node.val);
        		stack.pop();
        	}else{
        		if(node.right != null){ //先把右儿子入栈
        			stack.push(node.right);
        		}
        		if(node.left != null){ //再把左儿子入栈
        			stack.push(node.left );
        		}
        	}
        }
        return result;
    }
}
