
public class Game_of_Life_289 {
	public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
        		int nei_live = count(board,i,j); //邻居中活着的个数
        		if(board[i][j] == 0 || board[i][j] == 2){  //原来是死的
        			if(nei_live == 3){ 
        				board[i][j] = 2;//死的下一轮变成活的记为2 
        			}
        		}else{  //原来是活的
        			if(nei_live <2 || nei_live >3){
        				board[i][j] = 3; //活的下一轮变成死的记为3
        			}
        		}
        	}
        }
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
        		if(board[i][j] == 2) board[i][j] =1;
        		if(board[i][j] == 3) board[i][j] =0;
        	}
        }
    }
	int count(int [][] board,int i,int j){
		int m = board.length;
        int n = board[0].length;
		int temp = 0;
		int result = 0;
		if(i - 1 >= 0){
			temp = board[i-1][j];
			result += (temp==1||temp==3?1:0);
		}
		if(i+1 < m){
			temp = board[i+1][j];
			result += (temp==1||temp==3?1:0);
		}
		
		if(i - 1>=0 && j-1 >=0){
			temp = board[i-1][j-1];
			result += (temp==1||temp==3?1:0);
		}
		if(i+1 < m && j +1 < n){
			temp = board[i+1][j+1];
			result += (temp==1||temp==3?1:0);
		}
		
		if(j-1 >= 0){
			temp = board[i][j-1];
			result +=(temp==1||temp==3?1:0);
		}
		if(j+1 < n){
			temp = board[i][j+1];
			result += (temp==1||temp==3?1:0);
		}
		
		if(i+1 < m && j -1 >=0){
			temp = board[i+1][j-1];
			result += (temp==1||temp==3?1:0);
		}
		if(i-1 >=0 && j +1 <n){
			temp = board[i-1][j+1];
			result += (temp==1||temp==3?1:0);
		}
		return result;
	}
}
