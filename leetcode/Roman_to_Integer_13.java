/*����������תΪ����������****/
/*С�����֡������� ��X �� C���ڴ�����ֵ���ߡ�����ʾ�������ڴ�����С���õ��������磺��=4����=9****/
public class Roman_to_Integer_13 {

	 public int romanToInt(String s) {
	        char array[] = s.toCharArray();
	        int sum[] = new int[array.length];
	        int result = 0;
	        int i=0;
	        for(i=0;i<array.length;i++){
	        	if(array[i]=='I') sum[i]=1;
	        	if(array[i]=='V') sum[i]=5;
	        	if(array[i]=='X') sum[i]=10;
	        	if(array[i]=='L') sum[i]=50;
	        	if(array[i]=='C') sum[i]=100;
	        	if(array[i]=='D') sum[i]=500;
	        	if(array[i]=='M') sum[i]=1000;
	        }
	        
	        for(i=0;i<sum.length-1;i++){
	        	if(sum[i]<sum[i+1]) result-=sum[i];
	        	else result+= sum[i];
	        }
	        result+=sum[i];
	        return result;
	 }
	public static void main(String[] args) {
		Roman_to_Integer_13 r13 = new Roman_to_Integer_13();
		System.out.println(r13.romanToInt("MCDLXXVI"));

	}

}