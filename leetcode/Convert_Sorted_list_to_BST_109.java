import java.util.ArrayList;
import java.util.List;


public class Convert_Sorted_list_to_BST_109 {

	public TreeNode sortedListToBST(ListNode head) {
	      List<Integer> number = new ArrayList<Integer>();
	      if(head==null) return null;
	      while(head!=null){
	    	  number.add(head.val);
	    	  head = head.next;
	      }
	      return dfs(number,0,number.size()-1);
	 }
	TreeNode dfs(List<Integer> number,int start,int end){
		if(start>end) return null;
		int mid = start + (end-start)/2;
		int val = number.get(mid);
		TreeNode node = new TreeNode(val);
		node.left = dfs(number,start,mid-1);
		node.right= dfs(number,mid+1,end);
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
