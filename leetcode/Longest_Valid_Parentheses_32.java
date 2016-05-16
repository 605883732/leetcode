import java.util.Stack;

/*
 * leetcode Longest Valid Parentheses 32 
 * ��С���㷨 ���Ա� problem 9
 */
public class Longest_Valid_Parentheses_32 {
	 public int longestValidParentheses(String s) {
	        char[] array = s.toCharArray();
	        Stack<Integer> stack = new Stack<Integer>(); //���ַ����������
	        int start = -1; // ��ʼƥ��λ��
	        int result = 0;
	        for(int i=0;i<array.length;i++){
	        	if(array[i] == '('){
	        		stack.push(i);
	        	}else{ //������
	        		if(stack.isEmpty()){  //û�п���ƥ���������
	        			start = i;  //������ʼƥ��λ��
	        		}else{
	        			stack.pop();
	        			if(stack.isEmpty()){ //����ƥ����
	        				result = Math.max(result, i-start);
	        			}else{  //ջ�л���Ԫ��
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
