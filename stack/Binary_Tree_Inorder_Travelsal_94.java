import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Binary_Tree_Inorder_Travelsal_94 {

    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root==null) return result;
        stack.push(root);
        /*�ѴӸ��ڵ㿪ʼ�����������ѹ��ջ***/
        while(root.left!=null){
        	stack.push(root.left);
        	root = root.left;
        }
        while(!stack.empty()){
        	TreeNode top = stack.pop(); //��ջ
        	//System.out.println(top.val);
        	result.add(top.val);
        	if(top.right!=null){
	        	stack.push(top.right); //������Ҷ��ӣ��Ҷ���ѹ��ջ
	        	top = top.right;
	        	while(top.left !=null){//���Ҷ��ӵ����������ѹ��ջ
	        		stack.push(top.left);
	        		top = top.left;
	        	}
           }
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
		root.left = one;
		root.right = two;
		one.left = three;
		one.right = four;
		two.left = five;
		two.right = six;
		Binary_Tree_Inorder_Travelsal_94 b94 = new Binary_Tree_Inorder_Travelsal_94();
		List<Integer> a = b94.inorderTraversal(root);
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));

	}

}
