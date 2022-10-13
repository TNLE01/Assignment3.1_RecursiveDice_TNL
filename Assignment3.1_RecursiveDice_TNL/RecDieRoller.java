/**
 * @author Truong Le
 *
 */
import java.util.Random;
public class RecDieRoller {
	
	Random gen = new Random();
	double numberOfRolls = 0;
	
	/**
	 * Print the number the die landed on, will continue to print until it lands on 2
	 */
	public void roll() {
		int number = gen.nextInt(6) + 1;
		System.out.println(number);
		numberOfRolls++;
		if (number == 2)
			return;
		roll();
	}
	
}
