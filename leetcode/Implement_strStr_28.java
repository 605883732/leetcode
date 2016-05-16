/*返回字符串haystack中第一次出现needle的位置****/

/*暴力破解法**/
public class Implement_strStr_28 {
	public int strStr(String haystack, String needle) {
		
		int M = needle.length();//模式长度
		int N = haystack.length();//文本长度
		for(int i=0;i<=N-M;i++){
			int j=0;
			for(j=0;j<M;j++){
				if(haystack.charAt(i+j)!=needle.charAt(j)){
					break;
				}
			}
		
			if(j==M) return i;
		}
		return -1;
    }
	
	public static void main(String[] args) {
		Implement_strStr_28 is28 = new Implement_strStr_28();
		System.out.println(is28.strStr("", ""));

	}

}
