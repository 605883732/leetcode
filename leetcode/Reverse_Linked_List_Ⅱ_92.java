/*将单链表从第m到第n个节点反序，原地操作，只能遍历一次***/
public class Reverse_Linked_List_Ⅱ_92 {

	public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n) return head;//如果m==n，直接返回
		int i = 0;
		 ListNode current = head.next;
		 ListNode p = head;
	     ListNode pp;
        /*如果m=1;则直接将指针反序，见206题*****/
        if(m==1){
        	for(i=m+1;i<=n;i++){
            	pp = current.next;//pp为current后面一个节点
            	current.next = p; //p为current前面一个节点
            	p = current;
            	current=pp; 	
            }
        	head.next =current;//记得将原来头指针的next节点指向current
        	return p;//返回current之前那个节点
        }
        
        /*m>1的情况****/
        ListNode pre=head; //第m个节点的前面一个节点
        for(i=1; i<=m;i++){
        	if(i==m-1) break;
        	pre = pre.next;
        }
        ListNode listm = pre.next;//第m个节点
        
        /*将第m+1到第n个节点指针反向***/
        current = listm.next;//当前要反向的节点，初始为第m+1个节点
        p = listm;
        for(i=m+1;i<=n;i++){
        	pp = current.next;//pp为current后面一个节点
        	current.next = p; //p为current前面一个节点
        	p = current;
        	current=pp; 	
        }
        listm.next = current;//记得将第m个节点的next指针指向current
        pre.next = p;//将第m个节点前面一个节点的指针指向current前面一个节点
        return head;
    }
	public static void main(String[] args) {
		ListNode head = new ListNode(123);
		ListNode one = new ListNode(234);
		ListNode two = new ListNode(345);
		head.next = one;
		one.next = two;
		two.next = null;
		Reverse_Linked_List_Ⅱ_92 r92 = new Reverse_Linked_List_Ⅱ_92();
		ListNode a = r92.reverseBetween(head,1,3);
		System.out.println(a.next.next.val);


	}

}
