import java.util.LinkedList;
import java.util.Queue;


public class Implement_Stack_using_Queues_225 {
	class MyStack{
		Queue<Integer> queue = new LinkedList<Integer>();
		public void push(int x) {
	        queue.offer(x);
	    }

	    // Removes the element on top of the stack.
	    public void pop() {
	    	/*将队首元素取出，放入队尾，直到出来最后一个元素，即为栈顶**/
	    	int temp = 1;
	    	int size = queue.size();
	        while(temp<size){
	        	temp++;
	        	int a = queue.poll();
	        	queue.offer(a);
	        }
	        queue.poll();
	    }

	    // Get the top element.
	    public int top() {
	    	int temp = 1;
	    	int size = queue.size();
	    	 while(temp<size){
	    		 temp++;
	         	int a = queue.poll();
	         	queue.offer(a);
	         }
	        int result =  queue.peek();
	        
	        /*查看完栈顶后恢复原状**/
	        int a = queue.poll();
	         	queue.offer(a);
	        
	    	 return result;
	    }

	    // Return whether the stack is empty.
	    public boolean empty() {
	        return queue.isEmpty();
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
