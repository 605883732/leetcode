
public class Reverse_Nodes_in_k_group_25 {
	 public ListNode reverseKGroup(ListNode head, int k) {
		  if(head == null) return head;
	      int len = 0; //������
	      ListNode dummy = head;
	      while(dummy != null){
	    	  len ++;
	    	  dummy = dummy.next;
	      }
	      int times = len / k; // Ҫ�����η�ת
	      
	      /*ͷ�巨���룬�ɼ�С���㷨���̵����Ա���µ�Problem3**/
	      dummy = new ListNode(-1);
	      dummy.next = head;
	      head = dummy;
	      ListNode cur = head.next;
	      ListNode pre = head.next;
	      for(int i=0;i<times;i++){
	    	  for(int j=0;j<k;j++){
	    		  ListNode post = cur.next;
	    		  cur.next = head.next;
	    		  head.next = cur;
	    		  pre.next = post;
	    		  cur = post;
	    	  }
	    	  head = pre;
	    	  pre =head.next;
	    	  cur = head.next;
	      }
	      return dummy.next;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
