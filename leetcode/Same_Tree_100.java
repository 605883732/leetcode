/*�����������****/
public class Same_Tree_100 {

	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true; /*��������ڵ��Ϊnull***/
        else if((p==null&&q!=null) ||(p!=null&&q==null)) return false;/*1��Ϊnull,1����Ϊnull****/
        else if(p.val==q.val) {/*���߾���Ϊnull����ֵ���****/
        	boolean left =isSameTree(p.left,q.left);
        	boolean right = isSameTree(p.right, q.right);
        	if(left==true && right == true) return true;
        	else return false;
        }else return false;/*���߾���Ϊnull,ֵ��ͬ*****/
        
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		TreeNode one = new TreeNode(0);
		Same_Tree_100 s100 = new Same_Tree_100();
		System.out.println(s100.isSameTree(root, one));

	}

}
