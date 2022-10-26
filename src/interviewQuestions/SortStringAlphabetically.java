package interviewQuestions;

import java.util.Arrays;

public class SortStringAlphabetically {

	public static void main(String[] args) {

		String str = "pallabi";
		
		//Method 1: 
		char charArray[]= str.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String (charArray));
	}

}
