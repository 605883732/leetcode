/*只允许交易一次，找出最大差值即可，注意收益必须大于0****/
public class Best_time_to_buy_and_sell_stock_121 {

	public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        int temp = 0;
		for(int i=0;i<prices.length;i++){
        	if(prices[i]<min) min = prices[i];
        	else {
        		temp = prices[i]-min; //差值
        		if(temp>result)
        		   result = temp;
        	}
        }
		return result;
    }
	public static void main(String[] args) {
		int nums[] = {-66};
		Best_time_to_buy_and_sell_stock_121 b121 = new Best_time_to_buy_and_sell_stock_121();
		System.out.println(b121.maxProfit(nums));

	}

}
