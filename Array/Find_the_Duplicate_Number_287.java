/*
 * �� First Missing Positive 41����
 */
public class Find_the_Duplicate_Number_287 {
	public int findDuplicate(int[] nums) {
        int m = nums.length; // �� 1 ~ (m-1)
        int start = 0; //�� 0 ~ start -1 �Ѿ�������ȷ������
        int i = 0;
        while(i < m){
        	if(nums[i] == i+1){ //��λ����������ȷ����
        		i ++ ;
        	}else{
        		if(nums[nums[i] - 1] == nums[i]){
        			return nums[i];
        		}else{
        			/*���н���һ��Ҫд�ں��������nums[i]�仯��,����ͳ���**/
        			swap(nums,i,nums[i]-1);  
        		}
        	}
        }
        return 0;
        
    }
	void swap(int nums[],int i,int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public static void main(String[] args) {
		Find_the_Duplicate_Number_287  f287 = new Find_the_Duplicate_Number_287();
		int []arr = {2,1,1};
		System.out.println(f287.findDuplicate(arr));

	}

}
