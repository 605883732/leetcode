/*
 * �ռ���ˮ
 * С���㷨 ���Ա� problem11
 */
public class Trapping_Rain_Water_42 {
	public int trap(int[] height) {
		if(height == null || height.length <= 2) return 0;
        int result = 0;
        int start = 0;
        int end = height.length - 1;
        int cur_min = 0; /*��ǰ��С�߶� ,��ʢˮ�������߽�����Ǳߵĸ߶�***/
        while(height[start] == 0){ //��ߵ�һ���߶Ȳ�Ϊ0������
        	start ++;
        }
        while(height[end] == 0){//�ұߵ�һ���߶Ȳ�Ϊ0������
        	end --;
        }
        while(start < end){
        	//height[start]�����Ӹ߶�
        	//height[end]�����Ӹ߶�
        	result += cur_min - height[start] > 0? cur_min - height[start] :0; //��������Ӹ߶Ȳ����߽�߶ȣ�������ˮ
        	result += cur_min -height[end] > 0? cur_min -height[end] :0;//��������Ӹ߶Ȳ����߽�߶ȣ�������ˮ
        	height[start] = cur_min - height[start] > 0? cur_min:height[start];//��������Ӹ߶Ȳ����߽�߶ȣ�����������ˮ������С�߶�һ��
        	height[end] = cur_min - height[end] > 0? cur_min:height[end];//��������Ӹ߶Ȳ����߽�߶ȣ�����������ˮ������С�߶�һ��
        	if(height[start] <= height[end]) { //��������ӱ������Ӱ�
        		cur_min = height[start]; //��ǰ��С�߶� = �����Ӹ߶� 
        		start ++; //����������
        		
        	}else{//��������ӱ������Ӱ�
        		cur_min = height[end]; //��ǰ��С�߶� = �����Ӹ߶� 
        		end --;//����������
        	} 	
        }
        return result;
    }
	public static void main(String[] args) {
		Trapping_Rain_Water_42 t42 = new Trapping_Rain_Water_42();
		int height [] = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(t42.trap(height));

	}

}
