
public class Product_of_Array_Except_Self_238 {
	/*当前点的值等于它前面的值乘以它后面的值***/
	/*遍历两次数组即可***/
	public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int temp = 1;
        /*第一次遍历，求出每个点前面值的乘积***/
        for(int i=0;i<nums.length;i++){
        	result[i] = temp;
        	temp*=nums[i];
        }
        temp = 1;
        /*第二次遍历，求出每个点后面值的乘积***/
        for(int i=nums.length-1;i>=0;i--){
        	result[i]*=temp;
        	temp*=nums[i];
        }
        return result;
    }
	public static void main(String[] args) {
		Product_of_Array_Except_Self_238 p238 = new Product_of_Array_Except_Self_238();
		int nums[]={1,2,3,4};
		int rs[] =p238.productExceptSelf(nums);
		for(int i=0;i<rs.length;i++)
			System.out.print(rs[i]+" ");

	}

}
