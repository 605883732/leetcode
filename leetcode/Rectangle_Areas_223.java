
public class Rectangle_Areas_223 {

	 public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
	        int width1 = C-A;//��һ�����ο�
	        int height1 = D-B;//��һ�����θ�
	        
	        int width2 = G-E;//�ڶ������ο�
	        int height2 =  H-F;//�ڶ������θ�
	        
	        int area1 = width1*height1;
	        int area2 = width2*height2;
	  
	        /*���ཻ���**/
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
