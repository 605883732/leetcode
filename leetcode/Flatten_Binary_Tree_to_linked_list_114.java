/*�����������**/
public class Flatten_Binary_Tree_to_linked_list_114 {
	TreeNode result;/*������չ�Ľڵ�***/
	public void flatten(TreeNode root) {
		if(root==null) return; //������ֱ�ӷ���
		result = root;
		TreeNode right = root.right;/*��Ҫ��һ����ʱ���������ҽڵ㣬��Ϊ���ڵݹ�����б仯**/
		dfs(root.left);
		dfs(right);
    }
	
	void dfs(TreeNode node){
		if(node==null) return;
		TreeNode right = node.right;/*��Ҫ��һ����ʱ���������ҽڵ㣬��Ϊ���ڵݹ�����б仯**/
		result.left =null;
		result.right = node;/*����ǰ�������Ľڵ�����������չ�ڵ���Ҷ���***/
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
