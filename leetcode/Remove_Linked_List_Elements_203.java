/*删除链表中值为val的节点***/
/*建一个假头节点****/
public class Remove_Linked_List_Elements_203 {

	public ListNode removeElements(ListNode head, int val) {
        /*假头指针****/
		ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode l = fake;
        ListNode current = head;
        while(current!=null){	
        	if(current.val == val){
        		l.next = current.next;
        	}else{
        		l =l.next;
        	}
        	current = current.next;
        	
        }
        return fake.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
