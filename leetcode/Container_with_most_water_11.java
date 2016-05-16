/*˫ָ�룬����������**/
public class Container_with_most_water_11 {
	public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int max = 0;
        int cur = 0;
        while(start<end){
        	cur = Math.min(height[start], height[end])*(end-start);
        	if(cur>max) max =cur;
        	if(height[start]<height[end]) start++;//�����㰫��������
        	else end--;//����յ㰫���յ�ǰ��
        }
        return max;
    }
	public static void main(String[] args) {
		Container_with_most_water_11 c11 = new Container_with_most_water_11();
		int height[]={1,2,4,3};
		System.out.println(c11.maxArea(height));

	}

}
