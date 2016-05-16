
public class Rectangle_Areas_223 {

	 public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
	        int width1 = C-A;//第一个矩形宽
	        int height1 = D-B;//第一个矩形高
	        
	        int width2 = G-E;//第二个矩形宽
	        int height2 =  H-F;//第二个矩形高
	        
	        int area1 = width1*height1;
	        int area2 = width2*height2;
	  
	        /*不相交情况**/
	        if(C<=E) return area1+area2;
	        if(G<=A) return area1+area2;
	        if(D<=F) return area1+area2;
	        if(H<=B) return area1+area2;
	        
	        int width=Math.min(C,G)-Math.max(A,E);
	        int height=Math.min(D,H)-Math.max(B,F);
	        return area1-width*height+area2;
 	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle_Areas_223 r223 = new Rectangle_Areas_223();
		System.out.println(r223.computeArea(-1500000001, 0, -1500000000, 1, 1500000000, 0, 1500000001, 1));
	}

}
