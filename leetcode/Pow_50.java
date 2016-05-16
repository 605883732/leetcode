/*ʵ��pow(x,n)****/
public class Pow_50 {
	public double myPow(double x, int n) {
		if(n==0) return 1;
		double result[] = new double[50];
		result[0] = 1;
		result[1] = x;
		double temp[] = new double [50];/*������double,��������***/
		temp[0]=0;
		temp[1]=1;
		double n_abs = Math.abs((double)n);//���뽫nת��Ϊdouble��ȡ����ֵ����Ϊ��Сintȡ����ֵ�����
		/*ע�⣺��Сint:-2147483648   ���int:2147483647  �ǲ�һ����****/
		for(int i=2;;i++){
			result[i] = result[i-1]*result[i-1];
			temp[i] =temp[i-1]*2;
			if(temp[i]==n_abs) {
				if(n>0) return result[i];
				else return 1.0/result[i];
			}
			if(temp[i]>n_abs) {
				
				int sum = 0;
				double answer = 1;
				for(int k=i-1;k>=1;k--){
					sum+=temp[k];
					
					if(sum==n_abs){
						answer *= result[k];
						if(n>0) return answer;
						else return 1.0/answer;
					}else if(sum>n_abs){
						sum-=temp[k];
						
					}else{
						answer *= result[k];
					}
				}
				break;
			}
			
		}
		
		return 0;
		
	
	}
	
	public static void main(String[] args) {
		Pow_50  p50 = new Pow_50();
		System.out.println(p50.myPow(1,-2147483648));

	}

}
