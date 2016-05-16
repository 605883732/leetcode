import java.util.ArrayList;
import java.util.List;


public class Spiral_Matrix_54 {

	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if(matrix==null || matrix.length==0) return result;
        int i=0;//��
        int j=0;//��
        int nrow = matrix.length;
        int ncol = matrix[0].length;
        int total = nrow*ncol;//�ڵ�����
        int sum = 0;
        int direct = 1; /*����1�������ң�2�������£�3��������4��������****/
        int start = 0;
        while(true){
        	if(direct==1){//����
        		if(j==ncol){ //���ҽ�������ʼ����
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
        	if(direct==2){//����
        		if(i==nrow){ //���½�������ʼ����
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
        	if(direct==3){//����
        		if(j<start){ //�����������ʼ����
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
        	if(direct==4){//����
        		if(i<=start){ //���Ͻ�������ʼ����
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
			System.out.print(ss.get(i)+"��");

	}

}
