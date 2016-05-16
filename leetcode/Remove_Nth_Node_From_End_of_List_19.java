
public class Remove_Nth_Node_From_End_of_List_19 {

	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        
		   int len = 0;
	        int d = 0;
	        ListNode p =head;
	        while(p!=null){
	        	len++;
	        	p=p.next;
	        }
	        d = len-n+1;
	        /**如果要删除头节点***/
	        if(d==1){
	        	return head.next;
	        }
	        p=head;
	        ListNode pp = p.next;
	        int i =2;
	        while(i<d){
	        	p=p.next;
	        	pp=pp.next;
	        	i++;
	        }
	        p.next = pp.next;
	        return head;
	    }
	public static void main(String[] args) {
		ListNode head = new ListNode(123);
		ListNode one = new ListNode(234);
		ListNode two = new ListNode(345);
		head.next = one;
		one.next = two;
		two.next = null;
		Remove_Nth_Node_From_End_of_List_19 r19 = new Remove_Nth_Node_From_End_of_List_19();
		ListNode  h = r19.removeNthFromEnd(head, 1);
		System.out.println(h.val);

	}

}
