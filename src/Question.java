import static java.lang.System.*;

import java.util.Scanner;

/**
 * The Main class where the solution to the given question starts executing
 *
 * @author Pranay Raju
 */
public class Question {

	/**
	 * The main method
	 */
	static public void main(String... args) {
		Scanner sc = new Scanner(in);
		out.print("ENTER THE STRING : ");
		String str = sc.next();
		out.println("Length of substring with max distinct characters : "
				+ new StringFinder(str).findSubStringWithMaxDistinctChars().length());
		sc.close();
	}
}