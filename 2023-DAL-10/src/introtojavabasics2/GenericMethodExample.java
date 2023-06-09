package introtojavabasics2;

import java.util.List;

public class GenericMethodExample {
	public <T> void printValues(T value) {
		System.out.println("Value : " + value);
	}

	public static <T> void staticdisplayData(T value) {
		System.out.println(value);
	}

	public <E> void printArray(E[] elements) {
		for (E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	
	// accessing the elements in the list (read access)
	public static double sum(List<? extends Number> myList, int count) {
		double sum=0.0;
		for (Number i: myList) {
			sum+=i.doubleValue();
		}
		return sum;
	}
	
	// adding the elements in the list (write access)
	public static void add(List<? super Number> myList, int count) {
		for (int i = 0; i< count; i++) {
			myList.add(i);
		}
	}


}
