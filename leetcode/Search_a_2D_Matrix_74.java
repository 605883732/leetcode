
public class Search_a_2D_Matrix_74 {
	public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null) return false;
		int nrow = matrix.length;//行数
        int ncol = matrix[0].length;//列数
        if(matrix[0][0]==target) return true;
        int i = 0;
        while(i<=nrow-1&&matrix[i][0]<=target){
        	i++;
        }
        i=i-1;
        if(i<0) return false;
        int low = 0;
        int high = ncol-1;
        while(low<=high){
        	int mid = low + (high-low)/2;
        	if(matrix[i][mid]==target) return true;
        	else if(matrix[i][mid]<target) low = mid+1;
        	else if(matrix[i][mid]>target) high = mid-1;
        }
        return false;
    }
	public static void main(String[] args) {
		int matrix[][] = {{1}};
		Search_a_2D_Matrix_74 s74 = new Search_a_2D_Matrix_74();
		System.out.println(s74.searchMatrix(matrix, 3));

	}

}
