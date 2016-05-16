import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * 直方图中最大矩形面积
 * 小象算法 线性表 problem10
 * stack
 */
public class Largest_Rectangle_In_Histogram_84 {

	public int largestRectangleArea(int[] heights) {
		    ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<heights.length;i++)
				list.add(heights[i]);
			list.add(0); // 末尾加0
	        Stack<Integer> stack = new Stack<Integer>(); //stack中存储直方图柱子的索引
	        int result = 0;
	        for(int i=0;i<list.size();){
	        	if(stack.isEmpty() ||  list.get(stack.peek()) <= list.get(i)){
	        		stack.push(i);
	        		i++;
	        	}else {
	        		int temp = stack.peek();
	        		stack.pop();
	        		if(stack.isEmpty()){
	        			result = Math.max(result, list.get(temp)*i);
	        		}else{
	        			result = Math.max(result, list.get(temp)*(i-stack.peek()-1));
	        		}
	        	}
	        }
	        return result;
	}
	public static void main(String[] args) {
		Largest_Rectangle_In_Histogram_84 l84 = new Largest_Rectangle_In_Histogram_84();
		int heights[] = {0,9};
		int rs = l84.largestRectangleArea(heights);
		System.out.println(rs);
	}

}
