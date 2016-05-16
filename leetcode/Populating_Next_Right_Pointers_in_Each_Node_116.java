/*深度优先搜索***/
 class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;//默认初始化为null
      TreeLinkNode(int x) { val = x; }
  }
public class Populating_Next_Right_Pointers_in_Each_Node_116 {

	 public void connect(TreeLinkNode root) {
		 if(root==null) return;//如果为空节点，返回
		 TreeLinkNode left = root.left;
		 TreeLinkNode right = root.right;
		 if(left==null) return;//如果没有左儿子，因为是完美二叉树，所以也没有右儿子，返回
		 left.next = right;//将左儿子与右儿子连接
		 TreeLinkNode l = root.next;
		 if(l!=null) right.next =l.left;/*将右儿子与该节点的next节点的左儿子连接***/
	     
		 /*深度优先递归过程****/
		 connect(root.left);
	     connect(root.right);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
