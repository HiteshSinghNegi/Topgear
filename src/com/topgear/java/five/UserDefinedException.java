package com.topgear.java.five;

public class UserDefinedException extends Throwable {

	public UserDefinedException(int age) {
		/* super(); */

		if (age < 18) {
			System.out.println("underage");
		}
		if(age >=60){
			System.out.println("Overage");
		}
	}

}
