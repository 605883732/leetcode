import java.util.ArrayList;
import java.util.List;


public class Gray_Code_89 {
	List<Integer> result = new ArrayList<Integer>();
	public List<Integer> grayCode(int n) {
			result.add(0);
	       if(n==0){
	    	   return result;
	       }
		   StringBuffer init = new StringBuffer();
	       for(int i=0;i<n;i++){
	    	   init.append('0');
	       }
	       int temp = 0;
	       //int change = n-1; //当前要改变的位置
	       StringBuffer t;
	       while(result.size()<Math.pow(2,n)){
	    	   for(int i=n-1;i>=0;i--){
	    		   t = changeOne(init,i);
	    		   //System.out.println(t+" "+init);
	    		   temp = Integer.valueOf(t.toString(), 2);
	    		   if(!result.contains(temp)) {
	    			   result.add(temp);
	    			   init = t;
	    			   break;
	    		   }
	    	   }
	    	   
	       }
	       return result;
	 }
	StringBuffer changeOne(StringBuffer s,int location){ //改变字符串的某一位置,0变1，1变0
		StringBuffer ss = new StringBuffer(s);
		if(s.charAt(location)=='0'){
			ss.setCharAt(location, '1');
		}else{
			ss.setCharAt(location, '0');
		}
		return ss;
	}
	public static void main(String[] args) {
		Gray_Code_89 g89 = new Gray_Code_89();
		List<Integer> rs = g89.grayCode(3);
		for(int i=0;i<rs.size();i++){
			System.out.print(rs.get(i)+" ");
		}

	}

}
