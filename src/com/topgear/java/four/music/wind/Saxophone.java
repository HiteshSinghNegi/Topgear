package com.topgear.java.four.music.wind;

import com.topgear.java.four.music.Playable;

/*4.	Write an interface called Playable, with a method void play();
Let this interface be placed in a package called music.
Write a class called Veena which implements Playable interface. 
Let this class be placed in a package music.string.
Write a class called Saxophone which implements Playable interface. 
Let this class be placed in a package music.wind.
Write another class Test in a package called live. Then,
a. Create an instance of Veena and call play() method
b. Create an instance of Saxophone and call play() method
c. Place the above instances in a variable of type Playable and then call play().
*/

public class Saxophone implements Playable{

	@Override
	public void play() {
		System.out.println("playing Saxophone ");
		// TODO Auto-generated method stub
		
	}

	
	
}
