/*找到一个数组中出现超过一半次数的某个数，假设这个数必定存在*****/
/**
	 * 两两删除法，
	 * 每次删除两个不同的数（不管包括不包括最高频数），那么，在剩下的数字里，原最高频数出现的频率一样超过了50%
	 * @param nums
	 * @return
	 */
public class Majority_Elment_169 {
    
	public int majorityElement(int[] nums) {
    	int houxuan = 0; //候选数
    	int count = 0; //候选数计数
    	for(int i=0;i<nums.length;i++){
    		if(count == 0){
    			houxuan = nums[i];
    			count ++;
    		}else{
    			if(nums[i] == houxuan){
    				count ++;
    			}else{
    				count --; //相当于删除了一个候选数和当前数
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
