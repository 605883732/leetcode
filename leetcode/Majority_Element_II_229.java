import java.util.ArrayList;
import java.util.List;

/*找到一个数组中出现超过[1/3n]次数的某个数，假设这个数必定存在*****/
/*
 * 思路和 Majority_Elment_169 一样
 */
public class Majority_Element_II_229 {

	public List<Integer> majorityElement(int[] nums) {
        //两个候选数,
		int houxuan1 = 0; 
        int houxuan2 = 0;
        //候选数计数
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<nums.length;i++){
        	/*下面的顺序可以保证两个候选数不同，则删除的三个数必定不同****/
        	if(nums[i] == houxuan1){ 
         		count1 ++;	
         	}else if(nums[i] == houxuan2){
        		count2 ++;
        	}else if(count1 == 0){
        		houxuan1 = nums[i];
        		count1 ++;
        	}else if(count2 == 0){
        		houxuan2 = nums[i];
        		count2 ++;	
        	}else{
        		count1 --;
        		count2 --;
        	}
        }
        List<Integer> result = new ArrayList<Integer>();
        count1 = 0;
        count2 = 0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i] == houxuan1) count1 ++;
        	if(nums[i] == houxuan2) count2 ++;
        }
        if(count1 > nums.length / 3){
        	result.add(houxuan1);
        }
        if(count2 > nums.length / 3){
        	if(!result.contains(houxuan2)) //防止两个候选数和初始值一样导致相同的情况
        		result.add(houxuan2);
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
