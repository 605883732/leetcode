
public class Rotate_List_61 {

	 public ListNode rotateRight(ListNode head, int k) {
	        int len = 0; //链表长度
	        if(head==null) return null;
	        ListNode l = head;
	        while(l!=null){
	        	len++;
	        	if(l.next!=null){
	        		l = l.next;
	        	}
	        	else{
	        		l.next = head;
	        		break;  //首尾相连
	        	}
	        }
	       
	       /*在正确的地方断开环***/
	        int len2 = len - (k%len);
	        int i=1;
	        ListNode l2 = head;
	        while(i!=len2){
	        	l2 = l2.next;
	        	i++;
	        }
	        ListNode l3 = l2.next;
	        l2.next = null;
	        return l3;
	 }
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode one = new ListNode(2);
		ListNode two = new ListNode(3);
		ListNode three = new ListNode(4);
		ListNode four = new ListNode(5);
		head.next = one;
		one.next = two;
		two.next =null;
		three.next =four;
		Rotate_List_61 r61 = new Rotate_List_61();
		ListNode answer = r61.rotateRight(head, 3);
		
		while(answer!=null){
			System.out.println(answer.val);
			answer = answer.next;
		}

	}

}
