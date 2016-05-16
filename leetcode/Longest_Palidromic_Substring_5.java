/*曼彻斯特算法复杂度为O(n)**/
/*朴素算法是以每个点为中心向两边扩展，复杂度O(n^2),而且实现贼麻烦****/
public class Longest_Palidromic_Substring_5 {
	 public String longestPalindrome(String s) {
		s="*"+s+"~"; /*开头和结尾加两个没用的字符，防止遍历时越界,下面会指出容易越界的地方**/
		char[] array = s.toCharArray();
		char[] s2 = new char[array.length*2-1];
		int j =0;
		/*s2即为处理过的字符串**/
		for(int i=0;i<s2.length;i++){
			if(i%2==0) {
				s2[i] = array[j];
				j++;
			}
			else s2[i]='#';
		}
		
		int p[] = new int[s2.length]; /*p数组**/
		/* P[i] 来记录以字符S[i]为中心的最长回文子串向左/右扩张的长度（包括S[i]这个点)**/
		/*P[i]-1正好是原字符串中回文串的总长度**/
		/*所以只要求出最大p[i]即可***/
		int id = 0; //id表示当前最右边回文子串中心的位置
		int max = 0+p[0];//也就是当前最右边回文子串的边界,边界不包括这个点
		for(int i=1;i<p.length-1;i++){
			if(max>i){/*i这个位置被前面以位置id为中心的回文串包含**/
				p[i] = Math.min(max-i,p[2*id-i]);
			}else{/*这个点不在前面的任何回文串中**/
				p[i] = 1;
			}
			
			while(s2[i+p[i]]==s2[i-p[i]]){/*左右比较会越界，但在两头加上无关字符就没事了**/
				p[i]++;
				
			}
			//System.out.println(i+" "+p[i]);
			if(i+p[i]>max){
				
				id = i;
				max = i+p[i];
			}
		}
	
		int max_index = 0;
		int temp =0;
		for(int i=1;i<p.length-1;i++){
			if(p[i]>temp) {
				max_index = i;
				temp = p[i];
			}
		}
		String result="";
		for(int k = max_index-p[max_index]+1;k<=max_index+p[max_index]-1;k++){
		
			if(s2[k]!='#') result+=s2[k];
		}
		
		return result;
	 }
	public static void main(String[] args) {
		Longest_Palidromic_Substring_5 l5 = new Longest_Palidromic_Substring_5();
		System.out.println(l5.longestPalindrome("aaaa"));

	}

}
