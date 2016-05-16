
public class Longest_Common_prefix_14 {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length<1) return "";
        if(strs.length==1) return strs[0];
		String result = "";
        int i =0;
        while(true){
        	int j=1;
        	if(strs[0].length()<=i) break;
        	for(j=1;j<strs.length;j++){
        		if(strs[j].length()<=i) break;
        		if(strs[j].charAt(i)!=strs[0].charAt(i))
        			break;
        	}
        	if(j!=strs.length) break;
        	else{
        		result+=strs[0].charAt(i);
        	}
        	i++;
        }
        return result;
    }
	public static void main(String[] args) {
		 Longest_Common_prefix_14 l14 = new Longest_Common_prefix_14();
		 String [] strs={"abc","ab","abcd"};
		 System.out.println(l14.longestCommonPrefix(strs));

	}

}
