
public class Remove_Duplicates_from_sorted_Array_��_80 {

	public int removeDuplicates(int[] nums) {
		int len  = nums.length;
        if(len==0||len==1) return len;//�������Ϊ1��0,ֱ�ӷ���
        int i =0;
        int current =1;
        int temp =nums[0];
        int a = 1; //���ڼ��������ظ��Ƿ����������
        for(i=1;i<nums.length;i++){
        	if(temp!=nums[i]){/*���������ֲ���Ҫɾ������������ڶ���***/
        		nums[current++] = nums[i];
        		temp = nums[i];
        		a = 1;//����
        	}else{
        		 if(a<2){/*����ظ�������������,��Ҫɾ��**/
        			 nums[current++] = nums[i];
        			 temp = nums[i];
        			 a++;
        			 
        		 }else{
        			 len--;/*�����Ҫɾ�������ȼ�1**/
        			 
        		 }
        		 
        	}
        }
        return len;
    }
	public static void main(String[] args) {
		int nums[]={1,1,1,2,2,3,5};
		Remove_Duplicates_from_sorted_Array_��_80 r80 = new Remove_Duplicates_from_sorted_Array_��_80();
		int len =r80.removeDuplicates(nums);
		for(int i=0;i<len;i++){
			System.out.print(nums[i]+" ");
		}

	}

}
