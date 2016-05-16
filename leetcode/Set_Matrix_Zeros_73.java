
public class Set_Matrix_Zeros_73 {
	public void setZeroes(int[][] matrix) {
        int nrow = matrix.length;
        int ncol = matrix[0].length;
        int zero_row[] = new int[nrow];
        int zero_col[] = new int[ncol];
        for(int i=0;i<nrow;i++){
        	for(int j=0;j<ncol;j++){
        		if(matrix[i][j]==0){
        			zero_row[i]=1;
        			zero_col[j]=1;
        		}
        	}
        }
      for(int i=0;i<zero_row.length;i++){
    	  if(zero_row[i]==1){
    		  for(int j=0;j<ncol;j++){
    			  matrix[i][j] = 0;
    		  }
    	  }
      }  
      for(int i=0;i<zero_col.length;i++){
    	  if(zero_col[i]==1){
    		  for(int j=0;j<nrow;j++){
    			  matrix[j][i] = 0;
    		  }
    	  }
      }  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
