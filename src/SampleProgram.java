
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
		
		for(int item : results)//.Loops to display all the results to the console.
			System.out.println(item);

	}

}
