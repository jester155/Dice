/*
 * This is a simple coin flipping application
 * Use in any role playing video game or table top game
 * Can be used in any existing java project
 * Programmed specifically in jre7
 * Code written by Jester155
 * For Shana
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Dice {
	//.Pubilicly used object references
	private Random r = new Random();
	private Scanner s = new Scanner(System.in);
	
	//.Fields parallel arrays to facilitate shorter coding as well as to check the selected dice against it's sides
	private String[] diceString = {"d4" , "d6" , "d8" , "d10" , "d12" , "d20"};
	private int[] diceSides = {4 , 6 , 8 , 10 , 12 , 20}; 
	private ArrayList<String> selectedDie = new ArrayList<>();
	private int numberOfDice;
	
	//.Constructors to set the dice from there or have no selected dice by default
	public Dice() {	}
	
	//.SETS FOR ONLY ONE DIE
	public Dice(String selectedDie) {
		for (int i = 0; i < diceSides.length; i++) 
			if(diceString[i].equals(selectedDie.toLowerCase())) {
				this.selectedDie.add(selectedDie.toLowerCase());
				break;
			}
	}
	
	//.Sets the number of dice to use as well as asks the user which dice to use
	public Dice(int numberOfDice) {
		this.numberOfDice = numberOfDice;
		for(int i = 0 ; i < this.numberOfDice ; i++) {
			String choice = s.next();
			for(int j = 0 ; j < this.diceString.length ; j++) {
				if(this.diceString[j].equals(choice) && ((this.selectedDie.contains(choice)) != true))
					this.selectedDie.add(choice);					
			}
		}
	}
	
	public void setNumberOfDice(int numberOfDice) {
		this.numberOfDice = numberOfDice;
	}
	
	public int getNumberOfDice() {
		return this.numberOfDice;
	}
	
	//.sets the selected Dice to the proper and needed die ONLY ONE DIE
	public void setSelectedDice(String selectedDie) {
		if(this.selectedDie.contains(selectedDie) == true) {
			for (int i = 0; i < diceSides.length; i++) 
				if(diceString[i].equals(selectedDie.toLowerCase())) {
					this.selectedDie.add(selectedDie.toLowerCase());
					break;
				}
		}
	}
	
	//.Use if the user needs to or wants to use more than one die
	public void setMultipleDice() {
		for(int i = 0 ; i < this.numberOfDice ; i++) {
			String choice = s.next();
			for(int j = 0 ; j < this.diceString.length ; j++) {
				if(this.diceString[j].equals(choice))
					this.selectedDie.add(choice);					
			}
		}
	}
	
	//.Rolls the selected die
	public int[] rollDice() {
		Collections.sort(selectedDie);
		int[] results = new int[selectedDie.size()]; 
		int counterForResults = 0;
		for(String item : selectedDie)
			for (int i = 0; i < diceSides.length; i++) 
				if(item.equals(diceString[i]))
					results[counterForResults++] = r.nextInt(diceSides[i]) + 1;
			return results;	
	}
	
	//.Removes all the dice from the selectedDie Array List field 
	public void resetDice() {
		this.selectedDie.removeAll(selectedDie);
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
