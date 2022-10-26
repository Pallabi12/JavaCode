package selfTrial;

//Can we overload the main method? 
//Say Class A has one main method and Class B has another main method. 
//How to call Class A’s main method from Class B

public class B {

	public static void main(String[] args) {

		//A a = new A();
		A.main(args);
		
		System.out.println("calling another function of class A from B");
		
		A.main(2, "param");

		A.main(10);
	}


}
