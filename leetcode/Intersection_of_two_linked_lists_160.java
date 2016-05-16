/*求两个链表的交叉点***/
public class Intersection_of_two_linked_lists_160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB== null) return null; //如果有链表为空，则不可能有交点
		/*将链表B接在链表A后面****/
        ListNode l = headA;
        while(l.next!=null){
        	l=l.next;
        }
		l.next = headB;
		/*则交叉点为链表A的环的入口节点***/
		
		/*先用快慢指针发判断是否有环****/
		ListNode fast = headA;
		ListNode slow = headA;
		while(fast!=null){
			fast = fast.next;
			if(fast==null) {
				l.next=null;/*题目中要求保存原有链表结构，所以判断好后要把先前连接的地方断开****/
				return null; //无环
			}
			fast = fast.next;
			if(fast==null) {
				l.next=null;/*题目中要求保存原有链表结构，所以判断好后要把先前连接的地方断开****/
				return null;//无环
			}
			slow = slow.next;
			if(fast==slow) break;
		}
		/*沿快慢指针相遇点往下走，和沿头指针往下走，相遇出为环的入口节点****/
		while(headA!=fast){
			headA = headA.next;
			fast = fast.next;
		}
		l.next=null;/*题目中要求保存原有链表结构，所以判断好后要把先前连接的地方断开****/
		return fast;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
