import java.util.ArrayList;
import java.util.List;

/*�ҵ�һ�������г��ֳ���[1/3n]������ĳ����������������ض�����*****/
/*
 * ˼·�� Majority_Elment_169 һ��
 */
public class Majority_Element_II_229 {

	public List<Integer> majorityElement(int[] nums) {
        //������ѡ��,
		int houxuan1 = 0; 
        int houxuan2 = 0;
        //��ѡ������
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<nums.length;i++){
        	/*�����˳����Ա�֤������ѡ����ͬ����ɾ�����������ض���ͬ****/
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
        	if(!result.contains(houxuan2)) //��ֹ������ѡ���ͳ�ʼֵһ��������ͬ�����
        		result.add(houxuan2);
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
