
public class Reverse_Words_in_a_String_151 {

	public String reverseWords(String s) {
        s = s.trim();
        String array[] = s.split(" ");
        String result ="";
        for(int i=array.length-1;i>=0;i--){
        	array[i] = array[i].trim();
        	if(array[i].equals("")) continue;
        	if(i==0)
        		result+=array[i].trim();
        	else
        		result+=array[i].trim()+" ";
        }
        	
        return result;
    }
	public static void main(String[] args) {
		Reverse_Words_in_a_String_151 r151 = new Reverse_Words_in_a_String_151();
		System.out.println(r151.reverseWords("the    sky    is blue"));

	}

}
