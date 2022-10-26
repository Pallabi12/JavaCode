package assignments;

/***
 * 
 * @author PALLABI
 * Date 29 July 2022 
 *
 */
public class ArraysAssignment {

	public static void main(String[] args) {

//Assignment 1:

		System.out.println("------Assignment 1: my solution--------");

		int count = 00;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				if (count < 10) {
					System.out.print("0" + count + " ");
					count++;
				} else {
					System.out.print(count + " ");
					count++;
				}
			}
			System.out.println("");
		}

		System.out.println("--------------Assignment 1: Alternate method");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i + "" + j + "\t");
			}
			System.out.println("");
		}

		/*
		 * Question 2: Write a program to create a static Array, having following
		 * cricket data: --name, age, team name, DOB, gender, Strike Rate --Try to
		 * create multiple Object Arrays for different players  --Try to print all the
		 * values of each player on the console
		 */

		System.out.println("---------------------Assignment 2------------------");

		Object player1[] = new Object[6];

		player1[0] = "Virat";
		player1[1] = 30;
		player1[2] = "RCB";
		player1[3] = "12 Jan 1992";
		player1[4] = "M";
		player1[5] = 156.7;

		Object player2[] = new Object[6];

		player2[0] = "Tom";
		player2[1] = 36;
		player2[2] = "MI";
		player2[3] = "14 Mar 1988";
		player2[4] = "M";
		player2[5] = 159.3;

		Object player3[] = new Object[6];

		player3[0] = "Henna";
		player3[1] = 27;
		player3[2] = "KKR";
		player3[3] = "16 DEC 1997";
		player3[4] = "F";
		player3[5] = 149.5;

		for(int m=0;m<player1.length;m++) {
				System.out.println(player1[m]);
		}
		

		for(int m=0;m<player2.length;m++) {
				System.out.println(player2[m]);
		}
		

		for(int m=0;m<player3.length;m++) {
				System.out.println(player3[m]);
		}
		
		
//Assignment 3:
		
		System.out.println("---------------Assignment 3-----------------");
		
		int n[] = new int[5];
		n[0]=4;
		n[1]=3;
		n[2]=2;
		n[3]=1;
		n[4]=0;
		
		for(int k=0;k<n.length;k++) {
			System.out.println("n="+n[k]);
		}
		
		
		
		
		
		
		
		
		
	}

}
