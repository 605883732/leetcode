import java.util.HashSet;
import java.util.Set;


public class Reverse_Vowels_of_a_String_345 {
	public String reverseVowels(String s) {
        Set<Character> set = new HashSet<Character>();
        set.add('a');set.add('e');set.add('i');
        set.add('o');set.add('u');
        set.add('A');set.add('E');set.add('I');
        set.add('O');set.add('U');
        int i = 0;
        int j = s.length() - 1;
        char[] arr  = s.toCharArray();
        while(i < j){
            while(i<arr.length &&!set.contains(arr[i])){
            	i ++;
            }
            while(j>=0 && !set.contains(arr[j])){
            	j --;
            }
            if( i < j){
            	swap(arr,i,j);
            	i++;
            	j--;
            }else{
            	break;
            }
        }
        return new String(arr);
    }
	void swap(char[] arr,int i,int j){
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
