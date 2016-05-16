/*一次遍历，倒转一个单链表***/
/*让所有指针反向****/
class ListNode {
     int val;
     ListNode next;
    ListNode(int x) { val = x; }
 }
public class Reverse_LInked_List_206 {

	 public ListNode reverseList(ListNode head) {
		 if(head==null) return null;
		 if(head.next==null) return head;
	     ListNode p = head;//head 不是指针，是一个节点。所以移动p,head不会动
	     ListNode pp = p.next;
	     //stem.out.println(pp.val);
	     p.next = null;
	     ListNode ppp;
	     while(pp!=null){
	    	ppp = pp.next;
	    	pp.next = p;//后面节点的指针指向前面节点
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
