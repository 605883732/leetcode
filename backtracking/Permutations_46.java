import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

import org.w3c.dom.ls.LSException;

/*回溯法求幂集*****/
public class Permutations_46 {
	public List<List<Integer>> permute(int[] nums) {
	   if(nums.length==0) return null; //空数组
	   List<List<Integer>> result = new ArrayList<List<Integer>>();//存最终结果
	   List<Integer> each = new ArrayList<Integer>(); //一条结果
	   each.add(nums[0]);
	   result.add(each);
	   if(nums.length==1) return result; //如果数组长度为1，只有1个结果
	   for(int i=1;i<nums.length;i++){
		   List<List<Integer>> result_temp = new ArrayList<List<Integer>>();
		   for(List<Integer>item:result){
			   for(int j=0;j<=item.size();j++){/*把当前元素插到item的每个间隙***/
				   List<Integer> temp = new ArrayList<Integer>();
				   temp.addAll(item);
				   temp.add(j, nums[i]); /*把nums[i]插到位置j,后面元素后移**/
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
