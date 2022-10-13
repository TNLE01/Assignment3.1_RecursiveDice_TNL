/**
 * @author Truong Le
 *
 */
import java.util.Scanner;
public class RecDieRollerDriver {
	
	public static void main(String[] args) {
		
		RecDieRoller die = new RecDieRoller();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while (run == true) {
			System.out.println("Type \"1\" for Question 1\n" + "Type \"2\" for Question 2\n" + "Type \"E\" for Exit\n");
			String input = scan.nextLine();
			if (input.equals("1"))
				die.roll();
			else if (input.equals("2")) {
				die.numberOfRolls = 0;
				for (int i = 0; i < 1000; i++) {
					die.roll();
				}
				System.out.println("Total Rolls: " + die.numberOfRolls);
				System.out.println("Mean Number Of Dice Rolls: " + die.numberOfRolls/1000);
			}
			else if (input.equals("E"))
				run = false;
		}
			
	}
	
}
