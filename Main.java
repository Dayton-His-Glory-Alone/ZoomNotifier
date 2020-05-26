import java.util.Scanner;

/**
 * 
 */

/**
 * @author Dayton
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	AttendantChecker ac = new AttendantChecker();
	Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the amount of required participants before you are notified: ");
		int required = 0;
		if (scan.hasNextInt()) {
			required = scan.nextInt();
		} else {
			System.out.println("Invalid input");
		}
		ac.setReqNum(required);
		System.out.println("Alright, we'll notify you when someone has joined your meeting");
		ac.check();
	scan.close();
	}

}
