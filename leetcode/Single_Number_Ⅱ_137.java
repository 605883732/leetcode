
public class Single_Number_��_137 {
	/*   int ���ݹ���32λ��������32�����洢 �� N ��Ԫ���и���������λ��  1  ���ֵĴ�����
	 * ��� �ڽ��� ģ�� ���������Ϊ1����˵����һλ��Ҫ��Ԫ�ض����Ʊ�ʾ��Ϊ 1 ����һλ***/
	 public int singleNumber(int[] nums) {
		 int bitone[] = new int[32];/*�洢 �� N ��Ԫ���и���������λ��  1  ���ֵĴ���***/
		 int temp = 0;
		 int result = 0;
		 for(int i=0;i<32;i++){
			 for(int j=0;j<nums.length;j++){
				 temp =nums[j]&1;
				 if(temp==1) bitone[31-i]++;
				 nums[j] = nums[j]>>1;
			 }
			 bitone[31-i] = bitone[31-i]%3; 
			 result = result | (bitone[31-i]<<i);
		 }
		 return result;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
