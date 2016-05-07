import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


public class Min_Stack_155 {
	class MinStack {
		int min = Integer.MAX_VALUE;
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
	    public void push(int x) {
	        stack.push(x);
	        if(x<min) min =x;
	    }

	    public void pop() {
	    	int a =stack.pop();
	    	if(a==min){ //如果最小元素被删除了，重新找最小的
	    		min=Integer.MAX_VALUE;
	    		while(!stack.isEmpty()){
	    			int temp = stack.pop();
	    			if(temp<min) min = temp;
	    			stack2.push(temp);
	    		}
	    		while(!stack2.isEmpty()){
	    			int temp = stack2.pop();
	    			stack.push(temp);
	    		}
	    	}
	    }

	    public int top() {
	        return stack.peek();
	    }

	    public int getMin() {
	        return min;
	    }
	}
	public static void main(String[] args) {
	

	}

}
