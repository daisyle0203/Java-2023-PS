/**
 * 
 */
package introtojavabasics;

/**
 * @author DaisyLe
 *
 */
public class StringMethodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String friday = new String("Today is Friday");
		// find String size:
		int fridayLength = friday.length();// 15
		System.out.println(fridayLength);
		boolean isFridayEmpty = friday.isEmpty();// false
		// ""
		boolean isFridayBlank = friday.isBlank();// false
		// " "

		String saturday = new String("Today is Saturday");
		boolean friEqSat = friday.equals(saturday); //false

		String friday2 = "today is friday";
		boolean friEqFri2 = friday.equalsIgnoreCase(friday2); // true
		
		// Compare two String objects lexicographically
		int comp = friday.compareTo(friday2); // -32
		System.out.println(comp);
		// Convert an integer to a String
		String compString = String.valueOf(comp); //-32
		System.out.println(compString);

		boolean startsWithT = friday.startsWith("T"); // true
		System.out.println(startsWithT);
		boolean endsWithY = friday.endsWith("Y");  // false
		System.out.println(endsWithY);

		int indexOfO = friday.indexOf('o'); // 1

		int lastIndexOfy = friday.lastIndexOf('y'); // 12

		boolean containsAnA = friday.contains("a"); // true

		// Save all the words as an array:

		String[] words = friday.split(" ");
		// print://enhanced for loop to print the
		// word line by line:
		for (String word : words) {
			System.out.println(word);
		}

		// Print the results of everything at the top:it would print "Today", "is", "Friday"
		// And write good comments: the split method split friday string to words by space
		// the loop goes through each word and print it out in the console.
		
		// write code that extracts the F from friday (charAt)
		char letterF = friday.charAt(9);
		System.out.println(letterF);

		// write code that extracts the substring 'today'
		// and saves in a new string called today (substring)
		String today = friday2.substring(0,5);
		System.out.println(today);

		// convert the string to lowercase and save in another string
		// (toLowerCase)
		String fridayLower = friday.toLowerCase();
		System.out.println(fridayLower);

		// convert the string to uppercase and save in another string
		// (toUpperCase)
		String fridayUpper = friday.toUpperCase();
		System.out.println(fridayUpper);

		// join friday with ". Thank you for being here and save
		// as another string
		// (concat)
		String fridayConcat= friday.concat(" .Thank you for being here.");
		System.out.println(fridayConcat);

		// Replace friday with friday2 and save in new
		// string called friday3 (replace)
		String friday3 = friday2.replace("friday", "friday2");
		System.out.println(friday3);
	}

}
