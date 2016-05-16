
public class Odd_Even_Linked_List_328 {

	public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode temp1 = odd;
        ListNode temp2 = even;
        int i = 1;
        while(head != null){
        	ListNode post = head.next;
        	if(i % 2 == 1){
        		temp1.next = head;
        		temp1 = temp1.next;
        		temp1.next = null;
        	}else{
        		temp2.next = head;
        		temp2 = temp2.next;
        		temp2.next = null;
        	}
        	head = post;
        	i++;
        }
        temp1.next = even.next;
        return odd.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
