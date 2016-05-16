
public class First_Missing_Positive {

	 /*
	 * 把找到的元素放到对应的位置上，如果最终某个元素一直没找到，则该元素为所求
	 */
	public int firstMissingPositive(int[] nums) {
		int finished = 0; // 从1到 finished 已经填到对应位置上了
		int m = nums.length;
		for(int i=0;i<m;i++){
			if(nums[i] == i+1){ // 该位置元素正确
				finished ++;
			}else if(nums[i] < 1 || nums[i] > m || nums[nums[i] -1] == nums[i]){
				/*如果该数小于1，或大于m,或者该数应该在的位置已经存了正确的数，丢弃该数
				 * 快速丢弃方法：把该数和最后一个数交换,数组长度-1**/
				swap(nums,i,m - 1);
				m --;
				i--;/*因为发生了交换，所以要重新考虑当前数,i--，保证下次还是在检查这个数**/
			}else if(nums[i] > i+1 ){ //把该元素交换到正确位置
				swap(nums,nums[i] -1,i);
				i --; /*因为发生了交换，所以要重新考虑当前数,i--，保证下次还是在检查这个数**/
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
