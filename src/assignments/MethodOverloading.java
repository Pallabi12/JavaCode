package assignments;

/***
 * 
 * @author PALLABI Date 30 July 2022
 *
 */

public class MethodOverloading {

	public static boolean login(String phone, String password) {
		boolean isLogin = true;
		System.out.println("Login using Phone and password: " + isLogin);
		return isLogin;
	}

	public static boolean login(String phone, int otp) {
		boolean isLogin = true;
		System.out.println("Login using Phone and otp: " + isLogin);
		return isLogin;
	}

	/*
	  public static boolean login(String username, String password) { boolean
	  isLogin=true;
	  System.out.println("Login using username and password: "+isLogin); return
	  isLogin; }
	 */

	public static boolean login(String username, String password, int otp) {
		boolean isLogin = true;
		System.out.println("Login using Username, Password and otp: " + isLogin);
		return isLogin;
	}

	public static void main(String[] args) {

		boolean val = login("9998887777", "abc123");
		System.out.println(val);

		boolean val1 = login("9998887777", 1234);
		System.out.println(val1);

		boolean val2 = login("9998887777", "abc123", 1234);
		System.out.println(val2);

	}

}
