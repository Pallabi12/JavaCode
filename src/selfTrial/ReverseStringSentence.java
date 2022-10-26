package selfTrial;

public class ReverseStringSentence {

	public static void main(String[] args) {
		
		String str = "India is my country";
		String result="";
		
		String strArr[] = str.split("\\s");

		for(int i=strArr.length-1; i>=0;i--) {
			
			result=result+strArr[i]+" ";

		}
		System.out.println(result);
	}
	

}
