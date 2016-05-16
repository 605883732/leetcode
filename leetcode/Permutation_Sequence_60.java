import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Permutation_Sequence_60 {
    public String getPermutation(int n, int k) {
    	int arr[] = new int[n]; /*cantor����**/
    	int temp = n - 1;
    	k = k - 1;
    	for(int i=0;i<arr.length;i++){
    		int m = jiecheng(temp);
    		int a = k / m;
    		k = k % m;
    		temp --;
    		arr[i] = a; 
    	}
    	int arr2[] = new int[n]; //�������ԭ�����˳��
    	int start = 1;
    	//ͨ��cantor����ָ�ԭ����
    	while(start <= n){
    		for(int j=0;j<arr.length;j++){
    			if(arr[j] != 0) arr[j] --;
    			else{
    				arr[j] = -1;
    				arr2[j] = start;
    				start ++;
    				break;
    			}
    		}
    	}
    	String result ="";
    	for(int i=0;i<arr2.length;i++){
    		result += arr2[i];
    	}
    	return result;
    	
    }
    int jiecheng(int n){ //����׳�
    	if(n == 1 || n == 0) return 1;
    	else return n * jiecheng(n -1 );
    }
	
   
	public static void main(String[] args) {
		Permutation_Sequence_60 p60 = new Permutation_Sequence_60();
		System.out.println(p60.getPermutation(3,2));
		//for(int i=0;i<p60.result.size();i++){
		//	System.out.println(p60.result.get(i));
		//}
		

	}

}
