/*对链表使用插入排序***/
/*利用一个假头节点***/
/*这种可能会改变head的链表问题都新建一个假头节点，这样就不用改head了***/
public class Insertion_Sort_List_147 {
	public ListNode insertionSortList(ListNode head) {
       ListNode fake = new ListNode(0); //假头节点
      ListNode current = head;//当前要插入的节点
      ListNode next;
      while(current!=null){
    	  //System.out.println(current.val);
    	  next = current.next;
    	  ListNode l = fake;
    	  /*找寻插入位置**/
    	  while(l.next!=null&&l.next.val<current.val){
    		  l = l.next;
    	  }
    	  
    	  /*插入****/
    	  current.next = l.next;
    	  l.next = current;
    	  current = next;
    	  //System.out.println(fake.next.val); 
      }
     
      return fake.next ;
        
    }
	
	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		ListNode one = new ListNode(2);
		ListNode two = new ListNode(4);
		head.next = one;
		one.next = two;
		two.next = null;
		Insertion_Sort_List_147 i147 = new Insertion_Sort_List_147();
		ListNode s = i147.insertionSortList(head);
		while(s!=null){
			System.out.println(s.val);
			s=s.next;
		}

	}

}
