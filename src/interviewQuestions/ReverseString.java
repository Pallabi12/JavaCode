package interviewQuestions;

public class ReverseString {

	public static void main(String[] args) {

		String str = "My name is Pallabi";
		
		//Method 1: Using StringBuffer
		
		StringBuffer s = new StringBuffer(str);
		System.out.println("Reverse of "+str+ " is: " + s.reverse());

		
		//Method 2: using for loop
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);	
			}
		System.out.println(rev);		
		
	}

}
