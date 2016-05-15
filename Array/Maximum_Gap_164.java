

/*
 * leetcode Maximum Gap 164
 * 数组排序后的最大间隔，桶的思想
 */
public class Maximum_Gap_164 {
	class Bucket{
		boolean valid =false;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
	}
	public int maximumGap(int[] nums) {
		if(nums == null || nums.length < 2) return 0;
        int min = nums[0];
        int max = nums[1];
        /*算出最大最小值**/
        for(int i=0;i<nums.length;i++){
        	min = Math.min(nums[i], min);
        	max = Math.max(nums[i], max);
        }
        /*确定桶的数目 = 数字个数**/
        int num_buc = nums.length;
        
        /*桶的间隔**/
        int distance = (max - min) / num_buc + 1;
        
        /*创建num_buc个桶**/
        Bucket b_arr[] = new Bucket[num_buc];
        for(int i=0;i<num_buc;i++)
        	b_arr[i] = new Bucket();
        for(int i=0;i<nums.length;i++){
        	int n = (nums[i] - min) / distance ; //桶号（从0开始）
        	b_arr[n].valid = true;
        	b_arr[n].max = Math.max(b_arr[n].max, nums[i]);
        	b_arr[n].min = Math.min(b_arr[n].min, nums[i]);
        	
        }
        /*后面一个有效桶的最小值 - 前面一个有效桶的最大值*/
        int result = 0;
        for(int i=0;i<b_arr.length - 1;i++){
        	if(b_arr[i].valid == false){ //该桶内无数据
        		continue;
        	}
        	for(int j=i+1;j<b_arr.length;j++){
        		if(b_arr[j].valid == true){
        			result = Math.max(result, b_arr[j].min - b_arr[i].max);
        			break;
        		}
        	}
        }
        return result;
        
    }
	
	
}


