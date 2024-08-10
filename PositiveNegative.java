package com.sample;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		if (num==0)
		{
			System.out.println("Please enter number other than 0");
		}
		
		else if(num> 0)
		{
			System.out.println( "Number is Positive: " +num);
		}
		else
		{
		System.out.println("Number is Negative: "  +num);
		}
		
			

	}

}
