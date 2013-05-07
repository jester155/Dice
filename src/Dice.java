/*
 * This is a simple coin flipping application
 * Use in any role playing video game or table top game
 * Can be used in any existing java project
 * Programmed specifically in jre7
 * Code written by Jester155
 */
import java.util.Random;

public class Dice {
	
	private Random r = new Random();
	//.Fields parallel arrays to facilitate shorter coding as well as to check the selected dice against it's sides
	private String[] diceString = {"d4" , "d6" , "d8" , "d10" , "d12" , "d20"};
	private int[] diceSides = {4 , 6 , 8 , 10 , 12 , 20}; 
	private String selectedDie;
	
	//.Constructors to set the dice from there or have no selected dice by default
	public Dice() {	}
	public Dice(String selectedDie) {
		for (int i = 0; i < diceSides.length; i++) 
			if(diceString[i].equals(selectedDie.toLowerCase())) {
				this.selectedDie = selectedDie.toLowerCase();
				break;
			}
	}
	
	//.sets the selected Dice to the proper and needed dice
	public void setSelectedDice(String selectedDie) {
		for (int i = 0; i < diceSides.length; i++) 
			if(diceString[i].equals(selectedDie.toLowerCase())) {
				this.selectedDie = selectedDie.toLowerCase();
				break;
			}
	}
	
	//.Rolls the selected die
	public int rollDice() {
		for (int i = 0; i < diceSides.length; i++) {
			if(this.selectedDie.equals(diceString[i])) {
				return r.nextInt(diceSides[i]) + 1;
			}	
		}
		return 0;
	}
	
	//.Gets a percent if needed (acts as a 10 sided die essentially returning "00,10,20,etc."
	public int getPercent() {
		int percent = r.nextInt(11);
		for(int i = 0 ; i < 10 ; i++) {
			if(percent == i) {
				return percent * 10;
			}
				
		}
		return 0;
	}
	
	//.Essentially acts as flipping a coin, returns 0 for "heads" or 1 for "tails"
	public boolean flipCoin() {
		if(r.nextInt(2) == 0)
			return true;
		else
			return false;
	}
}
