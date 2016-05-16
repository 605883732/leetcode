
public class Remove_Duplicates_from_sorted_Array_Ⅱ_80 {

	public int removeDuplicates(int[] nums) {
		int len  = nums.length;
        if(len==0||len==1) return len;//如果长度为1或0,直接返回
        int i =0;
        int current =1;
        int temp =nums[0];
        int a = 1; //用于计数。看重复是否出现了两次
        for(i=1;i<nums.length;i++){
        	if(temp!=nums[i]){/*如果这个数字不需要删除。则把他放在队首***/
        		nums[current++] = nums[i];
        		temp = nums[i];
        		a = 1;//重置
        	}else{
        		 if(a<2){/*如果重复出现少于两次,不要删除**/
        			 nums[current++] = nums[i];
        			 temp = nums[i];
        			 a++;
        			 
        		 }else{
        			 len--;/*如果需要删除，长度减1**/
        			 
        		 }
        		 
        	}
        }
        return len;
    }
	public static void main(String[] args) {
		int nums[]={1,1,1,2,2,3,5};
		Remove_Duplicates_from_sorted_Array_Ⅱ_80 r80 = new Remove_Duplicates_from_sorted_Array_Ⅱ_80();
		int len =r80.removeDuplicates(nums);
		for(int i=0;i<len;i++){
			System.out.print(nums[i]+" ");
		}

	}

}
