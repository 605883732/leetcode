
public class Partition_List_86 {
	public ListNode partition(ListNode head, int x) {
	        ListNode less =null;
	        ListNode less_head =null;
	        ListNode larger = null;
	        ListNode larger_head =null;
	        ListNode p =head;
	        if(head==null || head.next==null) return head;//����������ֻ��һ���ڵ㣬ֱ�ӷ���
	        while(p!=null){
	        	if(p.val<x){
	        		if(less==null) {
	        			less=p;
	        			less_head=p;
	        		}
	        		else {
	        			less.next = p;
	        			less = p;
	        		}
	        	}else{
	        		if(larger==null) {
	        			larger = p;
	        			larger_head = p;
	        		}
	        		else {
	        			larger.next = p;
	        			larger = p;
	        		}
	        	}
	        	p=p.next;
	        }
	        /*��β***/
	        if(larger!=null){
	        	 larger.next =null;
	        }
	       if(less!=null){
	    	   less.next = null;
	       }
	        /*���û�б�xС�Ľڵ㡣�ͷ��ر�x��Ľڵ�����***/
	        if(less_head==null){
	        	return larger_head;
	        }
	        /*��xС�ĺͱ�x���������***/
	       less.next =larger_head;
	       return less_head;
    }
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(3);
		ListNode three = new ListNode(2);
		ListNode four = new ListNode(5);
		ListNode five = new ListNode(2);
		head.next = one;
		one.next = null;
		two.next =three;
		three.next = four;
		four.next = five;
		five.next =null;
		Partition_List_86 p86 = new Partition_List_86();
		ListNode p = p86.partition(head, 0);
		while(p!=null){
			System.out.println(p.val);
			p=p.next;
		}
		
		
	}

}
