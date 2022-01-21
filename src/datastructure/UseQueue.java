package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue restaurant = new LinkedList();

		restaurant.add("jack");
		restaurant.add("susan");
		restaurant.add("john");


		System.out.println(restaurant);

	}

}
