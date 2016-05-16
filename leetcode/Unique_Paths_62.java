/*��̬�滮****/
public class Unique_Paths_62 {

	public int uniquePaths(int m, int n) {
          if(m<=0||n<=0) return 0;		
	      int result[][] = new int[m][n];
	      result[0][0]=1;
	      /*������һ��***/
	      for(int i=1;i<n;i++) {
	    	  result[0][i]=1;
	      }
	      /*������һ��**********/
	      for(int i=1;i<m;i++) {
	    	  result[i][0]=1;
	      }
	      /*���м��***********/
	      for(int i=1;i<m;i++){
	    	  for(int j=1;j<n;j++){
	    		  result[i][j] = result[i-1][j]+result[i][j-1]; /*�ݹ���ʽ***/
	    	  }
	      }
	      return result[m-1][n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
