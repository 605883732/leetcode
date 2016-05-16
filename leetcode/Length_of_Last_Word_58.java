
public class Length_of_Last_Word_58 {
	public int lengthOfLastWord(String s) {
	        String ss[] =s.split(" ");
	        int result = 0;
	        if(ss.length == 0) return 0;
	        String  n = ss[ss.length-1];
	        //System.out.println(n);
	        n = n.trim();
	        return n.length();
	   }
	public static void main(String[] args) {
		String s =" ";
		Length_of_Last_Word_58 l58 = new Length_of_Last_Word_58();
		System.out.println(l58.lengthOfLastWord(s));

	}

}
