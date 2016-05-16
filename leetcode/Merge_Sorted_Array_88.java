import java.util.Arrays;


public class Merge_Sorted_Array_88 {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] temp1 = new int[m+n];
        for(int i=0;i<m;i++){
        	temp1[i] = nums1[i];
        }
        for(int i=m;i<n+m;i++){
        	temp1[i] = nums2[i-m];
        }
        Arrays.sort(temp1);
        for(int i=0;i<n+m;i++){
        	nums1[i] = temp1[i];
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
