/*�ж�һ�������Ƿ��л�****/
/*����ָ��ͬʱָ��ͷ�ڵ㣬һ��ÿ����1����һ��ÿ����2��������л������ǻύ��****/
public class Linked_List_Cycle_141 {

	public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null||head.next.next==null) return false;//�������ֻ��һ��Ԫ�ػ�ֻ������Ԫ���Ҳ�����������
        ListNode fir = head;//��һ��ָ��
        ListNode sec = head;//�ڶ���ָ��
        while(sec.next !=null) {
        	fir = fir.next;//��1��
        	sec = sec.next.next;//��2��
        	if(sec==null) return false;
        	if(fir==sec) return true;
        	
        }
		return false;
    }
	public static void main(String[] args) {
		ListNode head = new ListNode(123);
		ListNode one = new ListNode(234);
		ListNode two = new ListNode(345);
		head.next = one;
		one.next = null;
		two.next = head;
		Linked_List_Cycle_141 lls141 = new Linked_List_Cycle_141();
		System.out.println(lls141.hasCycle(head));
		

	}

}
