
public class Best_time_To_buy_and_Sell_Stock_��_122 {
	/*̰�Ĳ��ԣ��������ɼ۱Ƚ���ߣ���������룬����������������***/
	/*���������������׬ȡ������Ĳ�ۣ������룬����������***/
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
