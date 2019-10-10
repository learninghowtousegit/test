package StackSkills;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackSkills {
	static Scanner hi;	
	public static void main(String[] args) {
		int yes = input();	
		if (yes == 10) {
			System.out.println(yes + " is equal to 10" );
		} else if (yes > 10) {
			System.out.println(yes + " is bigger than 10" );
		} else  {
			System.out.println(yes + " is less than 10" );
		}
	}
	static int input() {
		 hi = new Scanner(System.in);
		int hello = 0;
		System.out.println("Input pls");
		try {
			hello = hi.nextInt();
			
		} catch(InputMismatchException e) {
			System.out.println(hi + "is not an int, please try again");
			return input();	
		}
	 finally {
			hi.close();		
	}
		return hello;	
   }
}




