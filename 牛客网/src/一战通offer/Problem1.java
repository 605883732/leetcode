package 一战通offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/*字符串变形***/
/*
 * 例子 ： "this is  a"-> "A  IS THIS"
 *       "he is  "->"  IS HE"
 */
public class Problem1 {
	public  String trans(String s, int n) {
		Stack<Character> stack = new Stack<Character>();
		StringBuffer result = new StringBuffer();
		for(int i=s.length()-1;i>=0;i--){ //从后往前遍历
			char c = s.charAt(i);
			if(c != ' '){ //不是空格就入栈
				stack.push(c);
			}else{ //遇到空格把栈中元素全部取出
				while(!stack.isEmpty()){
					char temp = stack.pop();
					if(Character.isLowerCase(temp))
						temp = Character.toUpperCase(temp);
					else
						temp = Character.toLowerCase(temp);
					result.append(temp);
				}
				result.append(" "); //结果中加上空格
			}
		}
		//退出循环后，如果栈中还有元素，取出
		while(!stack.isEmpty()){
			char temp = stack.pop();
			if(Character.isLowerCase(temp))
				temp = Character.toUpperCase(temp);
			else
				temp = Character.toLowerCase(temp);
			result.append(temp);
		}
		return result.toString();
     }
	void helper(char[] arr,int start,int end){
		
	}
	public static void main(String[] args) {
		Problem1 p1 = new Problem1();
		String s = "he is  ";
		System.out.println(p1.trans(s,6));

	}

}
