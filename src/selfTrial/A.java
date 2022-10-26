package selfTrial;

//Can we overload the main method? 
//Say Class A has one main method and Class B has another main method. 
//How to call Class A’s main method from Class B

public class A {

	public static void main(String[] args) {
		
		System.out.println("Called main function of A");

	}

	//Overloading with 1 argument
	public static void main(int i) {
		System.out.println("Called main function of A : 1 int parameter: "+ i);
	}
	
	//Overloading with 2 argument
	public static void main(int j, String abc) {
		System.out.println("Called main function of A : 2 parameter: "+ j + "and " + abc);
	}
	
}
