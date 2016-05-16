
public class Product_of_Array_Except_Self_238 {
	/*��ǰ���ֵ������ǰ���ֵ�����������ֵ***/
	/*�����������鼴��***/
	public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int temp = 1;
        /*��һ�α��������ÿ����ǰ��ֵ�ĳ˻�***/
        for(int i=0;i<nums.length;i++){
        	result[i] = temp;
        	temp*=nums[i];
        }
        temp = 1;
        /*�ڶ��α��������ÿ�������ֵ�ĳ˻�***/
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
