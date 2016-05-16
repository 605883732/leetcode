import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*�ù鲢����������������****/
public class Sort_List_148 {
	 public ListNode sortList(ListNode head) {
	       if(head==null || head.next==null) return head; //����ǿ������ֻ��һ���ڵ㣬��������ֱ�ӷ���
	       /*����ָ�붨λ������м�***/
	       ListNode h1 = head;
	       ListNode h2 = head.next;
	       while(h2.next != null){
	    	   h2=h2.next;
	    	   if(h2.next!=null) h2 = h2.next;
	    	   else break;
	    	   h1 = h1.next;
	       }//���ѭ��������h1Ϊǰ���ĩβ�ڵ�
	       h2 = h1.next; // h2Ϊ���ο�ͷ�ڵ�
	       h1.next = null;//�Ͽ�ǰ��Σ�����
	       h1 = head; //h����Ϊǰ��ο�ͷ�ڵ�
	       
	       /*���Σ��ݹ����****/
	       //System.out.println(h1.val+" "+h2.val);
	       ListNode a1 = sortList(h1);
	       ListNode a2 = sortList(h2);
	       
	       /*merge����****/
	       ListNode result =merge(a1,a2);
	       return result;
	    }
	 
	 ListNode merge(ListNode h1,ListNode h2){
		 ListNode fake = new ListNode(0); //��ͷ�ڵ�
		 fake.next = h1;
		 ListNode t = fake;
		 while(h2!=null) {
			 if(h1==null){ /*h1�ľ�***/
				 t.next = h2; /*��h2����h1֮��****/
				 break;
			 }
			 
			 /*��h2�Ľڵ����h1֮��****/
			 if(h2.val<h1.val){ 
				 ListNode temp = h2.next;
				 t.next = h2;
				 t = t.next; /*h1��ǰ�ȽϽڵ��ǰһ���ڵ�***/
				 h2.next = h1;
				 h2 = temp; 
			 }else{
				 h1 = h1.next;
				 t = t.next;
			 }
		 }
		 return fake.next;
	 }
	public static void main(String[] args) {
		ListNode head = new ListNode(5);
		ListNode one = new ListNode(3);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(4);
		ListNode four = new ListNode(6);
		head.next = one;
		one.next = two;
		two.next =three;
		three.next =four;
		Sort_List_148 s148 = new Sort_List_148();
		ListNode s = s148.sortList(head);
		while(s!=null){
			System.out.println(s.val);
			s=s.next;
		}
	}

}
