/*˼·��������Ҫɾ�������ְ�˳����ڶ���**/
public class Renive_Duplicates_from_sorted_Array_26 {

	public int removeDuplicates(int[] nums) {
        int len  = nums.length;
        if(len==0||len==1) return len;//�������Ϊ1��0,ֱ�ӷ���
        int i =0;
        int current =1;
        int temp =nums[0];
        for(i=1;i<nums.length;i++){
        	if(temp!=nums[i]){/*���������ֲ���Ҫɾ������������ڶ���***/
        		nums[current++] = nums[i];
        		temp = nums[i];
        	}else{/*�����Ҫɾ�������ȼ�1**/
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
