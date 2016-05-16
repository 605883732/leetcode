/*判断一个链表是否有环，并找到环的起点***/
/*用快慢指针法***/
/*定理：快慢指针第一次相遇的地方与环的起始点的距离和头指针到环的起始点的距离相同*****/
public class Linked_List_Cycle_Ⅱ_142 {
	public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean isCycle = false; //是否有环
        while(fast!=null){
        	fast = fast.next;
        	if(fast==null) return null;//无环
        	fast = fast.next;
        	slow = slow.next;
        	if(fast==slow) {
        		isCycle = true;
        		break;
        	}
        }
        if(isCycle==false) return null;//无环
        while(head!=fast){
        	head=head.next;
        	fast=fast.next;
        }
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
