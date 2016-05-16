import java.util.Stack;

/*用两个栈实现一个队列****/
public class Implement_Queue_using_Stacks_232 {
	class MyQueue {
	    Stack<Integer> s1 = new Stack<Integer>();
	    Stack<Integer> s2 = new Stack<Integer>();
	    public void push(int x) {
	        s1.push(x);
	        
	    }

	    public void pop() {
	    	if(s2.isEmpty()){ /*如果s2为空，将s1中的压入s2中，
	    	                                这样s2出栈顺序和s1出栈顺序相反，从而实现了队列**/
	    		             /*****/
	    		while(!s1.isEmpty()){
		        	int a = s1.pop();
		        	s2.push(a);
		        }
	    	} 
	        s2.pop();/*s2不为空时，直接出栈一个元素即可***/
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
