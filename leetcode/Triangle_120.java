import java.util.ArrayList;
import java.util.List;

/*动态规划***/
public class Triangle_120 {
	public int minimumTotal(List<List<Integer>> triangle) {
		int nrows = triangle.size(); //层数
		List<List<Integer>> result= triangle; 
		result.get(0).set(0,triangle.get(0).get(0)); //如果只有1层，结果就是那个值
		for(int i=1;i<nrows;i++){
			for(int j=0;j<result.get(i).size();j++){
				if(j==0){//如果是第一个元素
					result.get(i).set(j,triangle.get(i-1).get(j)+triangle.get(i).get(j) );
				}
				else if(j==result.get(i).size()-1){//如果是最后一个元素
					result.get(i).set(j,triangle.get(i-1).get(j-1)+triangle.get(i).get(j) );
				}else{//中间元素
					int temp = Math.min(triangle.get(i-1).get(j),triangle.get(i-1).get(j-1));
					result.get(i).set(j,triangle.get(i).get(j)+temp);
				}
				
			}
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<result.get(nrows-1).size();i++){
			if(result.get(nrows-1).get(i)<min){
				min = result.get(nrows-1).get(i);
			}
		}
		return min;
    }
	public static void main(String[] args) {
		Triangle_120 triangle = new Triangle_120();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(2);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(3);list2.add(4);
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(6);list3.add(5);list3.add(7);
		List<Integer> list4 = new ArrayList<Integer>();
		list4.add(4);list4.add(1);list4.add(8);list4.add(3);
		
		List<List<Integer>> tri = new ArrayList<List<Integer>>();
		tri.add(list1);tri.add(list2);tri.add(list3);tri.add(list4);
		System.out.println(triangle.minimumTotal(tri));
	}

}
