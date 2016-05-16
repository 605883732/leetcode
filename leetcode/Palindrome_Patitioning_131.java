import java.util.ArrayList;
import java.util.List;


public class Palindrome_Patitioning_131 {
	List<List<String>> result = new ArrayList<List<String>>();
	String s;
	public List<List<String>> partition(String s) {
        this.s = s;
		dfs(0,"",new ArrayList<String>());
		return result;
    }
	void dfs(int start,String cur,List<String> each){
		if(start>=s.length()){ //��������
			result.add(new ArrayList<String>(each));
			return;
		}
		for(int i=start;i<=s.length()-1;i++){
			cur+=s.charAt(i);
			if(is_palindrome(cur)){/*�ҵ�һ���ػ��ż����ݹ�***/
				each.add(cur);
				dfs(i+1,"",each);
				each.remove(each.size()-1);
			}
		}
	}
	boolean is_palindrome(String s){
		for(int i=0;i<s.length()/2;i++){
			if(!(s.charAt(i)==s.charAt(s.length()-1-i)))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Palindrome_Patitioning_131 p131 = new Palindrome_Patitioning_131();
		List<List<String>> rs = p131.partition("aaaa");
		for(int i=0;i<rs.size();i++){
			for(int j=0;j<rs.get(i).size();j++){
				System.out.print(rs.get(i).get(j)+" ");
			}
			System.out.println();
		}

	}

}
