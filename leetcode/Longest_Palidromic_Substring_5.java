/*����˹���㷨���Ӷ�ΪO(n)**/
/*�����㷨����ÿ����Ϊ������������չ�����Ӷ�O(n^2),����ʵ�����鷳****/
public class Longest_Palidromic_Substring_5 {
	 public String longestPalindrome(String s) {
		s="*"+s+"~"; /*��ͷ�ͽ�β������û�õ��ַ�����ֹ����ʱԽ��,�����ָ������Խ��ĵط�**/
		char[] array = s.toCharArray();
		char[] s2 = new char[array.length*2-1];
		int j =0;
		/*s2��Ϊ��������ַ���**/
		for(int i=0;i<s2.length;i++){
			if(i%2==0) {
				s2[i] = array[j];
				j++;
			}
			else s2[i]='#';
		}
		
		int p[] = new int[s2.length]; /*p����**/
		/* P[i] ����¼���ַ�S[i]Ϊ���ĵ�������Ӵ�����/�����ŵĳ��ȣ�����S[i]�����)**/
		/*P[i]-1������ԭ�ַ����л��Ĵ����ܳ���**/
		/*����ֻҪ������p[i]����***/
		int id = 0; //id��ʾ��ǰ���ұ߻����Ӵ����ĵ�λ��
		int max = 0+p[0];//Ҳ���ǵ�ǰ���ұ߻����Ӵ��ı߽�,�߽粻���������
		for(int i=1;i<p.length-1;i++){
			if(max>i){/*i���λ�ñ�ǰ����λ��idΪ���ĵĻ��Ĵ�����**/
				p[i] = Math.min(max-i,p[2*id-i]);
			}else{/*����㲻��ǰ����κλ��Ĵ���**/
				p[i] = 1;
			}
			
			while(s2[i+p[i]]==s2[i-p[i]]){/*���ұȽϻ�Խ�磬������ͷ�����޹��ַ���û����**/
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
