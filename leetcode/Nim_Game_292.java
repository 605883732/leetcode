
public class Nim_Game_292 {
	/*��֤��һ�����˺�ʣ�µ�ʯ���ܱ�4������һ����Ӯ*/
	 public boolean canWinNim(int n) {
	        int a = (n-1) % 4;
	        int b = (n-2) % 4;
	        int c = (n-3) % 4;
	        
	        if(a ==0 || b==0 || c==0)
	        	return true;
	        else
	        	return false;
	    }
	public static void main(String[] args) {

	}

}
