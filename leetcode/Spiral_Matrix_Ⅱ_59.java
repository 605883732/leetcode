
public class Spiral_Matrix_Ⅱ_59 {

	public int[][] generateMatrix(int n) {
        if(n==0) return new int[0][0];
        int [][]result = new int[n][n];
        int i=0;//行
        int j=0;//列
        int nrow = n;
        int ncol = n;
        int total = n*n;//节点总数
        int direct = 1; /*方向，1代表向右，2代表向下，3代表向左，4代表向上****/
        int start = 0;
        int cur = 1;
        while(true){
        	if(direct==1){//向右
        		if(j==ncol){ //向右结束，开始向下
        			j=j-1;
        			i=i+1;
        			direct=2;
        			continue;
        		}
        		result[i][j] = cur;
            	cur++;
            	if(cur>total) break;
            	j++;
        	}
        	if(direct==2){//向下
        		if(i==nrow){ //向下结束，开始向左
        			i--;
        			j--;
        			direct=3;
        			continue;
        		}
        		result[i][j]=cur;
        		cur++;
            	if(cur>total) break;
            	i++;
        	}
        	if(direct==3){//向左
        		if(j<start){ //向左结束，开始向上
        			j++;
        			i--;
        			direct=4;
        			continue;
        		}
        		result[i][j]=cur;
        		cur++;
            	if(cur>total) break;
            	j--;
        	}
        	if(direct==4){//向上
        		if(i<=start){ //向上结束，开始向右
        			i++;
        			j++;
        			direct=1;
        			nrow--;
        			ncol--;
        			start++;
        			continue;
        		}
        		result[i][j]=cur;
        		cur++;
            	if(cur>total) break;
            	i--;
        	}
        	
        }
        return result;
    }
	public static void main(String[] args) {
		Spiral_Matrix_Ⅱ_59 s59 = new Spiral_Matrix_Ⅱ_59();
		int n = 0;
		int a[][] = s59.generateMatrix(n);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
