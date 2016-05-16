/*本题其实关键是递推过程的分析，n个点中每个点都可以作为root，
 * 当 i 作为root时，小于 i  的点都只能放在其左子树中，
 * 大于 i 的点只能放在右子树中，
 * 此时只需求出左、右子树各有多少种，二者相乘即为以 i 作为root时BST的总数。****/
/*用动态规划解***/
public class Unique_Binary_Search_Trees_96 {
	 public int numTrees(int n) {
		 if(n<=1) return 1;
	     int result[] = new int[n+1];
	     result[0]=1;
	     result[1]=1;
	    for(int i=2;i<=n;i++){
	    	for(int j=1;j<=i;j++){
	    		result[i]+=result[j-1]*result[i-j]; /*j-1表示在j左边的节点数， i-j表示在j右边的节点数***/
	    	}
	    	
	    }
	     
	     return result[n];
	 }
	public static void main(String[] args) {
		Unique_Binary_Search_Trees_96 u96 = new Unique_Binary_Search_Trees_96();
		System.out.println(u96.numTrees(4));

	}

}
