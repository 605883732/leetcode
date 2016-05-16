
public class Kth_Smallest_Element_in_a_BST {
	int k = 0;
	int result=0;
	public int kthSmallest(TreeNode root, int k) {
		this.k = k;
	    inorder(root);
	    return result;
	}
	void inorder(TreeNode node){
		if(node==null) return;
		inorder(node.left);
		if(k>1){
			k--;
		}else if(k==1){
			result = node.val;
			k--;
			return;
		}else{
			return;
		}
			
		inorder(node.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
