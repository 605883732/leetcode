/*��������ӵ�m����n���ڵ㷴��ԭ�ز�����ֻ�ܱ���һ��***/
public class Reverse_Linked_List_��_92 {

	public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n) return head;//���m==n��ֱ�ӷ���
		int i = 0;
		 ListNode current = head.next;
		 ListNode p = head;
	     ListNode pp;
        /*���m=1;��ֱ�ӽ�ָ�뷴�򣬼�206��*****/
        if(m==1){
        	for(i=m+1;i<=n;i++){
            	pp = current.next;//ppΪcurrent����һ���ڵ�
            	current.next = p; //pΪcurrentǰ��һ���ڵ�
            	p = current;
            	current=pp; 	
            }
        	head.next =current;//�ǵý�ԭ��ͷָ���next�ڵ�ָ��current
        	return p;//����current֮ǰ�Ǹ��ڵ�
        }
        
        /*m>1�����****/
        ListNode pre=head; //��m���ڵ��ǰ��һ���ڵ�
        for(i=1; i<=m;i++){
        	if(i==m-1) break;
        	pre = pre.next;
        }
        ListNode listm = pre.next;//��m���ڵ�
        
        /*����m+1����n���ڵ�ָ�뷴��***/
        current = listm.next;//��ǰҪ����Ľڵ㣬��ʼΪ��m+1���ڵ�
        p = listm;
        for(i=m+1;i<=n;i++){
        	pp = current.next;//ppΪcurrent����һ���ڵ�
        	current.next = p; //pΪcurrentǰ��һ���ڵ�
        	p = current;
        	current=pp; 	
        }
        listm.next = current;//�ǵý���m���ڵ��nextָ��ָ��current
        pre.next = p;//����m���ڵ�ǰ��һ���ڵ��ָ��ָ��currentǰ��һ���ڵ�
        return head;
    }
	public static void main(String[] args) {
		ListNode head = new ListNode(123);
		ListNode one = new ListNode(234);
		ListNode two = new ListNode(345);
		head.next = one;
		one.next = two;
		two.next = null;
		Reverse_Linked_List_��_92 r92 = new Reverse_Linked_List_��_92();
		ListNode a = r92.reverseBetween(head,1,3);
		System.out.println(a.next.next.val);


	}

}
