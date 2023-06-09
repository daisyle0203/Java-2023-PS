package introtojavabasics2;

import java.util.LinkedList;

public class LinkedListLoop {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("John");
		l.add("Sara");
		l.add("Susan");
		l.add("Betty");
		l.add("Nathan");
		System.out.println("The LinkedList elements are: ");
		// Enhanced for each loop
		for (String st : l) {
			System.out.println(st);
		}

	}

}
