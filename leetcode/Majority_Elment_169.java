/*�ҵ�һ�������г��ֳ���һ�������ĳ����������������ض�����*****/
/**
	 * ����ɾ������
	 * ÿ��ɾ��������ͬ���������ܰ������������Ƶ��������ô����ʣ�µ������ԭ���Ƶ�����ֵ�Ƶ��һ��������50%
	 * @param nums
	 * @return
	 */
public class Majority_Elment_169 {
    
	public int majorityElement(int[] nums) {
    	int houxuan = 0; //��ѡ��
    	int count = 0; //��ѡ������
    	for(int i=0;i<nums.length;i++){
    		if(count == 0){
    			houxuan = nums[i];
    			count ++;
    		}else{
    			if(nums[i] == houxuan){
    				count ++;
    			}else{
    				count --; //�൱��ɾ����һ����ѡ���͵�ǰ��
    			}
    		}
    	}
    	return houxuan;
    }
	public static void main(String[] args) {
		int a[]={3,1,1,1,1,5};
		Majority_Elment_169 m = new Majority_Elment_169();
		int result = m.majorityElement(a);
		System.out.println(result);

	}

}
