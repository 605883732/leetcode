/*�ڶ�����������������ͬ����***/
public class Lowest_Common_Ancestor_of_a_binary_Search_tree_235 {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        /*����������ڸ������ߣ��������������***/
        if(p.val>=root.val&&q.val<=root.val) return root; 
        if(p.val<=root.val&&q.val>=root.val) return root;
        
        if(p.val>root.val&&q.val>root.val)
        	return lowestCommonAncestor(root.right , p, q); //������������
        if(p.val<root.val&&q.val<root.val)
        	return lowestCommonAncestor(root.left , p, q); //������������
        
        return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
