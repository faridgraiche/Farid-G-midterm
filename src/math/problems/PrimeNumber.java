package math.problems;


import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) throws Exception {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		int minNum = Integer.parseInt(connectToSqlDB.readDataBase("PrimeNumber","MinNum").get(0));
        int maxNum =  Integer.parseInt(connectToSqlDB.readDataBase("PrimeNumber","MaxNum").get(0));
		List<Integer> primeNumber = new ArrayList<Integer>();
		for (int i = minNum; i<=maxNum; i++){
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
