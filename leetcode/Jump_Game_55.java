
public class Jump_Game_55 {
	/*̰�Ĳ��ԣ�ÿ���ߵ���һ�����ߵ���Զ�ĵ�***/
	public boolean canJump(int[] nums) {
        if(nums.length <=1) return true;
        	int i=0;
        	while(i<nums.length-1){
        		if(nums[i]==0) return false; //�ߵ�ֻ����0���ĵط�
        		if(i+nums[i]>=nums.length-1) return true;
        		int temp = 0;
        		int max = -1;
        		for(int j=i+1;j<=i+nums[i];j++){
        			if(nums[j]+(j-i)>=max){/*̰��**/
        				temp = j;
        				max= nums[j]+(j-i);
        			}
        		}
        		i = temp;
        	}
        	return false;
        	
       
    }
	public static void main(String[] args) {
		Jump_Game_55 j55 = new Jump_Game_55();
		int nums[]={3,2,1,0,4};
		System.out.println(j55.canJump(nums));

	}

}
