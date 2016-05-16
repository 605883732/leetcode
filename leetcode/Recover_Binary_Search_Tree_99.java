import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Recover_Binary_Search_Tree_99 {
	List<TreeNode> mis = new ArrayList<TreeNode>();
	public void recoverTree(TreeNode root) {
      dfs(root);
      int array[] = new int[mis.size()];
      for(int i=0;i<array.length;i++){
    	  array[i] = mis.get(i).val;
      }
      Arrays.sort(array);
      for(int i=0;i<array.length;i++){
    	  if(array[i] != mis.get(i).val){
    		  mis.get(i).val = array[i];
    	  }
      }
       
    }
	void dfs(TreeNode node){ //ÖÐ¸ù±éÀú
		if(node==null) return;
		dfs(node.left);
		mis.add(node);
		dfs(node.right);
		
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode one = new TreeNode(2);
		TreeNode two = new TreeNode(1);
		root.right = one;
		one.right = two;
		Recover_Binary_Search_Tree_99 r99 = new Recover_Binary_Search_Tree_99();
		r99.recoverTree(root);
		System.out.println(root.val+" "+" "+root.right.val);

	}

}
