
public class Rotate_Array_189 {

	public void rotate(int[] nums, int k) {
        int len = nums.length;
        int pos =(len - k%len)%len;
        int temp[] = new int[len];
        for(int i=0;i<len;i++){
        	temp[i] = nums[pos];
        	pos++;
        	pos = pos%len;
        }
        for(int i=0;i<len;i++){
        	nums[i] = temp[i];
        }
       
    }
	public static void main(String[] args) {
		int nums[]={1,2,3,4,5,6,7};
		Rotate_Array_189 r189 = new Rotate_Array_189();
		r189.rotate(nums, 3);
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");

	}

}
