
public class Best_time_To_buy_and_Sell_Stock_Ⅱ_122 {
	/*贪心策略，如果明天股价比今天高，今天就买入，明天卖出，否则不买***/
	/*当天可以先卖出，赚取与昨天的差价，再买入，明天在卖出***/
	public int maxProfit(int[] prices) {
			int result = 0;
		   if(prices.length<=1) return 0;
	       for(int i=0;i<prices.length-1;i++){
	    	   if(prices[i+1]>prices[i]){
	    		   result+=prices[i+1]-prices[i];
	    	   }
	       } 
	       return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
