/*��̬�滮***/
/*ά��һ���ֲ����ֵ���ֲ���Сֵ��***/
public class Maximum_Product_Subarray_152 {
	public int maxProduct(int[] nums) {
		if(nums.length==1) return nums[0];
		int max_local[] = new int[nums.length]; //�ֲ����ֵ�����õ�Ϊ���һ��������ֵ��
        int min_local[] = new int[nums.length];//�ֲ���Сֵ�����õ�Ϊ���һ�������Сֵ��
        max_local[0] = nums[0];
        min_local[0] = nums[0];
        int max = max_local[0];
        for(int i=1;i<nums.length;i++){
        	/*�ֲ����ֵ���ֲ����ֵ*��ǰֵ����ǰֵ���ֲ���Сֵ*��ǰֵ  ����֮������***/
        	max_local[i] = Math.max(Math.max(max_local[i-1]*nums[i],nums[i]),min_local[i-1]*nums[i]);
        	if(max_local[i]>max) max = max_local[i];
        	/*�ֲ���Сֵ���ֲ���Сֵ*��ǰֵ����ǰֵ���ֲ���Сֵ*��ǰֵ  ����֮����С��***/
        	min_local[i] = Math.min(Math.min(max_local[i-1]*nums[i],nums[i]),min_local[i-1]*nums[i]);
        	
        }
        return max;
    }
	public static void main(String[] args) {
		int nums[]={2,-5,-2,-4,3};
		Maximum_Product_Subarray_152 m152 = new Maximum_Product_Subarray_152();
		System.out.println(m152.maxProduct(nums));

	}

}
