import java.util.ArrayList;
import java.util.List;


public class Pascal_Triangle_¢ò_119 {
	public List<Integer> getRow(int rowIndex) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int i = 1;
		while(i<=rowIndex+1){
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
		return result.get(i-2);
    }
	public static void main(String[] args) {
		Pascal_Triangle_¢ò_119 p119 = new Pascal_Triangle_¢ò_119();
		List<Integer> ss = p119.getRow(1);
		for(int i=0;i<ss.size();i++){
			System.out.println(ss.get(i)+" ");
		}

	}

}
