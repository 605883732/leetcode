
public class Spiral_Matrix_��_59 {

	public int[][] generateMatrix(int n) {
        if(n==0) return new int[0][0];
        int [][]result = new int[n][n];
        int i=0;//��
        int j=0;//��
        int nrow = n;
        int ncol = n;
        int total = n*n;//�ڵ�����
        int direct = 1; /*����1�������ң�2�������£�3��������4��������****/
        int start = 0;
        int cur = 1;
        while(true){
        	if(direct==1){//����
        		if(j==ncol){ //���ҽ�������ʼ����
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
        	if(direct==2){//����
        		if(i==nrow){ //���½�������ʼ����
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
        	if(direct==3){//����
        		if(j<start){ //�����������ʼ����
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
        		result[i][j]=cur;
        		cur++;
            	if(cur>total) break;
            	i--;
        	}
        	
        }
        return result;
    }
	public static void main(String[] args) {
		Spiral_Matrix_��_59 s59 = new Spiral_Matrix_��_59();
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
