/*һ�α�������תһ��������***/
/*������ָ�뷴��****/
class ListNode {
     int val;
     ListNode next;
    ListNode(int x) { val = x; }
 }
public class Reverse_LInked_List_206 {

	 public ListNode reverseList(ListNode head) {
		 if(head==null) return null;
		 if(head.next==null) return head;
	     ListNode p = head;//head ����ָ�룬��һ���ڵ㡣�����ƶ�p,head���ᶯ
	     ListNode pp = p.next;
	     //stem.out.println(pp.val);
	     p.next = null;
	     ListNode ppp;
	     while(pp!=null){
	    	ppp = pp.next;
	    	pp.next = p;//����ڵ��ָ��ָ��ǰ��ڵ�
	    	//stem.out.println(p.val);
	    	p=pp;
	    	pp = ppp;
	    	
	     }
		 return p;
	  }
	public static void main(String[] args) {
		ListNode head = new ListNode(123);
		ListNode one = new ListNode(234);
		ListNode two = new ListNode(345);
		head.next = one;
		one.next = null;
		two.next = null;
		Reverse_LInked_List_206 rll206 = new Reverse_LInked_List_206();
		ListNode a = rll206.reverseList(head);
		System.out.println(a.val);

	}

}
