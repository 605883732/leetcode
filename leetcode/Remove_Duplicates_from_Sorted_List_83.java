/*ɾ�����������ظ��ڵ㣬ֻ����һ��***/
public class Remove_Duplicates_from_Sorted_List_83 {

	public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        ListNode pp;
        while(p!=null){
        	pp = p.next;
        	while(pp!=null && pp.val==p.val){
        		pp = pp.next;
        	}
        	p.next = pp;
        	p = p.next;
        }
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
