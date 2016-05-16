/*方法：求1+2+3+...n, 减去所给数组的和，即为丢失的数据***/
public class Missing_Number_268 {
	public int missingNumber(int[] nums) {
        int temp = 0;
        for(int i=0;i<nums.length;i++)
        	temp+=nums[i];
        int total = ((nums.length+1)*nums.length)/2;
        return total - temp;
    }
	public static void main(String[] args) {
		int []nums={0,1,3};
		Missing_Number_268 m268 = new Missing_Number_268();
		System.out.println(m268.missingNumber(nums));

	}

}
