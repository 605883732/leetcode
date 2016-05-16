import java.util.ArrayList;
import java.util.List;


public class Reorder_List_143 {
	public void reorderList(ListNode head) {
			if(head==null||head.next==null) return; //空链表或只有一个节点的链表，直接返回
			List<ListNode> array = new ArrayList<ListNode>();
			ListNode last = head;
			array.add(last);/*把每个节点存在一个数组中****/
	        while(last.next!=null){
	        	last=last.next;
	        	array.add(last);
	        }
	        int len = array.size(); /*节点总数***/
	        int a = 0;
	        for(int i=0;i<len;i++){
	        	a= len -i-1;
	        	if(a>i+1){
	        		ListNode b = array.get(i).next;
		        	array.get(i).next = array.get(a);
		        	array.get(a).next = b;
	        	}else if(a==i+1){
	        		ListNode b = array.get(i).next;
	        		b.next = null;
	        	}else {
	        		array.get(i).next = null;
	        		break;
	        	}
	        	
	        }
	        
	    }
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode one = new ListNode(2);
		ListNode two = new ListNode(3);
		ListNode three = new ListNode(4);
		head.next = one;one.next =two;two.next =null;
		Reorder_List_143 r143 = new Reorder_List_143();
		r143.reorderList(head);
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}

	}

}
