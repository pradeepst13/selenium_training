package myFirstjavalearning;

import java.util.Scanner;


public class pos_neg_zero {
	private static Scanner sc;

	public static void main(String[] args) {
		int number;
		sc = new Scanner(System.in);
		System.out.println("Enter number");
				number = sc.nextInt();	
		if (number>0)
			 
        {
                  System.out.println("Number is Postive");
        }
        else if (number<0)
        {
                   System.out.println("Number is Negative");
        }         
        else
		{
			System.out.println("Number is zero");
		}
		
	}
		
	}


