
public class Count_Primes_204 {

	public int countPrimes(int n) {
	      if(n<=2) return 0; //没有比2小的质数
	      int result =0 ;
	      for(int i=2;i<n;i++){
	    	  if(isPrime(i)) result++;
	      }
	      return result;
	}
	boolean isPrime(int num){//默认num从2开始
		if(num==2) return true;
		 for (int i = 2; i * i <= num; i++) {
		      if (num % i == 0) return false;
		   }
		return true;
	}
	public static void main(String[] args) {
		Count_Primes_204 c204 = new Count_Primes_204();
		//System.out.println(c204.isPrime(4));
		System.out.println(c204.countPrimes(499979));

	}

}
