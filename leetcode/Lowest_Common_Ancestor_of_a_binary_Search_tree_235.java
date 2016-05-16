/*在二叉查找树中找最近共同祖先***/
public class Lowest_Common_Ancestor_of_a_binary_Search_tree_235 {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        /*如果两个点在根的两边，根就是最近祖先***/
        if(p.val>=root.val&&q.val<=root.val) return root; 
        if(p.val<=root.val&&q.val>=root.val) return root;
        
        if(p.val>root.val&&q.val>root.val)
        	return lowestCommonAncestor(root.right , p, q); //在右子树中找
        if(p.val<root.val&&q.val<root.val)
        	return lowestCommonAncestor(root.left , p, q); //在左子树中找
        
        return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
