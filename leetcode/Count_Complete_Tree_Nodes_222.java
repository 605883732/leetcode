/*������ȫ�������ڵ���***/
/*˼·�����ַ�������õ��������Ⱥ����ұ������ͬ��˵���Ըõ�Ϊ������������������***/
/*�ݹ����**/
public class Count_Complete_Tree_Nodes_222 {
	
	public int countNodes(TreeNode root) {
        int left = left_depth(root);
        int right = right_depth(root);
        if(left==right) return (1<<left)-1;/*��λ�������ȼ��ܵͣ�Ҫ������****/
        else return 1+countNodes(root.left)+countNodes(root.right);
        
    }
	int left_depth(TreeNode node){//��������
		int a = 0;
		while(node!=null){
			a++;
			node=node.left;
		}
		return a;
	}
	int right_depth(TreeNode node){//���ұ����
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
