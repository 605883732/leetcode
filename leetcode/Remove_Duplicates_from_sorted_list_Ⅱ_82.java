
public class Remove_Duplicates_from_sorted_list_��_82 {

	public ListNode deleteDuplicates(ListNode head) {
		if(head==null || head.next==null) return head; //�������ֻ��һ���ڵ������
		 ListNode fake = new ListNode(0);//��ͷ�ڵ�
		 fake.next = head;
		 ListNode pre = fake; //��ǰ�ڵ�ǰһ���ڵ�
		 ListNode l = fake.next;//��ǰ�ڵ�
		 //int compare = fake.next.val; //���ڱȽ��ظ���ֵ����ʼΪ��һ���ڵ��ֵ
		 while(l.next!=null){
			 if(l.val == l.next.val){ //��ǰ�ڵ����һ���ڵ��ظ�
				 /*ɾ���ظ��ڵ�***/
				 /*�Ѵӵ�ǰ�ڵ㿪ʼ�����ظ��ڵ�ȫ��ɾ��****/
				 int temp = l.val;
				 while(l!=null && temp==l.val ){
					 l = l.next;
				 }
				 pre.next =l; 
			 }else{  //�����ظ��ڵ�
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
		Remove_Duplicates_from_sorted_list_��_82 r82 = new Remove_Duplicates_from_sorted_list_��_82();
	    ListNode tt = r82.deleteDuplicates(head);
	    while(tt!=null){
			System.out.println(tt.val);
			tt=tt.next;
		}
	}

}
