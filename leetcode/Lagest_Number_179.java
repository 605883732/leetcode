import java.util.Arrays;

public class Lagest_Number_179 {
	public String largestNumber(int[] nums) {
		/*按任意两个数在最后结果中的先后位置排序***/
		
		if(nums.length==0) return "";
		if(nums.length==1) return ""+nums[0];
		/*冒泡排序,从大到小***/
		boolean flag = true;
		int temp;
		while(flag){
			flag = false;
			for(int i=0;i<nums.length-1;i++){
				if(compare(nums[i+1],nums[i])==1){
					temp = nums[i+1];
					nums[i+1] = nums[i];
					nums[i] = temp;
					flag  = true;
				}
			}
		}
		String result= "";
		for(int i=0;i<nums.length;i++)
			result+=nums[i];
		int k = 0;
		/*去掉首位0，如果全是0则返回一个0***/
		while(k<result.length() && result.charAt(k)=='0'){
			k++;
		}
		if(k==result.length()) return "0";
		else return result.substring(k,result.length());
    }
	int compare(int a,int b){ //比较两个数在最后结果中的先后顺序,a在前返回1，b在前返回0
		String x = String.valueOf(a)+String.valueOf(b);
		String y =String.valueOf(b)+String.valueOf(a);
		int temp1;
		int temp2;
		for(int i=0;i<x.length();i++){
			temp1 = Integer.parseInt(x.charAt(i)+"");
			temp2 = Integer.parseInt(y.charAt(i)+"");
			if(temp1>temp2) return 1;
			else if(temp1<temp2) return 0;
		}
		
		return 0;
	}
	public static void main(String[] args) {
		Lagest_Number_179 l179 = new Lagest_Number_179();
		int nums[]={0,0};
		System.out.println(l179.largestNumber(nums));
	}

}
