/*分治法加二分搜索****/
public class Search_a_2D_matrix_Ⅱ_240 {

	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix==null) return false;
		int nrow = matrix.length;//行数
        int ncol = matrix[0].length;//列数
        int low[] = {0,0};
        int high[]={nrow-1,ncol-1};
        boolean flag =search(matrix,target,low,high);
        return flag;
    }
	boolean search(int[][] matrix,int target,int low[],int high[]){
		int nrow = matrix.length;//行数
        int ncol = matrix[0].length;//列数
        if(!(low[0]>=0&&low[1]>=0&&low[0]<nrow&&low[1]<ncol)) return false;
        if(!(high[0]>=0&&high[1]>=0&&high[0]<nrow&&high[1]<ncol)) return false;

		int a =low[0]+(high[0]-low[0])/2;
    	int b = low[1]+(high[1]-low[1])/2;
    	int mid[] = {a,b};
    	boolean flag1;
    	boolean flag2;
    	boolean flag3;
    	
    	int s[] = new int[2];
		int ss[] = new int[2];
		if(low[0]<=high[0] && low[1]<=high[1]){
	        	if(matrix[mid[0]][mid[1]]==target) return true;
	        	else if(matrix[mid[0]][mid[1]]<target){
	        		s[0]=low[0];s[1]=mid[1]+1;
	        		ss[0]=mid[0];ss[1]=high[1];
	        		flag1 = search(matrix,target,s,ss);
	        		s[0]=mid[0]+1;s[1]=mid[1]+1;
	        		ss[0]=high[0];ss[1]=high[1];
	        		flag2 = search(matrix,target,s,ss);
	        		s[0]=mid[0]+1;s[1]=low[1];
	        		ss[0]=high[0];ss[1]=mid[1];
	        		flag3= search(matrix,target,s,ss);
	        		if(flag1||flag2||flag3) return true;
	        		else return false;
	        	}else if(matrix[mid[0]][mid[1]]>target){
	        		s[0]=low[0];s[1]=mid[1];
	        		ss[0]=mid[0]-1;ss[1]=high[1];
	        		flag1 = search(matrix,target,s,ss);
	        	
	        		s[0]=low[0];s[1]=low[1];
	        		ss[0]=mid[0]-1;ss[1]=mid[1]-1;
	        		flag2 = search(matrix,target,s,ss);
	        		s[0]=mid[0];s[1]=low[1];
	        		ss[0]=high[0];ss[1]=mid[1]-1;
	        		flag3= search(matrix,target,s,ss);
	        		if(flag1||flag2||flag3) return true;
	        		else return false;
	        	}
	        } 
	       return false;
	}
	public static void main(String[] args) {
		int matrix[][]={{14}};
		Search_a_2D_matrix_Ⅱ_240 s240 = new Search_a_2D_matrix_Ⅱ_240();
		System.out.println(s240.searchMatrix(matrix, 14));

	}

}
