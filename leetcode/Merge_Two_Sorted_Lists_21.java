/*�ϲ�����������õ������ϲ����������Ȼ����****/
public class Merge_Two_Sorted_Lists_21 {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        /*�������һ��Ϊ�գ�������һ��***/
		if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head;//Ҫ���ص�ͷָ��
        ListNode current;
        /*ѡֵС��Ϊͷ�ڵ�****/
        if(l1.val<l2.val) {
        	head =l1;
        	l1 = l1.next;
        }
        else {
        	head =l2;
        	l2=l2.next;
        }
        current = head;
        while(l1!=null){
        	while(l2!=null){
        		if(l1.val<l2.val){
        			break;
        		}
        		else {
        			current.next =l2;
        			current = current.next;
        			l2=l2.next;
        		}
        	}
        	current.next = l1;
        	current = current.next;
			l1=l1.next;
        }
        current.next = l2; //���l2�������null,����Ϊnull
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
