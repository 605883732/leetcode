/*
 * 记忆化搜索 + dfs
 */
public class Longest_Increasing_Path_in_a_Matrix_329 {
	public int longestIncreasingPath(int[][] matrix) {
		if(matrix == null ||matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) return 0;
		int [][]dp = new int[matrix.length][matrix[0].length];/*记忆化搜索，存储从i,j出发的最长上升路径长度**/
		int result = 0;
        for(int i=0;i<matrix.length;i++){
        	for(int j=0;j<matrix[0].length;j++){
        		if(dp[i][j] == 0){ /*只用找dp[i][j] = 0的点，上升序列的起点肯定在里面***/
        			dp[i][j] = dfs(matrix,i,j,dp);
            		result = Math.max(dp[i][j], result);
        		}
        			
        		
        	}
        }
        return result;
    }
	
	int dfs(int [][]matrix,int i,int j,int[][] dp){
		if(dp[i][j] > 0 ) return dp[i][j];
		int left=0,right=0,up=0,down=0;
		if(i-1>=0 && matrix[i-1][j] > matrix[i][j]){
			left = dfs(matrix,i-1,j,dp);
		}
		if(i+1<matrix.length && matrix[i+1][j] > matrix[i][j]){
			right = dfs(matrix,i+1,j,dp);
		}
		
		if(j-1>=0 && matrix[i][j-1] > matrix[i][j]){
			down = dfs(matrix,i,j-1,dp);
		}
		if(j+1<matrix[0].length && matrix[i][j+1] > matrix[i][j]){
			up = dfs(matrix,i,j+1,dp);
		}
		dp[i][j] =  Math.max(Math.max(left,right), Math.max(up,down)) + 1; /*这时可以得到dp[i][j]，避免重复计算**/
		return dp[i][j];
		
	}
	public static void main(String[] args) {
		int num[][] = {{3,4,5},{3,2,6},{2,2,1}};
		Longest_Increasing_Path_in_a_Matrix_329 l329 = new Longest_Increasing_Path_in_a_Matrix_329();
		System.out.println(l329.longestIncreasingPath(num));
	}
}
