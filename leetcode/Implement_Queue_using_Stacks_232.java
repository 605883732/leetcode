import java.util.Stack;

/*������ջʵ��һ������****/
public class Implement_Queue_using_Stacks_232 {
	class MyQueue {
	    Stack<Integer> s1 = new Stack<Integer>();
	    Stack<Integer> s2 = new Stack<Integer>();
	    public void push(int x) {
	        s1.push(x);
	        
	    }

	    public void pop() {
	    	if(s2.isEmpty()){ /*���s2Ϊ�գ���s1�е�ѹ��s2�У�
	    	                                ����s2��ջ˳���s1��ջ˳���෴���Ӷ�ʵ���˶���**/
	    		             /*****/
	    		while(!s1.isEmpty()){
		        	int a = s1.pop();
		        	s2.push(a);
		        }
	    	} 
	        s2.pop();/*s2��Ϊ��ʱ��ֱ�ӳ�ջһ��Ԫ�ؼ���***/
	    }

	    // Get the front element.
	    public int peek() {
	    	if(s2.isEmpty()){
	    		while(!s1.isEmpty()){
		        	int a = s1.pop();
		        	s2.push(a);
		        }
	    	}
	        return s2.peek();
	    }

	    // Return whether the queue is empty.
	    public boolean empty() {
	    	return s2.isEmpty() && s1.isEmpty();
	    }
	}
	public static void main(String[] args) {
		Implement_Queue_using_Stacks_232 iqu = new Implement_Queue_using_Stacks_232();

	}

}
