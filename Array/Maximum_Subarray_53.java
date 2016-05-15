import java.util.ArrayList;

/*��һ���������飬�ҵ�����һ��������ĺ����****/
/*��̬�滮�ķ���*****/
/*˼�룺���������϶���ĳ����Ϊ��β�����������µݹ�˼��****/
/*�Ե�ǰ��Ϊ��β�����ֵ= max(��ǰһ����Ϊ��β�����ֵ+��ǰ���ֵ ,��ǰ���ֵ)******/
public class Maximum_Subarray_53 {
	public int maxSubArray(int[] nums) {
        int max[] = new int[nums.length];
        max[0] = nums[0];
        int result = max[0];
		for(int i=1;i<nums.length;i++){
    	   max[i] = Math.max(nums[i], nums[i]+max[i-1]); /*�ݹ���ʽ*****/
    	   if(max[i]>result) result =max[i];
       }
		return result;
	}
	public static void main(String[] args) {
		Maximum_Subarray_53 m = new Maximum_Subarray_53();
		int nums[]= {8,-19,5,-4,20};
		System.out.println(m.maxSubArray(nums));
	}

}
