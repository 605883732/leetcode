/*�ж�һ�������Ƿ��л������ҵ��������***/
/*�ÿ���ָ�뷨***/
/*��������ָ���һ�������ĵط��뻷����ʼ��ľ����ͷָ�뵽������ʼ��ľ�����ͬ*****/
public class Linked_List_Cycle_��_142 {
	public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean isCycle = false; //�Ƿ��л�
        while(fast!=null){
        	fast = fast.next;
        	if(fast==null) return null;//�޻�
        	fast = fast.next;
        	slow = slow.next;
        	if(fast==slow) {
        		isCycle = true;
        		break;
        	}
        }
        if(isCycle==false) return null;//�޻�
        while(head!=fast){
        	head=head.next;
        	fast=fast.next;
        }
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
