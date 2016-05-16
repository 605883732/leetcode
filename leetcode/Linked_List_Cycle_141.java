/*判断一个链表是否有环****/
/*两个指针同时指向头节点，一个每次走1步，一个每次走2步，如果有环，他们会交汇****/
public class Linked_List_Cycle_141 {

	public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null||head.next.next==null) return false;//空链表和只有一个元素或只有两个元素且不含环的链表
        ListNode fir = head;//第一个指针
        ListNode sec = head;//第二个指针
        while(sec.next !=null) {
        	fir = fir.next;//走1步
        	sec = sec.next.next;//走2步
        	if(sec==null) return false;
        	if(fir==sec) return true;
        	
        }
		return false;
    }
	public static void main(String[] args) {
		ListNode head = new ListNode(123);
		ListNode one = new ListNode(234);
		ListNode two = new ListNode(345);
		head.next = one;
		one.next = null;
		two.next = head;
		Linked_List_Cycle_141 lls141 = new Linked_List_Cycle_141();
		System.out.println(lls141.hasCycle(head));
		

	}

}
