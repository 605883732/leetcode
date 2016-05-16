import java.util.ArrayList;
import java.util.List;


public class Spiral_Matrix_54 {

	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if(matrix==null || matrix.length==0) return result;
        int i=0;//行
        int j=0;//列
        int nrow = matrix.length;
        int ncol = matrix[0].length;
        int total = nrow*ncol;//节点总数
        int sum = 0;
        int direct = 1; /*方向，1代表向右，2代表向下，3代表向左，4代表向上****/
        int start = 0;
        while(true){
        	if(direct==1){//向右
        		if(j==ncol){ //向右结束，开始向下
        			j=j-1;
        			i=i+1;
        			direct=2;
        			continue;
        		}
        		result.add(matrix[i][j]);
            	sum++;
            	if(sum==total) break;
            	j++;
        	}
        	if(direct==2){//向下
        		if(i==nrow){ //向下结束，开始向左
        			i--;
        			j--;
        			direct=3;
        			continue;
        		}
        		result.add(matrix[i][j]);
            	sum++;
            	if(sum==total) break;
            	i++;
        	}
        	if(direct==3){//向左
        		if(j<start){ //向左结束，开始向上
        			j++;
        			i--;
        			direct=4;
        			continue;
        		}
        		result.add(matrix[i][j]);
            	sum++;
            	if(sum==total) break;
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
        		result.add(matrix[i][j]);
            	sum++;
            	if(sum==total) break;
            	i--;
        	}
        	
        }
       return result;
    }
	public static void main(String[] args) {
		Spiral_Matrix_54 s54 = new Spiral_Matrix_54();
		int a[][]={{1,3,4},{2,5,6}};
		List<Integer>ss =s54.spiralOrder(a);
		for(int i=0;i<ss.size();i++)
			System.out.print(ss.get(i)+"　");

	}

}
