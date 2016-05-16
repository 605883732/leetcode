
public class Single_Number_Ⅱ_137 {
	/*   int 数据共有32位，可以用32变量存储 这 N 个元素中各个二进制位上  1  出现的次数，
	 * 最后 在进行 模三 操作，如果为1，那说明这一位是要找元素二进制表示中为 1 的那一位***/
	 public int singleNumber(int[] nums) {
		 int bitone[] = new int[32];/*存储 这 N 个元素中各个二进制位上  1  出现的次数***/
		 int temp = 0;
		 int result = 0;
		 for(int i=0;i<32;i++){
			 for(int j=0;j<nums.length;j++){
				 temp =nums[j]&1;
				 if(temp==1) bitone[31-i]++;
				 nums[j] = nums[j]>>1;
			 }
			 bitone[31-i] = bitone[31-i]%3; 
			 result = result | (bitone[31-i]<<i);
		 }
		 return result;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
