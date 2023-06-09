package introtojavabasics;

public class VariablesAndDataTypes {

	public static void main(String[] args) {
		// A variable is a memory location - where we save stuff
		// small number
		byte smallNumber;
		// a middle sized number
		short aLittleBiggerNumber;
		// a little bit bigger
		int aLittleBitBiggerNumber;
		// long number
		long longerNumber;
		
		// decimal number
		double decimalNumber;
		float smallerDecimalNumber;
		
		// strings (sequence of characters)
		String name;
		String address;
		String password;
		String username;
		
		
		// what if I just want to save like true/false or yes/no
		
		boolean winOrLose;
		boolean yesOrNo;
		
		// single character
		char letterA;
		char ampersand;
		
		String myString = new String();
		myString = "I am placed in string pool";
		// The JVM creates the object in the string pool
		String myString2 = "I am placed in string pool";
		String myString3 = "Hello!";
		// different memory location but the same value
		
	}

}
