package com.sample;

import java.util.Scanner;

public class IfAssign {

		
	public static void main(String[] args) {
	
		System.out.println("Enter the Number");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		if (num %2 ==0)
		{
			System.out.println( "Number is Even: " +num);
		}
		else
		{
		System.out.println("Number is Odd: "  +num);
		}
		
	}

}
