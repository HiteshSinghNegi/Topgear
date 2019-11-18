package com.topgear.java.three;


/*3.	Create an abstract class Instrument which is having the abstract function play.  
 * Create three more sub classes from Instrument which is Piano, Flute, Guitar. 
 * Override the play method inside all three classes printing a message 
             “Piano is playing  tan tan tan tan  ”  for Piano class
              “Flute is playing  toot toot toot toot”  for Flute class
              “Guitar is playing  tin  tin  tin ”  for Guitar class 
      Create an array of 10 Instruments.
      Assign different type of instrument to Instrument reference.
     Check for the polymorphic behavior of  play method.
*/


public class PlayInstruments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instrument instrument[] = new Instrument[] { new Guitar(),new Piano(),
				new Guitar(),new Flute(), new Piano(),new Guitar(), new Piano(),
				new Flute(), new Piano(),new Guitar() };
		
		for(Instrument in: instrument){
			in.play();
		}

	}

}
