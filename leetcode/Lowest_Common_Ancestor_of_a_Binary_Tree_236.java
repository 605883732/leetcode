/*�ڶ��������������ڵ����������****/
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
		if(root==p||root==q) {/*����ýڵ�Ϊp��q,��ô���ĺ�̽ڵ���ֻҪ����һ���㣬��õ㼴Ϊ�����****/
			boolean f1 =find(root.left,p,q);
			boolean f2 =find(root.right,p,q);
			if(f1||f2) {
				result = root;/*�ҵ�������˾ͷ���false,��������****/
				return false;
			}
			else return true;
		}else{
			boolean f1 =find(root.left,p,q); /*��p,q�ֱ�����ڸõ�����������У���õ�Ϊ�����**/
			boolean f2 =find(root.right,p,q);
			if(f1&&f2) {
				result = root;
				return false;
			}else if(f1 || f2){ /*��p,qֻ��һ�������ڸõ�������У��������Ϊ�õ��ĳ�����ȣ����Է���true**/
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
