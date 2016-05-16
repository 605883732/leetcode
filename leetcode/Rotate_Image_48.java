
public class Rotate_Image_48 {
	 public void rotate(int[][] matrix) {
		 int n= matrix.length;
		 int u=0;
		 int v=0;
		 int result[][] = new int[n][n];
		 for(int i=n-1;i>=0;i--){
			 for(int j=0;j<n;j++){
				 result[j][i] = matrix[u][v];
				 v++;
			 }
			 u++;
			 v=0;
		 }
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				matrix[i][j] = result[i][j];
			}
		}
	 }
	public static void main(String[] args) {
		int a[][] ={{1,2},{3,4}};
		Rotate_Image_48 r48 = new Rotate_Image_48();
		r48.rotate(a);
		System.out.println(a[0][0]);

	}

}
