import java.util.ArrayList;
import java.util.Arrays;

/**
 * �ϲ�K���������������ϲ��ٶȿ�
 * @author root
 *
 */
public class Merge_k_Sorted_Lists_23 {
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists == null || lists.length == 0) return null;
		int m = lists.length; //���鳤��
		int temp_len = 0;
		while(m > 1){
			temp_len = 0;
			if( m % 2 == 0){ //m��ż���������ϲ�����
				for(int i=0;i<m-1;i=i+2){
					lists[temp_len] = merge(lists[i],lists[i+1]);
					temp_len ++;
				}
				m = temp_len;
			}else{  //m�����������һ�������ó���
				for(int i=0;i<m-1;i=i+2){
					lists[temp_len] = merge(lists[i],lists[i+1]);
					temp_len ++;
				}
				lists[temp_len] = lists[m-1];
				m = temp_len + 1;
			}
		}
        return lists[0];
    }
	
	ListNode merge(ListNode a,ListNode b){
		ListNode dummy = new ListNode(-1);
		ListNode head = dummy;
		while(a != null && b!= null){
			if(a.val < b.val ){
				head.next = a;
				a = a.next;
				
			}else{
				head.next = b;
				b = b.next;
			}
			head = head.next;
			head.next = null;
		}
		ListNode p = a!=null?a:b;
		head.next = p;
		return dummy.next;
	}
}
