/*�����������***/
/*�������ұ����ʹ������������ȣ���Ϊ�Գ���*****/
public class Symmetric_Tree_101 {
	String l="";//�������ұ���
	String r="";//�����������
	public boolean isSymmetric(TreeNode root) {
		if(root==null) return true; //����ǿ���������true
		dfs_l(root);//���������������
		dfs_r(root);//���������������
		System.out.println(l);
		System.out.println(r);
		if(l.equals(r)) return true;
		else return false;
		
    }
	void dfs_l(TreeNode root){
		if(root==null){
			l=l+" ";
			return;
		}
		l= l+root.val;
		dfs_l(root.left);
		dfs_l(root.right);
	}
	
	void dfs_r(TreeNode root){
		if(root==null){
			r=r+" ";
			return;
		}
		r= r+root.val;
		dfs_r(root.right);
		dfs_r(root.left);
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode one = new TreeNode(2);
		TreeNode two = new TreeNode(2);
		//TreeNode three = new TreeNode(3);
		//TreeNode four = new TreeNode(4);
		//TreeNode five = new TreeNode(6);
		root.left = one;
		root.right = two;
		
		Symmetric_Tree_101 s101 = new Symmetric_Tree_101();
		System.out.println(s101.isSymmetric(root));

	}

}
