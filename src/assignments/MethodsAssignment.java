package assignments;

/***
 * 
 * @author PALLABI
 * Date 30 July 2022 
 *
 */


public class MethodsAssignment {

	// Assignment 1:
	public static int printSum(int a, int b) {

		int sum = a + b;
		System.out.println("sum of " + a + " and " + b + " is : " + sum);
		return sum;
	}

	// Assignment 2:
	public int product(int m, int n) {
		int product = m * n;
		System.out.println("Product of " + m + " and " + n + " is : " + product);
		return product;
	}

	// Assignment 3:
	public static void circle(int r) {
		double circumference = 2 * 3.14 * r;
		System.out.println("Circumference of circle with radius " + r + " is : " + circumference);
		double area = 3.14 * r * r;
		System.out.println("Area of circle with radius " + r + " is : " + area);

	}

	// Assignment 4:
	public static void maxmin(int a, int b, int c) {
		if (a > b) {
			if (a > c) {
				System.out.println("max: " + a);
				if (b > c) {
					System.out.println("min: " + c);
				} else {
					System.out.println("min: " + b);
				}
			} else {
				System.out.println("max: " + c);
				System.out.println("min: " + b);
			}
		} else {
			if (a < c) {
				System.out.println("min: " + a);
				if (b < c) {
					System.out.println("max: " + c);
				} else {
					System.out.println("max: " + b);
				}
			} else {
				System.out.println("min: " + c);
				System.out.println("max: " + b);
			}

		}

	}

	// Assignment 5:
	public static void checkEvenOdd(int i) {
		if (i % 2 == 0) {
			System.out.println(i + " is even");
		} else
			System.out.println(i + " is odd");
	}

	// Assignment 6:
	public static void isEligible(int age) {
		if (age >= 18) {
			System.out.println("Candidate is eligible to vote");
		} else
			System.out.println("Candidate is NOT eligible to vote");
	}

	// Assignment 7:
	public static void isPrime(int num) {
		for (int count = 2; count < num; count++) {
			int rem = num % count;
			if (rem == 0) {
				System.out.println(num + " is not a Prime Number");
				break;
			} else {
				if (count == num - 1) {
					System.out.println(num + " is a Prime Number");
				}
			}
		}

	}

	// Assignment 8:
	public static void grade(int marks) {
		if(marks>=91 && marks<=100) {
			System.out.println("Marks:"+marks+" Grade:AA");
		}
		else if(marks>=81 && marks<=90){
			System.out.println("Marks:"+marks+" Grade:AB");
		}
		else if(marks>=71 && marks<=80){
			System.out.println("Marks:"+marks+" Grade:BB");
		}
		else if(marks>=61 && marks<=70){
			System.out.println("Marks:"+marks+" Grade:BC");
		}
		else if(marks>=51 && marks<=60){
			System.out.println("Marks:"+marks+" Grade:CD");
		}
		else if(marks>=41 && marks<=50){
			System.out.println("Marks:"+marks+" Grade:DD");
		}
		else if(marks<=40){
			System.out.println("Marks:"+marks+" Grade:FAIL");
		}
		else
			System.out.println("Please enter correct marks");
	}

	public static void main(String[] args) {

		printSum(24, 25);
		MethodsAssignment obj = new MethodsAssignment();
		obj.product(127, 123);
		circle(10);
		maxmin(4, 5, 3);
		checkEvenOdd(-39);
		isEligible(19);
		isPrime(103);
		grade(98);

	}

}
