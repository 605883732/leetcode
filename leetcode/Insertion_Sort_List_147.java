/*������ʹ�ò�������***/
/*����һ����ͷ�ڵ�***/
/*���ֿ��ܻ�ı�head���������ⶼ�½�һ����ͷ�ڵ㣬�����Ͳ��ø�head��***/
public class Insertion_Sort_List_147 {
	public ListNode insertionSortList(ListNode head) {
       ListNode fake = new ListNode(0); //��ͷ�ڵ�
      ListNode current = head;//��ǰҪ����Ľڵ�
      ListNode next;
      while(current!=null){
    	  //System.out.println(current.val);
    	  next = current.next;
    	  ListNode l = fake;
    	  /*��Ѱ����λ��**/
    	  while(l.next!=null&&l.next.val<current.val){
    		  l = l.next;
    	  }
    	  
    	  /*����****/
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
