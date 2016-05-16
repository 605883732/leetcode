/*对链表中元素两两交换***/
public class Swap_Nodes_in_Pairs_24 {

	public ListNode swapPairs(ListNode head) {
        ListNode p =head;
        ListNode a;
        ListNode b;
        ListNode c;
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode result =head.next;
        int i=1;
        while(p!=null){
        	if(i%2==1){
        		a=p.next;
            	if(a==null) break;
            	
            	b=p.next.next;
            	if(b==null){
            		p.next = null;
            		a.next = p;
            		break;
            	}
            	c=p.next.next.next;
            	if(c==null){
            		p.next = b;
            		a.next = p;
            		break;
            	}
            	p.next = c;
            	a.next =p;
            	b.next =c.next;
            	c.next =b;
            	p=b;
            	i=i+3;
        	}
          else if(i%2==0){
        	 a=p.next;
        	 if(a==null) break;
        	 b=p.next.next;
        	 if(b==null) break;
        	 p.next=b;
        	 a.next = b.next;
        	 b.next = a;
        	 p=a;
        	 i=i+2;
          }
        	
           
        }
       return result;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
