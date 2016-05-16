import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Binary_Tree_level_order_Traversal_II_107 {
	 public List<List<Integer>> levelOrderBottom(TreeNode root) {
         Queue<TreeNode> queue = new LinkedList<TreeNode>();
	      List<List<Integer>> result = new ArrayList<List<Integer>>();
	      if(root == null) return result;
	      queue.add(root);
	       int level = 1; /*当前层**/
	      int num = 1;/*当前层节点数***/
	       while(!queue.isEmpty()){
	    	   ArrayList<Integer> each = new ArrayList<Integer>();
	    	   int next_num = 0; /*计算下一层节点数**/
	    	   
	    	   for(int i=0;i<num;i++){
    			   TreeNode temp = queue.poll();
    			   each.add(temp.val);
    			   if(temp.left != null){
    				   queue.add(temp.left);
    				   next_num ++;
    			   }
    			   if(temp.right != null){
    				   queue.add(temp.right);
    				   next_num ++;
    			   }	    			   
    		   }
	    	   result.add(0,each);
	    	   num = next_num;
	    	   level ++;
	      }
	      return result;  
    }
}
