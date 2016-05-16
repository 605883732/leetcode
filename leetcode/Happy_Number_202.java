import java.util.ArrayList;
import java.util.List;


public class Happy_Number_202 {

    public boolean isHappy(int n) {
    	int temp = 0;
    	int sum = 0;
    	List<Integer> container = new ArrayList<Integer>();
    	while(sum!=1){
    		sum=0;
    		while(n!=0){
        		temp = n%10;
        		sum+=temp*temp;
        		n=n/10;
        	}
    		//System.out.println(sum);
    		if(container.contains(sum)) break;
    		container.add(sum);
    		n = sum;
    	}
    	if(sum==1) return true;
    	return false;
    	
    }
	public static void main(String[] args) {
		Happy_Number_202 h202 = new Happy_Number_202();
		System.out.println(h202.isHappy(1));

	}

}
