
public class Decode_Ways_91 {
	public int numDecodings(String s) {
		int len = s.length();
		if(len==0) return 0;
		int y = Integer.parseInt(s.substring(0,1));
		if(len==1) {
		   if(y>=1&&y<=26){
			   return 1;
		   }else return 0;
		}
        int x = 0;
    	x = Integer.parseInt(s.substring(0,2));
       
        if(len==2){
        	if(y==0){
        		return 0;
        	}else {
        		if(x>=1&&x<=26){
        			if(x%10==0) return 1;
        			else return 2;
        		}else{
        			if(x%10==0) return 0;
        			else return 1;
        		} 
        		
        	}
        	
        }
        int max[] = new int[len];
        if(y>=1&&y<=26){
        	max[0]=1;
        }else max[0]=0;
        if(y==0){
        	max[1]=0;
        }else {
    		if(x>=1&&x<=26){
    			if(x%10==0) max[1]=1;
    			else max[1]=2;
    		}else{
    			if(x%10==0) max[1]=0;
    			else max[1]=1;
    		} 
    		
    	}
       
        for(int i=2;i<len;i++){
        	int yy = Integer.parseInt(s.substring(i-1,i));
        	int a =Integer.parseInt(s.substring(i-1,i+1));/*substring方法不包括结尾***/
        	if(a==0) return 0;
        	if(yy!=0){
            	if(a>=1&&a<=26){
            		if(a%10!=0){
            			max[i]=max[i-1]+max[i-2];
            		}else max[i]=max[i-2];
            		
            	}
            	else {
            		if(a%10==0) return 0;
            		max[i] = max[i-1];
            	}
        	}else{
        		max[i]=max[i-1];
        	}
        	
        }
        return max[len-1];
	}
	public static void main(String[] args) {
		Decode_Ways_91 dw91 =new Decode_Ways_91();
		System.out.println(dw91.numDecodings("101"));
		
	}

}
