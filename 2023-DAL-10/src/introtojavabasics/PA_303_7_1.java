/**
 * 
 */
package introtojavabasics;

import java.util.Scanner;

/**
 * @author DaisyLe
 *
 */
public class PA_303_7_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Write a program that creates an array of integers with a length of 3. 
		 * Assign the values 1, 2, and 3 to the indexes. Print out each array element.
		 */
		
//		int[] arr = new int[3];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		for ( int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		/*
		 *  Write a program that returns the middle element in an array. 
		 *  Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
		 */
//		
//		int[] arr = {13, 5, 7, 68, 2};
//		int middleElement = arr[arr.length /2];
//		System.out.println("The middle element in the array is " + middleElement);
		
		/*
		 *  Write a program that creates an array of String type and initializes it with the strings “red,” “green,” “blue,” and “yellow.” 
		 *  Print out the array length. Make a copy using the clone( ) method. 
		 *  Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
		 */
		
//		String[] colors = {"red", "green", "blue", "yellow"};
//		System.out.println(colors.length);
//		String[] copiedColors = colors.clone();
//		System.out.println(Arrays.toString(copiedColors));
//		
		/*
		 * Write a program that creates an integer array with 5 elements (i.e., numbers). 
		 * The numbers can be any integers.  
		 * Print out the value at the first index and the last index using length - 1 as the index. 
		 * Now try printing the value at index = length (e.g., myArray[myArray.length] ).  
		 * Notice the type of exception which is produced. 
		 * Now try to assign a value to the array index 5. You should get the same type of exception.
		 */
		
//		int[] nums = { 1, 2, 6, 7, 8};
//		System.out.println("The value at the first index of nums is " + nums[0]);
//		System.out.println("The value at the last index of nums is " + nums[nums.length -1]);
//		System.out.println("The value at index = length is " + nums[nums.length]); // out of bounds error
//		System.out.println("The value at index = length is " + nums[5]); // same error
		
		/*
		 *  Write a program where you create an integer array with a length of 5. 
		 *  Loop through the array and assign the value of the loop control variable (e.g., i) 
		 *  to the corresponding index in the array.
		 */
		
//		int[] arr = new int[5];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i;
//		}
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
		/*
		 * Write a program where you create an integer array of 5 numbers. 
		 * Loop through the array and assign the value of the loop control variable multiplied by 2 
		 * to the corresponding index in the array.
		 */
		
//		int[] arr = new int[5];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i * 2;
//		}
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		/*
		 * Write a program where you create an array of 5 elements. 
		 * Loop through the array and print the value of each element, except for the middle (index 2) element.
		 */
		
//		int[] arr = {1, 5, 6, 8, 9};
//		for( int i = 0; i < arr.length; i++) {
//			if( i == 2) {
//				continue;
//			}
//			System.out.println(arr[i]);
//		}
		
		/*
		 * Write a program that creates a String array of 5 elements 
		 * and swaps the first element with the middle element without creating a new array.
		 */
		
//		String[] colors = {"red", "blue", "green", "pink", "white"};
//		String middleElement = colors[colors.length/2];
//		String firstElement = colors[0];
//		colors[0] = middleElement;
//        colors[colors.length / 2] = firstElement;
//		System.out.println(Arrays.toString(colors));
		
		/*
		 * Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. 
		 * Print the array in ascending order, and print the smallest and the largest element of the array. 
		 * The output will look like the following:
			Array in ascending order: 0, 1, 2, 4, 9, 13
			The smallest number is 0
			The biggest number is 13 
		 */
		
//		int[] arr = {4,2,9,13,1,0};
//		Arrays.sort(arr);
//		System.out.println("Array in ascending order: " + Arrays.toString(arr));
//		System.out.println("The smallest number: " + arr[0]);
//		System.out.println("The biggest number: " + arr[arr.length - 1]);
		
		/* Create an array that includes an integer, 3 strings, and 1 double. 
		 * Print the array.
		 */
		
//		Object[] mixedArr = {9, "vanila", "ice", "cream", 9.99};
//		System.out.println(Arrays.toString(mixedArr));
		
		/*
		 * Write some Java code that asks the user how many favorite things they have. 
		 * Based on their answer, you should create a String array of the correct size. 
		 * Then ask the user to enter the things and store them in the array you created. 
		 * Finally, print out the contents of the array.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("How many favorite things do you have?");
		int numOfFavThings = input.nextInt();
		input.nextLine();
		
		String[] favThings = new String[numOfFavThings];
		
		for(int i =0; i < numOfFavThings; i++) {
			System.out.println("Enter your favorite thing: " );
			favThings[i] = input.nextLine();
		}
		
		System.out.println("Your favorite things are: ");
		for(int i =0; i < numOfFavThings; i++) {
			System.out.println(favThings[i]);
		}
		
	}

}
