/*Math*****/
public class Excel_Sheet_Column_Number_171 {

	public int titleToNumber(String s) {
        if(s==null) return 0;
        char [] array = s.toCharArray();
        int len = array.length;
        int sum = 0;
        int k = 0;
        int alpha = 0;
        for(int i=len-1;i>=0;i--){
        	sum += (array[i]-'A'+1)*Math.pow(26,k);
        	k++;
        }
        return sum;
    }
	public static void main(String[] args) {
		Excel_Sheet_Column_Number_171 escn171 = new Excel_Sheet_Column_Number_171();
		System.out.println(escn171.titleToNumber("AB"));

	}

}
