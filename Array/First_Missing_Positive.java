
public class First_Missing_Positive {

	 /*
	 * ���ҵ���Ԫ�طŵ���Ӧ��λ���ϣ��������ĳ��Ԫ��һֱû�ҵ������Ԫ��Ϊ����
	 */
	public int firstMissingPositive(int[] nums) {
		int finished = 0; // ��1�� finished �Ѿ����Ӧλ������
		int m = nums.length;
		for(int i=0;i<m;i++){
			if(nums[i] == i+1){ // ��λ��Ԫ����ȷ
				finished ++;
			}else if(nums[i] < 1 || nums[i] > m || nums[nums[i] -1] == nums[i]){
				/*�������С��1�������m,���߸���Ӧ���ڵ�λ���Ѿ�������ȷ��������������
				 * ���ٶ����������Ѹ��������һ��������,���鳤��-1**/
				swap(nums,i,m - 1);
				m --;
				i--;/*��Ϊ�����˽���������Ҫ���¿��ǵ�ǰ��,i--����֤�´λ����ڼ�������**/
			}else if(nums[i] > i+1 ){ //�Ѹ�Ԫ�ؽ�������ȷλ��
				swap(nums,nums[i] -1,i);
				i --; /*��Ϊ�����˽���������Ҫ���¿��ǵ�ǰ��,i--����֤�´λ����ڼ�������**/
			}
		}
		return finished + 1;
    }
	void swap(int nums[],int i,int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
