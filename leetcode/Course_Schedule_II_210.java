import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 拓扑排序
 * @author root
 *
 */
public class Course_Schedule_II_210 {
	public int[] findOrder(int numCourses, int[][] prerequisites) {
		   Map<Integer, Integer> map = new HashMap<Integer, Integer>(); //存储每个节点的入度
	       Queue<Integer> queue = new LinkedList<Integer>();
	       int result[] = new int[numCourses]; //结果集
	       int pos = 0; //当前结果集中要存元素位置
	       for(int i=0;i<prerequisites.length;i++){ //存储每个点的入度
	    	   if(map.containsKey(prerequisites[i][0])){
	    		   map.put(prerequisites[i][0], map.get(prerequisites[i][0])+1);
	    	   }else{
	    		   map.put(prerequisites[i][0], 1);
	    	   }
	       }
	       
	       for(int i=0;i<numCourses;i++){ //将入度为0的点放入队列
	    	   if(!map.containsKey(i)){
	    		   queue.add(i);
	    	   }
	       }
	       
	       while(!queue.isEmpty()){
	    	   int node = queue.poll();
	    	   result[pos] = node;
	    	   pos ++;
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
	       if(pos < numCourses){  //不能拓扑排序，返回空数组
	    	  return new int[0];
	       }
	       return result;
    }
}
