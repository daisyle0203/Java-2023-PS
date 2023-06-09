package introtojavabasics2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArraylistExample {

	public static void main(String[] args) {
//		ArrayList<String> Mylist = new ArrayList<String>();
//		Mylist.add("New Jersey");
//		Mylist.add("Dallas");
//		Mylist.add("New York");
//		Mylist.add("Chicago");
//		Mylist.add("LA");
//		System.out.println("Return boolean :" + Mylist.contains("Chicago"));
//		System.out.println("Return index value of Element :" + Mylist.indexOf("Chicago"));
//		System.out.println("Returns the actual Element at the given index :" + Mylist.get(2));
//		System.out.println("Returns the length of the arraylist :" + Mylist.size());
//		// Remove the element at the given index. Returns the removed element.
//		// remove element at index 3
//		String removedElement = Mylist.remove(3);
//		System.out.println("Removed Element: " + removedElement);
//		// remove all elements
//		Mylist.clear();
//		System.out.println("ArrayList after clear(): " + Mylist);
//
//		/* Declare and initialize the List. */
//		List<String> listObj = Arrays.asList("Java", "Python", "JavaScript", "ReactJs");
//		System.out.println(listObj);
//
//		/* Declare and initialize the ArrayList. */
//		ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//		System.out.println(intList);

//		ArrayList<String> al = new ArrayList();
//		al.add("Jack");
//		al.add("Tyler");
//		al.add("James");
//
//		Iterator itr = al.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		ArrayList<String> al = new ArrayList();
//		al.add("Jack");
//		al.add("Tyler");
//		al.add("James");
//
//		// Enhanced for each loop
//		for (String st : al) {
//			System.out.println(st);
//		}

		// creating Generic Instance for box
//		Box<Integer> intBox = new Box<Integer>();
//		intBox.add(12);
//		intBox.add(24);
//		intBox.add(42);
//		intBox.add(45);
//		System.out.println(intBox.get());
//
//		// creating Generic Instance for box
//		Box<Float> floatBox = new Box<Float>();
//		floatBox.add(12.3f);
//		floatBox.add(18.5f);
//		floatBox.add(120.45f);
//		floatBox.add(85.4f);
//		System.out.println(floatBox.get());

		// create an ArrayList
		ArrayList<String> languages = new ArrayList<>();
		// add elements to ArrayList
		languages.add("Python");
		languages.add("Swift");
		languages.add("C");
		languages.add("JavaScript");
		System.out.println("Unsorted ArrayList: " + languages);
		// sort the ArrayList in ascending order
//		languages.sort(Comparator.reverseOrder());
		Collections.sort(languages);
		System.out.println("Sorted ArrayList: " + languages);

	}

}
