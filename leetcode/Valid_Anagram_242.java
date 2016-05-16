import java.util.Arrays;

/*判断两个字符串组成元素是否完全相同，只是顺序可能不同*****/
public class Valid_Anagram_242 {
	/*对两个字符串中的字符进行排序，排完序后再进行比较***/
    public boolean isAnagram(String s, String t) {
    	if(s==null || t==null) return false;
    	return sortString(s).equals(sortString(t));
    }
    
    /*排序重组过程****/
    String sortString(String s){
    	char[] a= s.toCharArray();
    	Arrays.sort(a);
    	String t = new String(a);
    	return t;
    }
	public static void main(String[] args) {
		Valid_Anagram_242 v = new Valid_Anagram_242();
		String s = "aacc";
		String t= "ccac";
		System.out.println(v.isAnagram(s, t));

	}

}
