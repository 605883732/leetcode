/*ģ��˷�����****/
public class Multiply_Strings_43 {
	public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
		int result[] = new int[len1+len2];//λ�����Ϊlen1+len2
		int jinwei = 0;//����Ľ�λ��
		int i=0;
		int j= 0;
		for(i=num2.length()-1;i>=0;i--){
			jinwei = 0;
			int a = Integer.parseInt(num2.charAt(i)+"");
			for(j=num1.length()-1;j>=0;j--){
				int b = Integer.parseInt(num1.charAt(j)+"");
				int gewei = a*b%10; //����ĸ�λ��
				result[i+j+1] += (gewei + jinwei)%10;
				
				/*��λ�������ֹ���***/
				jinwei = a*b/10+(gewei+jinwei)/10+result[i+j+1]/10;//����Ľ�λ��
				result[i+j+1] = result[i+j+1]%10;
			}
			result[i+j+1] += jinwei;
		}
		if(result[0]==0)
			result[0]+= jinwei;
		/*ȥ���ײ���0***/
		for(i=0;i<result.length;i++){
			if(result[i]!= 0) break;
		}
		String answer = "";
		for(j=i;j<result.length;j++)
			answer+=result[j];
		if(answer.equals("")) //���ǰ��ȫ��0,�ͷ���0
			answer+=0;
		return answer;
		
    }
	public static void main(String[] args) {
		Multiply_Strings_43 m43 = new Multiply_Strings_43();
		System.out.println(m43.multiply("0","0"));

	}

}
