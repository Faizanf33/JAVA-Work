public class forLoop{
	public static void main(String[] args){
		int[] primes = {2, 3, 5, 7, 11};
		
		// Old method
		for (int i = 0; i < primes.length; i++)
			System.out.println(primes[i]);
	
		// Another method
		for (int i: primes)
			System.out.println(i);
	}
}
