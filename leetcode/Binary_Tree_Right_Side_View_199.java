import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Binary_Tree_Right_Side_View_199 {
	
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<TreeNode> temp  = new LinkedList<TreeNode>();
		if(root==null) return result;
		queue.add(root);
		
		while(true){
			while(!queue.isEmpty()){
				TreeNode a = queue.poll();
				temp.add(a);
			}
			/*把每一层的节点暂时存在一个链表中****/
			if(temp.isEmpty()) break;
			TreeNode last = temp.get(temp.size()-1);
			result.add(last.val);
			for(int i=0;i<temp.size();i++){
				TreeNode left = temp.get(i).left;
				if(left!=null)
				  queue.add(left);
				TreeNode right = temp.get(i).right;
				if(right!=null)
				  queue.add(right);
			}
			temp.clear();
		}
		
         return result;
       
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
