import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Binary_Tree_Level_Order_Traversal_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
	    Queue<TreeNode> queue = new LinkedList<TreeNode>();
	    List<List<Integer>> result = new LinkedList<List<Integer>>();
	    List<TreeNode> line = new LinkedList<TreeNode>();
	    if(root==null) return result;
	    queue.offer(root);
	    while(true){
	    	while(!queue.isEmpty()){
	    		line.add(queue.poll());
	    	}
	    	List<Integer> each = new LinkedList<Integer>();
	    	for(int i=0;i<line.size();i++){
	    		each.add(line.get(i).val);
	    		if(line.get(i).left!=null)
	    			queue.offer(line.get(i).left);
	    		if(line.get(i).right!=null)
	    			queue.offer(line.get(i).right);
	    	}
	    	result.add(each);
	    	line.clear();
	    	if(queue.isEmpty()) break;
	    }
	    return result;
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode one = new TreeNode(2);
		TreeNode two = new TreeNode(1);
		root.right = one;
		one.right = two;
		Binary_Tree_Level_Order_Traversal_102 b102 = new Binary_Tree_Level_Order_Traversal_102();
		List<List<Integer>> rs = b102.levelOrder(root);
		for(int i=0;i<rs.size();i++){
			for(int j=0;j<rs.get(i).size();j++){
				System.out.println(rs.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
	}

}
