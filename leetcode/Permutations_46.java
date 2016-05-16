import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

import org.w3c.dom.ls.LSException;

/*���ݷ����ݼ�*****/
public class Permutations_46 {
	public List<List<Integer>> permute(int[] nums) {
	   if(nums.length==0) return null; //������
	   List<List<Integer>> result = new ArrayList<List<Integer>>();//�����ս��
	   List<Integer> each = new ArrayList<Integer>(); //һ�����
	   each.add(nums[0]);
	   result.add(each);
	   if(nums.length==1) return result; //������鳤��Ϊ1��ֻ��1�����
	   for(int i=1;i<nums.length;i++){
		   List<List<Integer>> result_temp = new ArrayList<List<Integer>>();
		   for(List<Integer>item:result){
			   for(int j=0;j<=item.size();j++){/*�ѵ�ǰԪ�ز嵽item��ÿ����϶***/
				   List<Integer> temp = new ArrayList<Integer>();
				   temp.addAll(item);
				   temp.add(j, nums[i]); /*��nums[i]�嵽λ��j,����Ԫ�غ���**/
				   result_temp.add(temp);
			   }
		   }
		   result = result_temp;
	   }
	   return result;
	}
	public static void main(String[] args) {
		Permutations_46 p46 = new Permutations_46();
		int nums[]={1,2,3};
		List<List<Integer>> l =p46.permute(nums);
		for(int i=0;i<l.size();i++){
			for(int j=0;j<l.get(i).size();j++){
				System.out.print(l.get(i).get(j)+" ");
			}
			System.out.println();
		}
		

	}

}
