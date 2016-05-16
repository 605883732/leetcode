/*����������Ľ����***/
public class Intersection_of_two_linked_lists_160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB== null) return null; //���������Ϊ�գ��򲻿����н���
		/*������B��������A����****/
        ListNode l = headA;
        while(l.next!=null){
        	l=l.next;
        }
		l.next = headB;
		/*�򽻲��Ϊ����A�Ļ�����ڽڵ�***/
		
		/*���ÿ���ָ�뷢�ж��Ƿ��л�****/
		ListNode fast = headA;
		ListNode slow = headA;
		while(fast!=null){
			fast = fast.next;
			if(fast==null) {
				l.next=null;/*��Ŀ��Ҫ�󱣴�ԭ������ṹ�������жϺú�Ҫ����ǰ���ӵĵط��Ͽ�****/
				return null; //�޻�
			}
			fast = fast.next;
			if(fast==null) {
				l.next=null;/*��Ŀ��Ҫ�󱣴�ԭ������ṹ�������жϺú�Ҫ����ǰ���ӵĵط��Ͽ�****/
				return null;//�޻�
			}
			slow = slow.next;
			if(fast==slow) break;
		}
		/*�ؿ���ָ�������������ߣ�����ͷָ�������ߣ�������Ϊ������ڽڵ�****/
		while(headA!=fast){
			headA = headA.next;
			fast = fast.next;
		}
		l.next=null;/*��Ŀ��Ҫ�󱣴�ԭ������ṹ�������жϺú�Ҫ����ǰ���ӵĵط��Ͽ�****/
		return fast;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
