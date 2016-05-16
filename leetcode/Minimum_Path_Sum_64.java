/*��̬�滮***/
public class Minimum_Path_Sum_64 {

    public int minPathSum(int[][] grid) {
    	if(grid ==null) return 0;
    	int ncols = grid[0].length;//����
    	int nrows =grid.length;//����
        int [][] result = new int[nrows][ncols];
        result[0][0] = grid[0][0];
        /*��������*****/
        for(int i=1;i<ncols;i++){
        	result[0][i] = result[0][i-1]+grid[0][i];
        }
        for(int i=1;i<nrows;i++){
        	result[i][0] = result[i-1][0]+grid[i][0];
        }
       
        /*���м�*******/
        for(int i=1;i<nrows;i++){
        	for(int j=1;j<ncols;j++){
        		result[i][j] = Math.min(result[i-1][j]+grid[i][j],result[i][j-1]+grid[i][j]);/*�ݹ���ʽ****/
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
