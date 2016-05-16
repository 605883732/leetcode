/*深度优先搜索****/
public class Same_Tree_100 {

	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true; /*如果两个节点均为null***/
        else if((p==null&&q!=null) ||(p!=null&&q==null)) return false;/*1个为null,1个不为null****/
        else if(p.val==q.val) {/*两者均不为null，但值相等****/
        	boolean left =isSameTree(p.left,q.left);
        	boolean right = isSameTree(p.right, q.right);
        	if(left==true && right == true) return true;
        	else return false;
        }else return false;/*两者均不为null,值不同*****/
        
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		TreeNode one = new TreeNode(0);
		Same_Tree_100 s100 = new Same_Tree_100();
		System.out.println(s100.isSameTree(root, one));

	}

}
