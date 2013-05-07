
public class SampleProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dice dice = new Dice();
		
		dice.setNumberOfDice(3);
		dice.setMultipleDice();
		
		int[] results = dice.rollDice();
		
		for(int item : results)
			System.out.println(item);

	}

}
