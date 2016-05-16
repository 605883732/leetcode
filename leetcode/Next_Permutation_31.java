import java.util.Arrays;


public class Next_Permutation_31 {
	public void nextPermutation(int[] nums) {
        if(nums.length<=1) return;
		for(int i =nums.length-1;i>=1;i--){
        	if(nums[i]>nums[i-1]){/*找到比前面一个数大的位置**/
        		int min = nums[i];
        		int change = i;
        		for(int k=nums.length-1;k>i;k--){/*在这个位置之后找一个最小的数，
        		他也比前面这个数大****/
        			if(nums[k]>nums[i-1]&&nums[k]<min){
        				change = k;
        				min = nums[k];
        			}
        		}
        		/*交换**/
        		int temp = nums[change];
        		nums[change] = nums[i-1];
        		nums[i-1] = temp;
        		Arrays.sort(nums, i, nums.length);
        		return;
        	}
        }
		/*未找到，升序输出***/
		Arrays.sort(nums);
    }
	public static void main(String[] args) {
		Next_Permutation_31 n31 = new Next_Permutation_31();
		int nums[]={1,3,2};
		n31.nextPermutation(nums);
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");

	}

}
