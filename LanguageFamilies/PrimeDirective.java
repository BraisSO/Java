	package stuff;

	//Import statement:
	import java.util.ArrayList;

	class PrimeDirective {

	// Add your methods here:
	public boolean isPrime(int number){
	 boolean primo=true;
	 if (number==2){
	   return primo;
	 }

	 for (int i=2; i<number; i++){
	    if (number%i==0 || number<2) {
	      primo=false;
	     return primo;
	    }
	 }

	 return primo;

	}

	 public ArrayList<Integer> onlyPrimes(int[] numbers){
	   ArrayList<Integer> primes = new ArrayList<Integer>();
	   for (int number: numbers){
	     if (isPrime(number)){
	     primes.add(number);
	   }}
	   return primes;
	 }

	public static void main(String[] args) {

	 PrimeDirective pd = new PrimeDirective();
	 int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

	System.out.println(pd.onlyPrimes(numbers));

	}  

	
}
