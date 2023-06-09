/**
 * 
 */
package introtojavabasics;

/**
 * @author DaisyLe
 *
 */
public class AssignmentOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 5;
		System.out.println(x);
		x += 5; //adds 5 to the value of x (which is now 10).
		System.out.println(x);
		x -= 5; //subtracts 5 from the value of x (which is now 5 again).
		System.out.println(x);
		x *= 5; // multiplies the value of x by 5 (which is now 25).
		System.out.println(x);
		x /= 5; // divides the value of x by 5 (which is now 5 again).
		System.out.println(x);
		x %= 5; //calculates the remainder of dividing x by 5 (which is 0).
		System.out.println(x);
		x <<= 5; //performs a left shift on x by 5 bits (which is now 0).
		System.out.println(x);
		x >>= 5; //performs a right shift on x by 5 bits (which is still 0).
		System.out.println(x);
		x &= 5; //performs a bitwise AND operation on x and 5 (which is still 0).
		System.out.println(x);
		x ^= 5; //performs a bitwise exclusive OR (XOR) operation on x and 5 (which is now 5).
		System.out.println(x);
		x |= 5; //performs a bitwise OR operation on x and 5 (which is still 5).
		System.out.println(x);
	}

}
