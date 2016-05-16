/*根据一棵树的先序遍历和中序遍历，或者后序遍历和中序遍历序列，都可以唯一地确定一棵树***/
/*思想：确定根，找到左子树，找到右子树，在左子树中递归，在右子树中递归，得到最后的树***/
public class CBT_105 {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null || inorder ==null) return null; //空树
        
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        
    }
	TreeNode build(int[] preorder,int p_start,int p_end, int[] inorder,int i_start,int i_end){
		/*p_start表示先序遍历的起点，p_end表示先序遍历的终点**/
		/*i_start表示中序遍历的起点，i_end表示中序遍历的终点**/
		
		if(!(p_start>=0&&p_end<preorder.length&&p_start<=p_end )) return null; /*如果遍历范围不符合实际***/
		if(!(i_start>=0&&i_end<inorder.length&&i_start<=i_end )) return null;
		TreeNode root = new TreeNode(preorder[p_start]); /***先序遍历的第一个节点为根***/ 
		/*在中序遍历中找到该节点***/
		/*中序遍历中该节点左边的是左子树，该节点右边的是右子树***/
		int i=i_start;
		int p_end_temp = p_start;
		int p_start_temp = p_start+1;
        for(i=i_start;i<=i_end;i++){
        	if(inorder[i]==preorder[p_start]) break; /*注意这里是p_start不是0****/
        	p_end_temp++;
        	
        }
   
        int i_start_temp = i_start;
        int i_end_temp = i-1;
        //System.out.println(p_start_temp+" "+p_end_temp+" "+i_start_temp+" "+i_end_temp);
        root.left = build(preorder,p_start_temp,p_end_temp,inorder,i_start_temp,i_end_temp);
        p_start_temp = p_end_temp+1;
        p_end_temp = p_end;
        i_start_temp = i_end_temp+2;
        i_end_temp = i_end;
       // System.out.println(p_start_temp+" "+p_end_temp+" "+i_start_temp+" "+i_end_temp);
        root.right =build(preorder,p_start_temp,p_end_temp,inorder,i_start_temp,i_end_temp);
		return root;
	}
	public static void main(String[] args) {
		int a[] ={1,2,3};
		int b[] = {3,2,1};
		CBT_105 c105 = new CBT_105();
		TreeNode result = c105.buildTree(a,b);
		while(result!=null){
			System.out.println(result.val);
			result = result.left ;
		}
	}

}
