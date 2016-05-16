import java.util.ArrayList;
import java.util.Arrays;

/**
 * 合并K个排序链表：两两合并速度快
 * @author root
 *
 */
public class Merge_k_Sorted_Lists_23 {
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists == null || lists.length == 0) return null;
		int m = lists.length; //数组长度
		int temp_len = 0;
		while(m > 1){
			temp_len = 0;
			if( m % 2 == 0){ //m是偶数，两两合并即可
				for(int i=0;i<m-1;i=i+2){
					lists[temp_len] = merge(lists[i],lists[i+1]);
					temp_len ++;
				}
				m = temp_len;
			}else{  //m是奇数，最后一个单独拿出来
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
