import java.util.ArrayList;

/*对一个整形数组，找的它的一个子数组的和最大****/
/*动态规划的方法*****/
/*思想：最大字数组肯定以某个点为结尾，所以有如下递归思想****/
/*以当前点为结尾的最大值= max(以前一个点为结尾的最大值+当前点的值 ,当前点的值)******/
public class Maximum_Subarray_53 {
	public int maxSubArray(int[] nums) {
        int max[] = new int[nums.length];
        max[0] = nums[0];
        int result = max[0];
		for(int i=1;i<nums.length;i++){
    	   max[i] = Math.max(nums[i], nums[i]+max[i-1]); /*递归表达式*****/
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
