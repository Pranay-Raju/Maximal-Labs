/**
 * The class that does the job of taking the input string
 * and does the task of finding the length of smallest substring
 * with maximum distinct characters
 * 
 * @author Pranay Raju	
 */
public class StringFinder{
	
	/**
	 * original string
	 */
	private String str;
	/**
	 * number of distinct characters in original String
	 */
	private int distinctCharsCount;
	
	public StringFinder(String str){
		this.str =str;
		distinctCharsCount = (int) str.chars().distinct().count();
	}

	/**
	 * The method to find the substring with max distinct chars.
	 * 
	 * @return subString with max distinct chars
	 * 
	 * @author Pranay Raju
	 */
	public String findSubStringWithMaxDistinctChars(){
		return null; 
	 }	
	
}