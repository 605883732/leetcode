/*�����ӣ���̬�滮*****/
public class Climbing_stairs_70 {

	public int climbStairs(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
        int result[] = new int[n+1];
        result[0]=0; //�޽��ݵ�����
        result[1]=1;//1������
        result[2]=2;//2������
        for(int i=3;i<=n;i++){
        	result[i]=result[i-1]+result[i-2];/*�ݹ���ʽ*****/
        }
        return result[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
