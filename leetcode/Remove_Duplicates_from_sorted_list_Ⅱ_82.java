
public class Remove_Duplicates_from_sorted_list_Ⅱ_82 {

	public ListNode deleteDuplicates(ListNode head) {
		if(head==null || head.next==null) return head; //空链表或只有一个节点的链表
		 ListNode fake = new ListNode(0);//假头节点
		 fake.next = head;
		 ListNode pre = fake; //当前节点前一个节点
		 ListNode l = fake.next;//当前节点
		 //int compare = fake.next.val; //用于比较重复的值，初始为第一个节点的值
		 while(l.next!=null){
			 if(l.val == l.next.val){ //当前节点和下一个节点重复
				 /*删除重复节点***/
				 /*把从当前节点开始所有重复节点全部删除****/
				 int temp = l.val;
				 while(l!=null && temp==l.val ){
					 l = l.next;
				 }
				 pre.next =l; 
			 }else{  //不是重复节点
			     l = l.next;
			     pre =pre.next; 
			 }
			if(l==null) break;
		 }
		 
		 return fake.next;
		 
		
    }
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(1);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(4);
		ListNode six = new ListNode(5);
		head.next = one;
		one.next = two;
		two.next = null;
		three.next = four;
		four.next =five;
		five.next =six;
		Remove_Duplicates_from_sorted_list_Ⅱ_82 r82 = new Remove_Duplicates_from_sorted_list_Ⅱ_82();
	    ListNode tt = r82.deleteDuplicates(head);
	    while(tt!=null){
			System.out.println(tt.val);
			tt=tt.next;
		}
	}

}
