package һսͨoffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/*�ַ�������***/
/*
 * ���� �� "this is  a"-> "A  IS THIS"
 *       "he is  "->"  IS HE"
 */
public class Problem1 {
	public  String trans(String s, int n) {
		Stack<Character> stack = new Stack<Character>();
		StringBuffer result = new StringBuffer();
		for(int i=s.length()-1;i>=0;i--){ //�Ӻ���ǰ����
			char c = s.charAt(i);
			if(c != ' '){ //���ǿո����ջ
				stack.push(c);
			}else{ //�����ո��ջ��Ԫ��ȫ��ȡ��
				while(!stack.isEmpty()){
					char temp = stack.pop();
					if(Character.isLowerCase(temp))
						temp = Character.toUpperCase(temp);
					else
						temp = Character.toLowerCase(temp);
					result.append(temp);
				}
				result.append(" "); //����м��Ͽո�
			}
		}
		//�˳�ѭ�������ջ�л���Ԫ�أ�ȡ��
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
