import java.util.ArrayList;
import java.util.List;

/*»ØËÝ**/
public class Letter_Combinations_of_a_phone_number_17 {
	List<String> result = new ArrayList<String>();
	 public List<String> letterCombinations(String digits) {
		    if(digits==null||digits.equals("")) return result;
	        char array[] = digits.toCharArray();
	        dfs(array,0,"");
	        return result;
	 }
	 void dfs(char[]array,int length,String cur){
		 String s1=null;
		 String s2=null;
		 String s3=null; 
		 String s4=null;
		 if(cur==null) return;
		if(array[length]=='2'){
			s1 = cur+'a';
			s2 = cur+'b';
			s3 = cur+'c';
		}else if(array[length]=='3'){
			s1 = cur+'d';
			s2 = cur+'e';
			s3 = cur+'f';
		}else if(array[length]=='4'){
			s1 = cur+'g';
			s2 = cur+'h';
			s3 = cur+'i';
		}else if(array[length]=='5'){
			s1 = cur+'j';
			s2 = cur+'k';
			s3 = cur+'l';
		}else if(array[length]=='6'){
			s1 = cur+'m';
			s2 = cur+'n';
			s3 = cur+'o';
		}else if(array[length]=='7'){
			s1 = cur+'p';
			s2 = cur+'q';
			s3 = cur+'r';s4 = cur+'s';
		}else if(array[length]=='8'){
			s1 = cur+'t';
			s2 = cur+'u';
			s3 = cur+'v';
		}else if(array[length]=='9'){
			s1 = cur+'w';
			s2 = cur+'x';
			s3 = cur+'y';
			s4 = cur+'z';
		}
		 if(length==array.length-1){
			 result.add(s1);
			 result.add(s2);
			 result.add(s3);
			 if(s4!=null) result.add(s4);
		 }else{
			 dfs(array,length+1,s1);
			 dfs(array,length+1,s2);
			 dfs(array,length+1,s3);
			 dfs(array,length+1,s4);
		 }
		 
	 }
	public static void main(String[] args) {
		Letter_Combinations_of_a_phone_number_17 l17 = new Letter_Combinations_of_a_phone_number_17();
		String digits = "7";
		List<String> result = l17.letterCombinations(digits);
		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i));
		}

	}

}
