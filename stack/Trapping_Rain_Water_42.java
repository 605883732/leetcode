/*
 * 收集雨水
 * 小象算法 线性表 problem11
 */
public class Trapping_Rain_Water_42 {
	public int trap(int[] height) {
		if(height == null || height.length <= 2) return 0;
        int result = 0;
        int start = 0;
        int end = height.length - 1;
        int cur_min = 0; /*当前最小高度 ,即盛水的两个边界最矮的那边的高度***/
        while(height[start] == 0){ //左边第一个高度不为0的柱子
        	start ++;
        }
        while(height[end] == 0){//右边第一个高度不为0的柱子
        	end --;
        }
        while(start < end){
        	//height[start]左柱子高度
        	//height[end]右柱子高度
        	result += cur_min - height[start] > 0? cur_min - height[start] :0; //如果左柱子高度不到边界高度，可以填水
        	result += cur_min -height[end] > 0? cur_min -height[end] :0;//如果右柱子高度不到边界高度，可以填水
        	height[start] = cur_min - height[start] > 0? cur_min:height[start];//如果左柱子高度不到边界高度，将左柱子填水到和最小高度一致
        	height[end] = cur_min - height[end] > 0? cur_min:height[end];//如果右柱子高度不到边界高度，将右柱子填水到和最小高度一致
        	if(height[start] <= height[end]) { //如果左柱子比右柱子矮
        		cur_min = height[start]; //当前最小高度 = 左柱子高度 
        		start ++; //左柱子右移
        		
        	}else{//如果右柱子比左柱子矮
        		cur_min = height[end]; //当前最小高度 = 右柱子高度 
        		end --;//右柱子左移
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
