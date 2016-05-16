/*
 * 中序和后序构造二叉树
 */
public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal_106 {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        return dfs(inorder,0,inorder.length - 1,postorder,0,postorder.length - 1);
    }
	TreeNode dfs(int []inorder,int start1,int end1,int[] postorder,int start2,int end2){
		if(start1 > end1 ) return null;
		TreeNode root = new TreeNode(postorder[end2]);
		int pos = 0;
		for(int i= start1;i<=end1;i++){
			if(inorder[i] ==postorder[end2]){
				pos = i;
				break;
			}
		}
		int temp = pos - 1- start1;
		root.left = dfs(inorder,start1,pos-1,postorder,start2,start2+temp);
		root.right = dfs(inorder,pos+1,end1,postorder,start2+temp+1,end2-1);
		return root;
	}
}
