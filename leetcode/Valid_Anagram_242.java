import java.util.Arrays;

/*�ж������ַ������Ԫ���Ƿ���ȫ��ͬ��ֻ��˳����ܲ�ͬ*****/
public class Valid_Anagram_242 {
	/*�������ַ����е��ַ�����������������ٽ��бȽ�***/
    public boolean isAnagram(String s, String t) {
    	if(s==null || t==null) return false;
    	return sortString(s).equals(sortString(t));
    }
    
    /*�����������****/
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
