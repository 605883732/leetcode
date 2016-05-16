import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//��������������ǵݹ�
/*
 * Ҫ��֤����������Ӻ��Һ��ӷ���֮����ܷ��ʣ���˶�����һ���P���Ƚ�����ջ��
 * ���P���������Ӻ��Һ��ӣ������ֱ�ӷ�����������P�������ӻ����Һ��ӣ����������Ӻ��Һ��Ӷ��ѱ����ʹ���
 * ����ͬ������ֱ�ӷ��ʸý�㡣�����������������
 * ��P���Һ��Ӻ�����������ջ�������ͱ�֤��ÿ��ȡջ��Ԫ�ص�ʱ���������Һ���ǰ�汻���ʣ����Ӻ��Һ��Ӷ��ڸ����ǰ�汻���ʡ�
 */
public class Binary_Tree_Postorder_Traversal_145 {
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode pre = null;//ǰһ�η��ʵĽ�� 
        if(root == null) return result;
        stack.push(root);
        while(!stack.isEmpty()){
        	TreeNode node = stack.peek();
        	
        	//�����ǰ���û�к��ӽ����ߺ��ӽڵ㶼�ѱ����ʹ� 
        	/*����˵��һ�£����pre�ǵ�ǰ�ڵ������ӻ��Ҷ��ӣ���˵����ǰ�ڵ���������Ӷ��ѷ��ʹ�
        	 * ��Ϊ����ջ˳�����Ҷ��Ӷ��ڵ�ǰ�ڵ����棬ֻ�����Ҷ��Ӷ���ջ���Żᵽ��ǰ�ڵ㣬
        	 * ���������ǰ�ڵ��ǰ���ջ�Ľڵ��Ǹ��ӹ�ϵ��˵�����ڽڵ�Ķ����Ѿ�ȫ����ջ**/
        	if((node.left  == null && node.right ==null) ||
        		(pre!=null &&(pre == node.left || pre == node.right))){
        		pre = node;
        		result.add(node.val);
        		stack.pop();
        	}else{
        		if(node.right != null){ //�Ȱ��Ҷ�����ջ
        			stack.push(node.right);
        		}
        		if(node.left != null){ //�ٰ��������ջ
        			stack.push(node.left );
        		}
        	}
        }
        return result;
    }
}
