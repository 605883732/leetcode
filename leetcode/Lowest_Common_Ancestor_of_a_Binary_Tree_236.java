/*在二叉树中找两个节点最近的祖先****/
public class Lowest_Common_Ancestor_of_a_Binary_Tree_236 {
	TreeNode result;
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
				if(root==null) return null;
				if(root==p || root== q) return root;
				boolean f1 =find(root.left,p,q);
				boolean f2 =find(root.right,p,q);
				
				if(f1&&f2) {
					result = root;
				}
				return result;
    }
	boolean find(TreeNode root, TreeNode p, TreeNode q){
		if(root==null) return false;
		if(root==p||root==q) {/*如果该节点为p或q,那么他的后继节点中只要有另一个点，则该点即为所求点****/
			boolean f1 =find(root.left,p,q);
			boolean f2 =find(root.right,p,q);
			if(f1||f2) {
				result = root;/*找到所求点了就返回false,不在找了****/
				return false;
			}
			else return true;
		}else{
			boolean f1 =find(root.left,p,q); /*若p,q分别出现在该点的左右子树中，则该点为所求点**/
			boolean f2 =find(root.right,p,q);
			if(f1&&f2) {
				result = root;
				return false;
			}else if(f1 || f2){ /*若p,q只有一个出现在该点的子树中，则所求点为该点的某个祖先，所以返回true**/
				return true;
			}
			else return false; 
		}
		
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(-1);
		TreeNode one = new TreeNode(0);
		TreeNode two = new TreeNode(3);
		TreeNode three = new TreeNode(-2);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(8);
		TreeNode six = new TreeNode(6);
		root.left = one;
		root.right = two;
		one.left = three;
		one.right = four;
		three.left = five;
		Lowest_Common_Ancestor_of_a_Binary_Tree_236 l236 = new Lowest_Common_Ancestor_of_a_Binary_Tree_236();
		TreeNode re = l236.lowestCommonAncestor(root, five, one);
		System.out.println(re.val);

	}

}
