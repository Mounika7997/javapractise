package practise.com;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        String username = sc.nextLine();
        //System.out.println("username is :" + username);
        System.out.println("please enter your age");
        int age = sc.nextInt();
        if (age >=18) {
        	System.out.println("hey " + username  + " you are eligible to vote ");
        }else {
        	System.out.println(username + " you are  kid you are not eligible to vote ");
        }
        
	}
}
