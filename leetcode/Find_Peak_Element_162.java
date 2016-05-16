/*���ֲ���peak��***/
public class Find_Peak_Element_162 {

	 public int findPeakElement(int[] nums) {
	        int len = nums.length;
	        if(len==1) return 0; 
	        int low = 0;
	        int high = len-1;
	        while(low<high){
	        	int mid = low+(high-low)/2;
	        	if(nums[mid+1]>nums[mid]){ //�ұ���peak��
	        		low = mid+1;
	        	}else if(nums[mid+1]<nums[mid]){
	        		high = mid;  //��߲��Ұ�������������peak��
	        	}	
	        }
	        /*��low=highʱ���Ǹ���������Ҫ�Ľ��****/
	        return low;
	 }
	public static void main(String[] args) {
		int nums[] = {1,2,3,1};
		Find_Peak_Element_162 f162 = new Find_Peak_Element_162();
		System.out.println(f162.findPeakElement(nums));

	}

}
