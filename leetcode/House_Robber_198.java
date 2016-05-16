
/*�������⣬��̬�滮****/
public class House_Robber_198 {

    public int rob(int[] nums) {
    	if(nums.length==0) return 0;//���û�з���
    	if(nums.length==1) return nums[0];//���ֻ��1������
        int max[] = new int[nums.length];
        max[0] = nums[0];
        max[1] = Math.max(nums[0],nums[1]);
        int result = Math.max(max[0],max[1]);
        for(int i=2;i<nums.length;i++){
        	max[i] = Math.max(max[i-2]+nums[i],max[i-1]); /*�ݹ���ʽ****/
        	if(max[i]>result) result = max[i];
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
