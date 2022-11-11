package practise.com;

import java.util.Scanner;

public class Gradeapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		System.out.println("please enter your marks");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(marks >= 80  &&   marks<=100 ) {
			System.out.println("your grade is a");
		}
		else if(marks >=   60 &&   marks<= 800 ) {
			System.out.println("your grade is b");
		}
		else if(marks >= 40  &&   marks<=60 ) {
			System.out.println("your grade is c");
		}
		else if(marks >= 30  &&   marks<= 40 ) {
			System.out.println("your grade is d");
		}
		else {
			System.out.println("your grade is f");

			
		}
		

	}

}
