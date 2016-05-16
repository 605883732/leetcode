
public class Remove_Element_27 {
	public int removeElement(int[] nums, int val) {
        int len = nums.length;
        //if(len==0) return 0;
        int i = 0;
        int cur = 0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=val) {/*把不需要删除的元素按顺序放在队首***/
            	nums[cur++] = nums[i];
            }else{
            	len--;
            }
        }
        return len;
    }
	public static void main(String[] args) {
		Remove_Element_27 r27 = new Remove_Element_27();
		int nums[]={};
		System.out.println(r27.removeElement(nums, 4));
	}

}
