
public class Unique_paths_Ⅱ_63 {

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if(obstacleGrid==null || obstacleGrid[0][0]==1) return 0;
		int nrows =obstacleGrid.length;//行数
    	int ncols = obstacleGrid[0].length;//列数
    	if(obstacleGrid[nrows-1][ncols-1]==1) return 0; //终点有障碍物
    	int [][]result = new int[nrows][ncols];
    	result[0][0]=1;
    	  /*填满第一行***/
	      for(int i=1;i<ncols;i++) {
	    	  if(obstacleGrid[0][i]!=1){
	    		  result[0][i]=1;  
	    	  }
	    	  else {
	    		  result[0][i]=0;
	    		  for(int k=i+1;k<ncols;k++){
		    		result[0][k]=0;  
		    	  }
	    		  break;
	    	  }
	    	 
	      }
	      /*填满第一列**********/
	      for(int i=1;i<nrows;i++) {
	    	  if(obstacleGrid[i][0]!=1){
	    		  result[i][0]=1;  
	    	  }
	    	  else{
	    		  result[i][0]=0;
	    		  for(int k=i+1;k<nrows;k++){
			    		result[k][0]=0;  
			    	  }
	    		  break;
	    	  }
	    	  
	      }
	      for(int i=1;i<nrows;i++){
	    	  for(int j=1;j<ncols;j++){
	    		  if(obstacleGrid[i][j]!=1){
	    			  result[i][j]=result[i-1][j]+result[i][j-1];  /*递归表达式****/
	    		  }
	    		  else result[i][j]=0;
	    		  
	    	  }
	      }
	  
    	return result[nrows-1][ncols-1];
    }
	public static void main(String[] args) {
		Unique_paths_Ⅱ_63 u = new Unique_paths_Ⅱ_63();
		int a[][] ={{0,0,0},{0,1,0},{0,0,0}};
		System.out.println(u.uniquePathsWithObstacles(a));

	}

}
