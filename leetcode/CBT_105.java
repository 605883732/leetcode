/*����һ���������������������������ߺ������������������У�������Ψһ��ȷ��һ����***/
/*˼�룺ȷ�������ҵ����������ҵ������������������еݹ飬���������еݹ飬�õ�������***/
public class CBT_105 {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null || inorder ==null) return null; //����
        
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        
    }
	TreeNode build(int[] preorder,int p_start,int p_end, int[] inorder,int i_start,int i_end){
		/*p_start��ʾ�����������㣬p_end��ʾ����������յ�**/
		/*i_start��ʾ�����������㣬i_end��ʾ����������յ�**/
		
		if(!(p_start>=0&&p_end<preorder.length&&p_start<=p_end )) return null; /*���������Χ������ʵ��***/
		if(!(i_start>=0&&i_end<inorder.length&&i_start<=i_end )) return null;
		TreeNode root = new TreeNode(preorder[p_start]); /***��������ĵ�һ���ڵ�Ϊ��***/ 
		/*������������ҵ��ýڵ�***/
		/*��������иýڵ���ߵ������������ýڵ��ұߵ���������***/
		int i=i_start;
		int p_end_temp = p_start;
		int p_start_temp = p_start+1;
        for(i=i_start;i<=i_end;i++){
        	if(inorder[i]==preorder[p_start]) break; /*ע��������p_start����0****/
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
