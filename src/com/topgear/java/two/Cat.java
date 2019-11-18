package com.topgear.java.two;

/*2.	There is an animal class which has the common 
 * characteristics of all animals. Dog, Horse, 
 * Cat are animals(sub-class). 
 * Each can shout, but each shout is different. 
 * Use polymorphism to create objects of same 
 * and using an animal variable, make each of the animals shout.*/

public class Cat extends Animal{

	public void getVoice(){System.out.println( "meow meow");}
}
