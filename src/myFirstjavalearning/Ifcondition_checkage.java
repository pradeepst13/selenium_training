package myFirstjavalearning;

import java.util.Scanner;

public class Ifcondition_checkage {
	private static Scanner sc;


	public static void main(String[] args) {
		int age;
		sc = new Scanner(System.in);
		System.out.println("Enter your age");
				age = sc.nextInt();	
		if (age>=18)
			 
        {

                   System.out.println("Your are eligible for voting");
        }
        else
        {
                   System.out.println(" Your are not eligibal for voting");
        }         

	}
	}


