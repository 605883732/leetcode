
public class Count_and_Say_38 {

	 public String countAndSay(int n) {
	        if(n<1) return null;
	        if(n==1) return new String("1");
	        if(n==2) return new String("11");
	        String result = "11";
	        int i=2;
	        while(i<n){
	        	i++;
	        	char[] temp = result.toCharArray();
	        	int len = temp.length;
	        	String temp2 = "";
	        	int num = 1;
	        	for(int j=0;j<len;j++){
	        		if(j+1!=len&&temp[j+1]==temp[j]){
	        			num++;
	        		}
	        		else{
	        			temp2+=num;
	        			temp2+=temp[j];
	        			num=1;
	        		}
	        	}
	        	//if(num==1){/*最后一个元素不重复***/
	        		//temp2+=Integer.toString(1)+Integer.toString(temp[len-1]);
	        	//}
	        	result = temp2;
	        }
	        return result;
	    }
	public static void main(String[] args) {
		Count_and_Say_38 c38 = new Count_and_Say_38();
		System.out.println(c38.countAndSay(6));

	}

}
