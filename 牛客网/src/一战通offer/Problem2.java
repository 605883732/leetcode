package 一战通offer;
/*地域划分
 * @author root
 *
 */
public class Problem2 {

	public int[] getPartition(int[][] land, int n, int m) {
        int result[] = new int[2]; //返回的划分位置
        
        int min = 0; //最小与专家不吻合的次数
        int cur = 0; //当前划分与专家不吻合的次数
        int pos = n; //最小划分位置 n,n+1
        //第一次划分在最右边，全A(0)
        for(int j=0;j<land.length;j++){
    		for(int k=0;k<land[0].length;k++){
    			if(land[j][k] != 0){
    				min ++;
    				cur ++;
    			}
    		}
    	}
        //划分位置每次往左一格,则和上一次区别只有1格，变为了B(1)
        for(int i=n-1;i>=0;i--){
        	int temp1 = 0; //在这一点，上次划分与 专家不吻合的次数
        	int temp2 = 0;//在这一点，本次划分与 专家不吻合的次数
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
