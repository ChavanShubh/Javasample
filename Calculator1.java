package com.sample;

public class Calculator1 {
	int a,b,c;
	public void add(int a, int b)
	{
	
		c= a + b;
		System.out.println("Addition of a and b: " + c);
		
	}
	public void sub(int a, int b)
	{
		c= a - b;
		System.out.println("Subtraction of a and b: " + c);
	}
	public void mul(int a, int b)
	{
		c= a * b;
		System.out.println("Multiplication of a and b: " + c);
	}
	public void div(int a, int b)
	{
		c= a / b;
		System.out.println("Division of a and b: " + c);
	}
	public void mod(int a, int b)
	{
		c= a % b;
		System.out.println("Mod of a and b: " + c);
	}
	
	

	public static void main(String[] args) {

		Calculator1 ca= new Calculator1();
		ca.add(5,3);
		ca.sub(10, 5);
		ca.mul(5, 4);
		ca.div(14, 2);
		ca.mod(10, 5);
				
		

	}

}
