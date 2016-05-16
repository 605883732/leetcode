import java.util.ArrayList;
import java.util.List;


public class Binary_Tree_Paths_257 {
	 List<String> result = new ArrayList<String>(); 
	 public List<String> binaryTreePaths(TreeNode root) {
		 dfs(root,"");
		 return result;
	 }
	 void dfs(TreeNode node,String cur){
		 if(node == null) return;
		 if(cur.equals("")){
			 cur = cur+node.val;
		 }else{
			 cur = cur+"->"+node.val;
		 }
		
		 if(node.left ==null && node.right==null){ //Ò¶½Úµã
			 result.add(cur);
			 return;
		 }else{
			 dfs(node.left,cur);
			 dfs(node.right,cur);
		 }
	 }
	public static void main(String[] args) {
		String a ="dsf";
		System.out.println(a+1);

	}

}
