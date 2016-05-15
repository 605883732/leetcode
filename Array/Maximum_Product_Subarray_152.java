/*动态规划***/
/*维护一个局部最大值表，局部最小值表***/
public class Maximum_Product_Subarray_152 {
	public int maxProduct(int[] nums) {
		if(nums.length==1) return nums[0];
		int max_local[] = new int[nums.length]; //局部最大值表，即该点为最后一个点的最大值表
        int min_local[] = new int[nums.length];//局部最小值表，即该点为最后一个点的最小值表
        max_local[0] = nums[0];
        min_local[0] = nums[0];
        int max = max_local[0];
        for(int i=1;i<nums.length;i++){
        	/*局部最大值：局部最大值*当前值，当前值，局部最小值*当前值  三者之中最大的***/
        	max_local[i] = Math.max(Math.max(max_local[i-1]*nums[i],nums[i]),min_local[i-1]*nums[i]);
        	if(max_local[i]>max) max = max_local[i];
        	/*局部最小值：局部最小值*当前值，当前值，局部最小值*当前值  三者之中最小的***/
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
