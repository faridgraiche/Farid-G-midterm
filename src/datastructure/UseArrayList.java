package datastructure;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UseArrayList {

	public static void main(String[] args) {



		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		List<Integer> num = new ArrayList<>();
		num.add(3);
		num.add(6);
		num.add(5);
		num.add(9);
		num.add(0);
		Set<Integer> newList = new HashSet<>();
		for (int a:num){
			newList.add(a);

		}
		System.out.println(newList);


	}

}
