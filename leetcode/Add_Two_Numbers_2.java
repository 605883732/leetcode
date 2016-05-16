
public class Add_Two_Numbers_2 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null) return null;
		ListNode head = new ListNode(0);
        ListNode l = head;
        int  flag = 0; //是否进位
		while(l1!=null){
        	if(l2!=null){
        		l.val = l1.val+l2.val+flag;
        		if(l.val>=10) {
        			flag = 1;
        			l.val-=10;
        		}else{
        			flag = 0;
        		}
        		l2=l2.next;
        	}else{  //如果l2已经用完
        		l.val = l1.val+flag;
        		if(l.val>=10) {
        			flag = 1;
        			l.val-=10;
        		}else{
        			flag = 0;
        		}	
        		
        	}
        	l1=l1.next;
        	if(l1!=null||l2!=null||flag==1){
        		l.next = new ListNode(0);
            	l = l.next; 
        	} 		
        }
		while(l2!=null){
			l.val = l2.val+flag;
			if(l.val>=10) {
    			flag = 1;
    			l.val-=10;
    		}else{
    			flag = 0;
    		}
    		l2=l2.next;
    		if(l1!=null||l2!=null||flag==1){
        		l.next = new ListNode(0);
            	l = l.next; 
        	} 		
		}
		if(flag==1){
			l.val = 1;
			l.next = null;
		}
		return head;
		
    }
	public static void main(String[] args) {
		Add_Two_Numbers_2 a2 = new Add_Two_Numbers_2();
		ListNode head = new ListNode(1);
		ListNode one = new ListNode(0);
		ListNode two = new ListNode(9);
		head.next = one;
		ListNode answer = a2.addTwoNumbers(head, two);
		while(answer!=null){
			System.out.println(answer.val);
			answer=answer.next;
		}

	}

}
