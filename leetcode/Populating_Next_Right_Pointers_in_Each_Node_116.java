/*�����������***/
 class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;//Ĭ�ϳ�ʼ��Ϊnull
      TreeLinkNode(int x) { val = x; }
  }
public class Populating_Next_Right_Pointers_in_Each_Node_116 {

	 public void connect(TreeLinkNode root) {
		 if(root==null) return;//���Ϊ�սڵ㣬����
		 TreeLinkNode left = root.left;
		 TreeLinkNode right = root.right;
		 if(left==null) return;//���û������ӣ���Ϊ������������������Ҳû���Ҷ��ӣ�����
		 left.next = right;//����������Ҷ�������
		 TreeLinkNode l = root.next;
		 if(l!=null) right.next =l.left;/*���Ҷ�����ýڵ��next�ڵ�����������***/
	     
		 /*������ȵݹ����****/
		 connect(root.left);
	     connect(root.right);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
