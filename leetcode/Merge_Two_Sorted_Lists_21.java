/*合并两个已排序好的链表，合并后的链表依然按序****/
public class Merge_Two_Sorted_Lists_21 {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        /*如果其中一个为空，返回另一个***/
		if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head;//要返回的头指针
        ListNode current;
        /*选值小的为头节点****/
        if(l1.val<l2.val) {
        	head =l1;
        	l1 = l1.next;
        }
        else {
        	head =l2;
        	l2=l2.next;
        }
        current = head;
        while(l1!=null){
        	while(l2!=null){
        		if(l1.val<l2.val){
        			break;
        		}
        		else {
        			current.next =l2;
        			current = current.next;
        			l2=l2.next;
        		}
        	}
        	current.next = l1;
        	current = current.next;
			l1=l1.next;
        }
        current.next = l2; //如果l2还有则非null,否则为null
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
