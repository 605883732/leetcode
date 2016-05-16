/*思路，将不需要删除的数字按顺序放在队首**/
public class Renive_Duplicates_from_sorted_Array_26 {

	public int removeDuplicates(int[] nums) {
        int len  = nums.length;
        if(len==0||len==1) return len;//如果长度为1或0,直接返回
        int i =0;
        int current =1;
        int temp =nums[0];
        for(i=1;i<nums.length;i++){
        	if(temp!=nums[i]){/*如果这个数字不需要删除。则把他放在队首***/
        		nums[current++] = nums[i];
        		temp = nums[i];
        	}else{/*如果需要删除，长度减1**/
        		 len--;
        	}
        }
        return len;
    }
	public static void main(String[] args) {
		int nums[]={1,1,2,3,4,4,5};
		Renive_Duplicates_from_sorted_Array_26 r26 = new Renive_Duplicates_from_sorted_Array_26();
		int len =r26.removeDuplicates(nums);
		for(int i=0;i<len;i++){
			System.out.print(nums[i]+" ");
		}
	}

}
