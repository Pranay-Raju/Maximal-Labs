import java.util.HashMap;
import java.util.Map;

/**
 * The class that does the job of taking the input string and does the task of
 * finding the length of smallest substring with maximum distinct characters
 * 
 * @author Pranay Raju
 */
public class StringFinder {

	/**
	 * original string
	 */
	private String str;
	/**
	 * number of distinct characters in original String
	 */
	private int distinctCharsCount;

	public StringFinder(String str) {
		this.str = str;
		distinctCharsCount = (int) str.chars().distinct().count();
	}

	/**
	 * The method to find the substring with max distinct chars.<br>
	 * <h3>Algorithm used:</h3> Count the number of times each char is repeated
	 * and store in a count Array Repeat until the number of chars counted
	 * equals dsistinctCharsCount. Once reached use another index to traverse
	 * from beginning and upon traversing reduce the count of the char in count
	 * Array. Once the Count Array gets the count of current char as 1 the
	 * subString is from start index to the ending where the initial index
	 * stopped.
	 * 
	 * @return subString with max distinct chars
	 * 
	 * @author Pranay Raju
	 */
	public String findSubStringWithMaxDistinctChars() {

		int start = 0, startIndex = -1;
		int minLength = str.length();
		int count = 0;

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int j = 0; j < str.length(); j++) {

			if (map.get(str.charAt(j)) == null) {
				map.put(str.charAt(j), 1);
				count++;
			} else {
				map.replace(str.charAt(j), map.get(str.charAt(j)) + 1);
			}

			if (count == distinctCharsCount) {

				while (map.get(str.charAt(start)) > 1) {
					if (map.get(str.charAt(start)) > 1)
						map.replace(str.charAt(start), map.get(str.charAt(start)) - 1);
					start++;
				}

				int windowLength = j - start + 1;
				if (minLength > windowLength) {
					minLength = windowLength;
					startIndex = start;
				}
			}
		}

		return str.substring(startIndex, startIndex + minLength);
	}

}