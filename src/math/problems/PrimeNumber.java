package math.problems;


import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		List<Integer> primeNumber = new ArrayList<Integer>();
		for (int i = 2; i<=1000000; i++){
			boolean isPrime = true;
			for (int factor = 2; factor<=i/2; factor++){
				if (i%factor ==0){
					isPrime = false;
					break;

				}
			}
			if (isPrime){
				primeNumber.add(i);
			}
		}
		System.out.println("prime numbers are");
		for (int number : primeNumber){
			System.out.println(number);
		}
	}

}
