import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * ��������
 * @author root
 *
 */
public class Course_Schedule_207 {
	 public boolean canFinish(int numCourses, int[][] prerequisites) {
	       Map<Integer, Integer> map = new HashMap<Integer, Integer>(); //�洢ÿ���ڵ�����
	       Queue<Integer> queue = new LinkedList<Integer>();
	       int sum = 0;  //�Ѿ�����õĽڵ�
	       
	       for(int i=0;i<prerequisites.length;i++){ //�洢ÿ��������
	    	   if(map.containsKey(prerequisites[i][0])){
	    		   map.put(prerequisites[i][0], map.get(prerequisites[i][0])+1);
	    	   }else{
	    		   map.put(prerequisites[i][0], 1);
	    	   }
	       }
	       
	       for(int i=0;i<numCourses;i++){ //�����Ϊ0�ĵ�������
	    	   if(!map.containsKey(i)){
	    		   queue.add(i);
	    	   }
	       }
	       
	       while(!queue.isEmpty()){
	    	   int node = queue.poll();
	    	   sum ++;
	    	   for(int i=0;i<prerequisites.length;i++){
	    		   if(prerequisites[i][1] == node){
	    			   int rudu = map.get(prerequisites[i][0]);
	    			   rudu --;
	    			   map.put(prerequisites[i][0],rudu);
	    			   if(rudu == 0){
		    			   queue.add(prerequisites[i][0]);
		    		   }
	    		   }
	    	   }
	    	
	       }
	       if(sum == numCourses) return true;
	       return false;
	 }
}
