package һսͨoffer;
/*���򻮷�
 * @author root
 *
 */
public class Problem2 {

	public int[] getPartition(int[][] land, int n, int m) {
        int result[] = new int[2]; //���صĻ���λ��
        
        int min = 0; //��С��ר�Ҳ��ǺϵĴ���
        int cur = 0; //��ǰ������ר�Ҳ��ǺϵĴ���
        int pos = n; //��С����λ�� n,n+1
        //��һ�λ��������ұߣ�ȫA(0)
        for(int j=0;j<land.length;j++){
    		for(int k=0;k<land[0].length;k++){
    			if(land[j][k] != 0){
    				min ++;
    				cur ++;
    			}
    		}
    	}
        //����λ��ÿ������һ��,�����һ������ֻ��1�񣬱�Ϊ��B(1)
        for(int i=n-1;i>=0;i--){
        	int temp1 = 0; //����һ�㣬�ϴλ����� ר�Ҳ��ǺϵĴ���
        	int temp2 = 0;//����һ�㣬���λ����� ר�Ҳ��ǺϵĴ���
        	for(int j=0;j<land.length;j++){
        		if(land[j][i] != 0) temp1 ++;
        		if(land[j][i] != 1) temp2 ++;
        	}
        	cur += temp2 - temp1;
        	if(cur <= min){
        		min = cur;
        		pos = i;
        	}
        }
        result[0] = pos;
        result[1] = pos + 1;
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
