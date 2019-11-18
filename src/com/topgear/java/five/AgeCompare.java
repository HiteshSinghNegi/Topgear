package com.topgear.java.five;

/*5.	Write a program to accept name and age of a person 
 * from the command prompt(passed as arguments when you execute the class) 
 * and ensure that the age entered is >=18 and < 60. 
 * Display proper error messages. 
 * The program must exit gracefully after displaying the error message
 *  in case the arguments passed are not proper. 
 *  (Hint : Create a user defined exception class for handling errors.)*/

public class AgeCompare extends UserDefinedException{

	public AgeCompare(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if (args.length == 0) {
				throw new Exception();
			} else if (args.length == 1) {
				throw new Exception();
			}
			String name=args[0];
			
			int age= Integer.parseInt(args[1]);
			
			if(age<18 || age>=60){
				throw new UserDefinedException(age);
			}

		} catch (UserDefinedException e) {
			System.out.println(e);
		} catch (NumberFormatException e){
			System.out.println("Please enter a valid number for age");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Please provide name and age in the said sequence");
		//	e.printStackTrace();
		}

	}
}
