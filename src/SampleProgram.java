/*
 * Created by jester155
 * This is a sample program of how to use my dice class
 * This code is fully commented and should be easy enough to use in your application
 */
public class SampleProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dice dice = new Dice(); //.Creates an object called dice
		
		dice.setNumberOfDice(3);//.Sets the number of dice to 3
		System.out.println("Enter in three dice you would like to use. d4, d12, d6, etc.");//.Prompts the user
		System.out.println("press enter after each input");
		dice.setMultipleDice();//.Asks the user to put in tree dice in the console
		
		int[] results = dice.rollDice();//.Gets the results of rolling the dice and puts it into an array
		String[] diceToUse = dice.getSelectedDie();
		for (int i = 0; i < diceToUse.length; i++) {//.Loops to display all the results to the console.
			System.out.print(diceToUse[i] + ": ");//.Gets the dice that the user input
			System.out.println(results[i]); //.Shows the result of each dice rolled.
		}

	}

}
