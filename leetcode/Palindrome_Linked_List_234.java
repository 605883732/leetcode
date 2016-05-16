import java.util.ArrayList;
import java.util.List;

/*判断一个链表是不是回文***/
public class Palindrome_Linked_List_234 {

	 public boolean isPalindrome(ListNode head) {
	        List<ListNode> array = new ArrayList<ListNode>();
	        while(head!=null){
	        	array.add(head);
	        	head = head.next ;
	        }
	        int len = array.size();
	        int i = 0;
	        while(i<len-1){
	        	if(array.get(i).val != array.get(len-1).val){
	        		return false;
	        	}
	        	i++;
	        	len--;
	        }
	        return true;
	 }
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode one = new ListNode(2);
		ListNode two = new ListNode(3);
		ListNode three = new ListNode(2);
		ListNode four = new ListNode(1);
		head = null;
		
		Palindrome_Linked_List_234 p234 =new Palindrome_Linked_List_234();
		System.out.println(p234.isPalindrome(head));

	}

}
