/**
 * 
 */
package introtojavabasics;

/**
 * @author DaisyLe
 *
 */
public class PA_303_2_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Task 1
//		int x;
//
//		// Value: 2 (Binary: 10)
//		x = 2;
//		System.out.println("Original value: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
//
//		x = x << 1; // Shift left by 1
//		// Predicted value: 4 (Binary: 100)
//		System.out.println("Shifted value: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
//
//		System.out.println();
//
//		// Value: 9 (Binary: 1001)
//		x = 9;
//		System.out.println("Original value: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
//
//		x = x << 1; // Shift left by 1
//		// Predicted value: 18 (Binary: 10010)
//		System.out.println("Shifted value: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
//
//		System.out.println();
//
//		// Value: 17 (Binary: 10001)
//		x = 17;
//		System.out.println("Original value: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
//
//		x = x << 1; // Shift left by 1
//		// Predicted value: 34 (Binary: 100010)
//		System.out.println("Shifted value: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
//
//		System.out.println();
//
//		// Value: 88 (Binary: 1011000)
//		x = 88;
//		System.out.println("Original value: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
//
//		x = x << 1; // Shift left by 1
//		// Predicted value: 176 (Binary: 10110000)
//		System.out.println("Shifted value: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");

//		// Task 2
//		int x;
//
//		// Value: 150 (Binary: 10010110)
//		x = 150;
//		System.out.println("Original value: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
//
//		x = x >> 2; // Shift right by 2
//		// Anticipated value: 37 (Binary: 100101)
//		System.out.println("Shifted value: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
//
//		System.out.println();
//
//		// Value: 225 (Binary: 11100001)
//		x = 225;
//		System.out.println("Original value: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
//
//		x = x >> 2; // Shift right by 2
//		// Anticipated value: 56 (Binary: 11100)
//		System.out.println("Shifted value: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
//
//		System.out.println();
//
//		// Value: 1555 (Binary: 11000001111)
//		x = 1555;
//		System.out.println("Original value: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
//
//		x = x >> 2; // Shift right by 2
//		// Anticipated value: 388 (Binary: 1100001)
//		System.out.println("Shifted value: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
//
//		System.out.println();
//
//		// Value: 32456 (Binary: 111111011111000)
//		x = 32456;
//		System.out.println("Original value: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");
//
//		x = x >> 2; // Shift right by 2
//		// Anticipated value: 8114 (Binary: 1111110111)
//		System.out.println("Shifted value: " + x + " (Binary: " + Integer.toBinaryString(x) + ")");

		// Task 3
//		int x = 7;
//		int y = 17;
//
//		// Predicted result: 1 (Binary: 00000001)
//		int z = x & y;
//
//		System.out.println("x: " + x);
//		System.out.println("y: " + y);
//		System.out.println("z: " + z);
//		System.out.println("Binary z: " + Integer.toBinaryString(z));

		// Task 4
//		int x = 7;
//		int y = 17;
//
//		// Predicted result: 23 (Binary: 00010111)
//		int z = x | y;
//
//		System.out.println("x: " + x);
//		System.out.println("y: " + y);
//		System.out.println("z: " + z);
//		System.out.println("Binary z: " + Integer.toBinaryString(z));

		// Task 5
//		int number = 5;
//
//		System.out.println("Before increment: " + number);
//
//		number++;
//
//		System.out.println("After increment: " + number);

		// Task 6
//		int number = 5;
//
//		// Increment using the assignment operator
//		number = number + 1;
//		System.out.println("After increment using assignment operator: " + number);
//
//		// Increment using the compound assignment operator
//		number += 1;
//		System.out.println("After increment using compound assignment operator: " + number);
//
//		// Increment using the postfix increment operator
//		number++;
//		System.out.println("After increment using postfix increment operator: " + number);

		// Task 7
		int x = 5;
		int y = 8;

		int sum = ++x + y;
		System.out.println("Sum with prefix increment: " + sum);

		x = 5; 
		
		sum = x++ + y;
		System.out.println("Sum with postfix increment: " + sum);
	}

}
