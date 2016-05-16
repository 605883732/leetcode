import java.util.Arrays;

/*3sum转为2sum,先固定一个点，另外两个点用two-point**/
public class Sum_Closest_16 {
	public int threeSumClosest(int[] nums, int target) {
		if(nums.length<3) return 0;
        Arrays.sort(nums);//先排序
        int aim = 0;
        int result = Integer.MAX_VALUE; //返回值
        int min_abs =Integer.MAX_VALUE;//和目标的距离
        for(int i=0;i<nums.length-2;i++){
        	aim = target-nums[i];
        	int k =i+1;
        	int j = nums.length-1;
        	int total = nums[k]+nums[j];
        	while(k<j){
        		if(Math.abs(total-aim)<min_abs){
        			result = total+nums[i];
        			min_abs = Math.abs(total-aim);
        		}
        		if(total<aim) {
        			k++;      			
        		}else if(total>=aim){
        			j--;
        		}
        		total =  nums[k]+nums[j];
        	
        	}
        	
        }
        
		return result;
    }
	public static void main(String[] args) {
		Sum_Closest_16 s16 = new Sum_Closest_16();
		int nums[]={1,1,1,0};
		System.out.println(s16.threeSumClosest(nums,100));

	}

}
