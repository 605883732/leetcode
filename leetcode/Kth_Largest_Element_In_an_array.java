
public class Kth_Largest_Element_In_an_array {
	public int findKthLargest(int[] nums, int k) {
        int m =  nums.length;
        int pos = m - k; /*排序好后第k大位置**/
        int q = partition(nums, 0, m-1);
        int start = 0;
    	int end = m -1;
        while(q != pos){
        	
        	if(q < pos){
        		start = q + 1;
        		q = partition(nums, start, end);
        	}else{
        		end = q - 1;
        		q = partition(nums, start, end);
        	}
        }
        return nums[q];
    }
    int partition(int[]numbers,int begin,int end){
		int i = begin - 1;
		for(int j=begin;j<end;j++){
			if(numbers[j] < numbers[end]){
				i++;
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
			}
		}
		int temp = numbers[i+1];
		numbers[i+1] = numbers[end];
		numbers[end] = temp;
		return i+1;
	}
	public static void main(String[] args) {
		Kth_Largest_Element_In_an_array ktne = new Kth_Largest_Element_In_an_array();
		int nums[] ={3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
		             int k = 20;
		System.out.println(ktne.findKthLargest(nums, k));
	}

}
