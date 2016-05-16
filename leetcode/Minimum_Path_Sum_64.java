/*动态规划***/
public class Minimum_Path_Sum_64 {

    public int minPathSum(int[][] grid) {
    	if(grid ==null) return 0;
    	int ncols = grid[0].length;//列数
    	int nrows =grid.length;//行数
        int [][] result = new int[nrows][ncols];
        result[0][0] = grid[0][0];
        /*填满两边*****/
        for(int i=1;i<ncols;i++){
        	result[0][i] = result[0][i-1]+grid[0][i];
        }
        for(int i=1;i<nrows;i++){
        	result[i][0] = result[i-1][0]+grid[i][0];
        }
       
        /*填中间*******/
        for(int i=1;i<nrows;i++){
        	for(int j=1;j<ncols;j++){
        		result[i][j] = Math.min(result[i-1][j]+grid[i][j],result[i][j-1]+grid[i][j]);/*递归表达式****/
        	}
        }
        return result[nrows-1][ncols-1];
    }
	public static void main(String[] args) {
		int grid[][]={{1,2,5},{3,2,1}};
		Minimum_Path_Sum_64 m = new Minimum_Path_Sum_64();
		System.out.println(m.minPathSum(grid));

	}

}
