package assignments;

/***
 * 
 * @author PALLABI
 * Date 19th July 2022
 * 
 */

public class ConditionalOperatorsAssignment {

	public static void main(String[] args) {
	
		System.out.println("---------------Assignment 1----------------");
		System.out.println("Find out the greatest number out of three different given numbers");
		
		int a=25;
		int b=78;
		int c=87;

		
		if(a>b) {
			if(a>c) {
				System.out.println(a +" is the greatest number");
			}
			else {
				System.out.println(c + " is the greatest number");
			}
		}
		else if (b>c) {
			System.out.println(b +" is the greatest number");
		}
			else {
				System.out.println(c+" is the greatest number");
			}
		
		
		System.out.println("---------------Assignment 2----------------");
		System.out.println("Write a Java program to test a number is positive or negative");
		int ar[] = {35,-11};
		for(int e : ar) {
			if(e>=0) {
				System.out.println(e+ " is a positive number");
			}
			else {
				System.out.println(e + " is a negative number");
			}
		}
		
		
		}

		
		
	}


