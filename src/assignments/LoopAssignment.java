package assignments;

import java.util.ArrayList;
import java.util.Collections;

/***
 * 
 * @author PALLABI
 * Date: 10th July 2022
 */

public class LoopAssignment {

	public static void main(String[] args) {
		
		System.out.println("-----Loop Assignment 1------");
		
		for(int i=1;i<=5;i++) {
			System.out.println("I am Batman");
		}
		
		
		System.out.println("-----Loop Assignment 2------");
		
		for(int i=1;i<10;i++) {
			System.out.println("I am Batman "+i);
		}

		
		
		System.out.println("-----Loop Assignment 3------");
		System.out.println("-----Print 10 to 1 using for------");
		
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		
		System.out.println("-----Loop Assignment 3------");
		System.out.println("-----Print 10 to 1 using while------");
		
		int j=10;
		while(j>=1) {
			System.out.println(j);
			j--;
		}
		
// Add Code for Assignment 3 - Do while loop
		
		
		System.out.println("-----Loop Assignment 4------");
		System.out.println("-----print \"Hello World\" ten times using while loop------");
		
		byte hw=10;
		while(hw>=1) {
			System.out.println("Hello World");
			hw--;
		}
		
		System.out.println("-----Loop Assignment 5------");
		System.out.println("---print 1 to 10 using while loop----");
		
		int a=1;
		while(a<=10) {
			System.out.println(a);
			a++;
		}
		
//Loop Assignment 6: WAP to find out the max number from the given positive numbers	
		
		System.out.println("-----Loop Assignment 6------");
		System.out.println("---WAP to find out the max number from the given positive numbers----");
		ArrayList<Integer> series = new ArrayList<Integer>();
		series.add(20);
		series.add(8);
		series.add(890);
		series.add(34);
		series.add(200);
		series.add(18);
		series.add(430);
		
		Collections.sort(series);
		System.out.println(series.get(series.size()-1));

//Loop Assignment 7
		
		System.out.println("-----Loop Assignment 7------");
		System.out.println("---print all odd and even numbers between 1 to 100----");
		System.out.println("Even Numbers");
		int b=2;
		while(b<=100) {
			System.out.println(b);
			b=b+2;
		}
		System.out.println("Odd Numbers");
		int c=1;
		while(c<=100) {
			System.out.println(c);
			c=c+2;
		}
		
		System.out.println("-----Loop Assignment 8------");
		System.out.println("--- 1 time Hi Java---");
		
		int i = 1;
		while(i<=1) {
		System.out.println("Hi Java");
		System.out.println("Output is an Infinite loop. So, adding break to get out of the loop");
		break;
		}
		
		System.out.println("-----Loop Assignment 9------");
		System.out.println("Print A-Z , a-z, 0-9 with the respective ASCII numbers on the console.");
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println("ASCII value of " + ch + ":" + (int)ch );			
		}
		for(char ch1='a'; ch1<='z'; ch1++) {
			System.out.println("ASCII value of " + ch1 + ":" + (int)ch1 );
		}
		for(char ch2='0'; ch2<='9'; ch2++) {
			System.out.println("ASCII value of " + ch2 + ":" + (int)ch2 );			
		}
		
		
		System.out.println("-----Loop Assignment 10------");
		System.out.println("Print this series");
		
		for(float f=1.0f;f<11.0;f++) {
			System.out.print(f + " ");
		}
		
		System.out.println("----------------");
		System.out.println("-----Loop Assignment 11------");
		System.out.println("Print 1 to 10 and break the loop once you find the multiplication of 7 with a message.");
		
		for(int k=1;k<11;k++) {
			if(k%7==0) {
				System.out.println("Bye, see you tomorrow.");
			break;
			}
			else
			System.out.println(k);
		}
		
		
		System.out.println("-----Loop Assignment 12 a------");
		System.out.println("Write a cricket score card system using for loop");
		
		for(int sc=0;sc<=100;sc++) {
			if(sc==0) {
				System.out.println("Zero - duck");
			}
			else if(sc==25) {
				System.out.println("good job");
			}
			else if(sc==50) {
				System.out.println("good job - half century");
			}
			else if(sc==100) {
				System.out.println("good job - century");
			}
			else {
				System.out.println(sc);
			}
		}
		
		
		System.out.println("-----Loop Assignment 12 b------");
		System.out.println("Write a cricket score card system using while loop");
		
		int sc1 =0;
		while(sc1<=100) {
			if(sc1==0) {
				System.out.println("Zero - duck");
			}
			else if(sc1==25) {
				System.out.println("good job");
			}
			else if(sc1==50) {
				System.out.println("good job - half century");
				}
			else if(sc1==100) {
				System.out.println("good job - century");
				//break;
			}
			else {
				System.out.println(sc1);
			}
			sc1++;
		}
		
		System.out.println("-----Loop Assignment 12 c------");
		System.out.println("Write a cricket score card system using switch");
		
		int score =50;
		switch(score) {
			case 0:
				System.out.println("Zero - duck");
				break;
				
			case 25:
				System.out.println("good job");
				break;
				
			case 50:
				System.out.println("good job - half century");
				break;
				
			case 100:
				System.out.println("good job - century");
				break;
				
			default:
				System.out.println(score);
				break;
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
	}


