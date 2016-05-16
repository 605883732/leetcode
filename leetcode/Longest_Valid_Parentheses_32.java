import java.util.Stack;

/*
 * leetcode Longest Valid Parentheses 32 
 * 见小象算法 线性表 problem 9
 */
public class Longest_Valid_Parentheses_32 {
	 public int longestValidParentheses(String s) {
	        char[] array = s.toCharArray();
	        Stack<Integer> stack = new Stack<Integer>(); //存字符数组的索引
	        int start = -1; // 起始匹配位置
	        int result = 0;
	        for(int i=0;i<array.length;i++){
	        	if(array[i] == '('){
	        		stack.push(i);
	        	}else{ //右括号
	        		if(stack.isEmpty()){  //没有可以匹配的左括号
	        			start = i;  //更新起始匹配位置
	        		}else{
	        			stack.pop();
	        			if(stack.isEmpty()){ //正好匹配完
	        				result = Math.max(result, i-start);
	        			}else{  //栈中还有元素
	        				int temp = stack.peek();
	        				result = Math.max(result, i-temp);
	        			}
	        		}
	        	}
	        }
	        return result;
	        
	        
	 }
	 public static void main(String[] args) {
		 Longest_Valid_Parentheses_32 l32 = new Longest_Valid_Parentheses_32();
		 System.out.println(l32.longestValidParentheses("()()"));
	 }
}
