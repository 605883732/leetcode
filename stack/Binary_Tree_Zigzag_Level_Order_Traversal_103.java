import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Binary_Tree_Zigzag_Level_Order_Traversal_103 {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root==null) return result;
        queue.offer(root);
        int direct = 0; //0代表个方向从左到右，1代表从右到左
        while(true){
        	List<TreeNode> line = new LinkedList<TreeNode>();
        	while(!queue.isEmpty()){
        		TreeNode a = queue.poll();
        		line.add(a);
        	}
        	List<Integer> each = new LinkedList<Integer>();
        	for(int i=0;i<line.size();i++){
        		if(line.get(i).left!=null)
        		   queue.offer(line.get(i).left);
        		if(line.get(i).right!=null)
        		queue.offer(line.get(i).right);
        		if(direct==0) each.add(line.get(i).val);
        		else if(direct==1) each.add(line.get(line.size()-i-1).val);
        	}
        	if(direct==0) direct=1;
        	else direct=0;
        	result.add(each);
        	if(queue.isEmpty()) break;
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
