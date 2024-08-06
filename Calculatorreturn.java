package com.sample;

public class Calculatorreturn {

	int a,b,c;
	
	public int add(int a, int b)
	{
	
			return a+b;
			
	}
	public int sub(int a, int b)
	{
	
			return a-b;
			
	}
	public int mul(int a, int b)
	{
	
			return a*b;
			
	}
	public int div(int a, int b)
	{
	
			return a/b;
			
	}
	public int mod(int a, int b)
	{
	
			return a%b;
			
	}
	public static void main(String[] args) {
		
		Calculatorreturn cal= new Calculatorreturn();
	    int c= cal.add(5, 2);
	   System.out.println("Addition is " + c );
	   int c1= cal.sub(100, 50);
	   System.out.println("Subtraction is " + c1 );
	   int c2=cal.mul(40, 2);
	   System.out.println("Multiplication is " + c2 );
	   int c3= cal.div(100, 20);
	   System.out.println("Division is "+ c3);
	   int c4= cal.mod(10, 5);
	   System.out.println("Mod is "+ c4);
		
		

	}

}
