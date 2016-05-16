import java.util.ArrayList;
import java.util.List;


public class Pascal_Triangle_118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int i = 1;
		while(i<=numRows){
			List<Integer> each = new ArrayList<Integer>();
			for(int j=0;j<i;j++){
				if(j==0||j==i-1){ /*Ê×Î²¶¼ÊÇ1***/
					each.add(1);
					continue;
				}

				int temp = result.get(i-2).get(j-1)+result.get(i-2).get(j);
				each.add(temp);
			}
			result.add(each);
			i++;
		}
		return result;
    }
	public static void main(String[] args) {
		Pascal_Triangle_118  p118 = new Pascal_Triangle_118();
		p118.generate(3);

	}

}
