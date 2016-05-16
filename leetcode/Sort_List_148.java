import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*用归并排序对链表进行排序****/
public class Sort_List_148 {
	 public ListNode sortList(ListNode head) {
	       if(head==null || head.next==null) return head; //如果是空链表或只有一个节点，不用排序，直接返回
	       /*快慢指针定位链表的中间***/
	       ListNode h1 = head;
	       ListNode h2 = head.next;
	       while(h2.next != null){
	    	   h2=h2.next;
	    	   if(h2.next!=null) h2 = h2.next;
	    	   else break;
	    	   h1 = h1.next;
	       }//这个循环结束后h1为前半段末尾节点
	       h2 = h1.next; // h2为后半段开头节点
	       h1.next = null;//断开前半段，后半段
	       h1 = head; //h更改为前半段开头节点
	       
	       /*分治，递归调用****/
	       //System.out.println(h1.val+" "+h2.val);
	       ListNode a1 = sortList(h1);
	       ListNode a2 = sortList(h2);
	       
	       /*merge过程****/
	       ListNode result =merge(a1,a2);
	       return result;
	    }
	 
	 ListNode merge(ListNode h1,ListNode h2){
		 ListNode fake = new ListNode(0); //假头节点
		 fake.next = h1;
		 ListNode t = fake;
		 while(h2!=null) {
			 if(h1==null){ /*h1耗尽***/
				 t.next = h2; /*将h2连在h1之后****/
				 break;
			 }
			 
			 /*将h2的节点插在h1之后****/
			 if(h2.val<h1.val){ 
				 ListNode temp = h2.next;
				 t.next = h2;
				 t = t.next; /*h1当前比较节点的前一个节点***/
				 h2.next = h1;
				 h2 = temp; 
			 }else{
				 h1 = h1.next;
				 t = t.next;
			 }
		 }
		 return fake.next;
	 }
	public static void main(String[] args) {
		ListNode head = new ListNode(5);
		ListNode one = new ListNode(3);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(4);
		ListNode four = new ListNode(6);
		head.next = one;
		one.next = two;
		two.next =three;
		three.next =four;
		Sort_List_148 s148 = new Sort_List_148();
		ListNode s = s148.sortList(head);
		while(s!=null){
			System.out.println(s.val);
			s=s.next;
		}
	}

}
