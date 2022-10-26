package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/***
 * 
 * @author PALLABI 
 * Date 19 July 2022
 * 
 */

public class ArrayListAssignment {

	public static void main(String[] args) {

//Assignment 1:
		System.out.println("----Assignment 1----");
		ArrayList<String> ar = new ArrayList<String>();

		ar.add("Blue");
		ar.add("White");
		ar.add("Yellow");
		ar.add("Red");
		ar.add("Orange");

		System.out.println("size of array is : " + ar.size());
		System.out.println(ar);

//Assignment 2:

		System.out.println("----Assignment 2----");
		ar.add(0, "Black");
		ar.add(ar.size(), "Purple");

		System.out.println("size of updated array is : " + ar.size());
		System.out.println(ar);
// Assignment 3:

		System.out.println("----Assignment 3----");
		System.out.println("Retrieving the second element of the array: " + ar.get(1));
		System.out.println("Retrieving the fifth element of the array: " + ar.get(4));
		// System.out.println("Retrieving the 9th element of the array: " + ar.get(10));

// Assignment 4:

		System.out.println("----Assignment 4----");
		ar.set(2, "Brown");
		ar.set(3, "Pink");
		System.out.println(ar);

//Assignment 5:

		System.out.println("----Assignment 5----");
		System.out.println("remove third element from Array");
		ar.remove(2);

		System.out.println("size of updated array is : " + ar.size());
		System.out.println(ar);

//Assignment 6:

		System.out.println("----Assignment 6----");
		System.out.println("Write a Java program to search an element in a array list");

		if (ar.contains("Pink")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

// Assignment 7:

		System.out.println("----Assignment 7----");
		System.out.println("Write a Java program to reverse elements in a array list");

		Collections.reverse(ar);
		System.out.println(ar);
// Assignment 8:

		System.out.println("----Assignment 8----Most Important");
		System.out.println("Write a Java program to extract a portion of an array list");

		String Player[] = { "Dhoni", "Rohit", "Virat", "Dhawan", "Malinga", "Rishab" };
		// To covert static array to dynamic
		List<String> pr = new ArrayList<String>(Arrays.asList(Player));
		for (int i = 2; i < 5; i++) {
			System.out.println(pr.get(i));
		}

// Assignment 9:

		System.out.println("----Assignment 9---- Important");
		System.out.println("Write a Java program of swap two elements in an array list");
		Collections.swap(pr, 3, 2);
		System.out.println(pr);

// Assignment 10:

		System.out.println("----Assignment 10----");
		System.out.println("Write a Java program to empty an array list");
		// ar.removeAll(ar);
		System.out.println(ar);

// Assignment 11:

		System.out.println("----Assignment 11----");
		System.out.println("Write a Java program to trim the virtual capacity");
		ar.trimToSize();
		System.out.println(ar);
		
		
// Assignment 12:

				System.out.println("----Assignment 12----");
				for(int i=0; i<ar.size()-1;i++) {
					System.out.println(ar.get(i));
			}		
	}

}
