package com.topgear.java.one;

public class FactorialN {

	/**
	 * @param args
	 */
	
	
/*1.	Write a program to print factorial of N ( without using any loop)*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 10;
		int out=fact(number);
		System.out.println("Factorial of "+number+" is = "+out);
		
	}

	private static int fact(int number) {
		if(number==0){
			return 1;
		}
		
		return number*fact(number-1);
	}

}
