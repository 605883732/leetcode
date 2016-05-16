import java.util.ArrayList;
import java.util.List;
/*
ÿ10����, ��һ����λ��1, ÿ100����, ��10��ʮλ��1, ÿ1000����, ��100����λ��1. 

��һ��ѭ��, ÿ�μ��㵥��λ��1���ܸ���(��λ,ʮλ, ��λ). 

����:

�����λ��1Ϊ����: �����λ����0, 1, �� >=2 �������: 

case 1: n=3141092, a= 31410, b=92. �����λ��1�ĸ���Ӧ��Ϊ 3141 *100 ��.

case 2: n=3141192, a= 31411, b=92. �����λ��1�ĸ���Ӧ��Ϊ 3141 *100 + (92+1) ��. 

case 3: n=3141592, a= 31415, b=92. �����λ��1�ĸ���Ӧ��Ϊ (3141+1) *100 ��. 

����������������� һ����ʽ����:*

(a + 8) / 10 * m + (a % 10 == 1) * (b + 1);
**/
public class Number_Of_Digit_One_233 {

	 public int countDigitOne(int n) {
		 int ones = 0;    
	        for (long m = 1; m <= n; m *= 10) {    
	            long a = n/m, b = n%m;    
	            ones += (a + 8) / 10 * m;    
	            if(a % 10 == 1) ones += b + 1;    
	        }    
	        return ones;   
	    }
	public static void main(String[] args) {
		Number_Of_Digit_One_233 n233 = new Number_Of_Digit_One_233();
		System.out.println(n233.countDigitOne(13));

	}

}
