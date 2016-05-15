

/*
 * leetcode Maximum Gap 164
 * �����������������Ͱ��˼��
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
        /*��������Сֵ**/
        for(int i=0;i<nums.length;i++){
        	min = Math.min(nums[i], min);
        	max = Math.max(nums[i], max);
        }
        /*ȷ��Ͱ����Ŀ = ���ָ���**/
        int num_buc = nums.length;
        
        /*Ͱ�ļ��**/
        int distance = (max - min) / num_buc + 1;
        
        /*����num_buc��Ͱ**/
        Bucket b_arr[] = new Bucket[num_buc];
        for(int i=0;i<num_buc;i++)
        	b_arr[i] = new Bucket();
        for(int i=0;i<nums.length;i++){
        	int n = (nums[i] - min) / distance ; //Ͱ�ţ���0��ʼ��
        	b_arr[n].valid = true;
        	b_arr[n].max = Math.max(b_arr[n].max, nums[i]);
        	b_arr[n].min = Math.min(b_arr[n].min, nums[i]);
        	
        }
        /*����һ����ЧͰ����Сֵ - ǰ��һ����ЧͰ�����ֵ*/
        int result = 0;
        for(int i=0;i<b_arr.length - 1;i++){
        	if(b_arr[i].valid == false){ //��Ͱ��������
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


