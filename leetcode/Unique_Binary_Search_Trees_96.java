/*������ʵ�ؼ��ǵ��ƹ��̵ķ�����n������ÿ���㶼������Ϊroot��
 * �� i ��Ϊrootʱ��С�� i  �ĵ㶼ֻ�ܷ������������У�
 * ���� i �ĵ�ֻ�ܷ����������У�
 * ��ʱֻ����������������ж����֣�������˼�Ϊ�� i ��ΪrootʱBST��������****/
/*�ö�̬�滮��***/
public class Unique_Binary_Search_Trees_96 {
	 public int numTrees(int n) {
		 if(n<=1) return 1;
	     int result[] = new int[n+1];
	     result[0]=1;
	     result[1]=1;
	    for(int i=2;i<=n;i++){
	    	for(int j=1;j<=i;j++){
	    		result[i]+=result[j-1]*result[i-j]; /*j-1��ʾ��j��ߵĽڵ����� i-j��ʾ��j�ұߵĽڵ���***/
	    	}
	    	
	    }
	     
	     return result[n];
	 }
	public static void main(String[] args) {
		Unique_Binary_Search_Trees_96 u96 = new Unique_Binary_Search_Trees_96();
		System.out.println(u96.numTrees(4));

	}

}
