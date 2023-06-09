package introtojavabasics2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyRunner {

	public static void main(String[] args) throws FileNotFoundException {
//		System.out.println("===invoking regular method========");
//		// An object of type GenricMethod Example using default constructor
//		GenericMethodExample obj = new GenericMethodExample();
//		obj.printValues(43); // of type integer					
//		obj.printValues("Programmer"); // of type String
//		obj.printValues(54.43); // of type double
//		obj.printValues(true); // of type boolean
//
//		System.out.println("===invoking static method========");
//		GenericMethodExample.staticdisplayData(254);
//		GenericMethodExample.staticdisplayData("Java Developer");
//		GenericMethodExample.staticdisplayData(254.25);
//
//		Integer[] intArray = { 10, 20, 30, 40, 50 };
//		Character[] charArray = { 'J', 'A', 'V', 'A' };
//		System.out.println("Printing Integer Array");
//		obj.printArray(intArray);
//		System.out.println("Printing Character Array");
//		obj.printArray(charArray);

//		// initialize generic class
//		// with Integer data
//		GenericsClass<Integer> intObj = new GenericsClass<>(5);
//		System.out.println("Generic Class returns: " + intObj.getData());
//
//		// initialize generic class again
//		// with String data
//		GenericsClass<String> stringObj = new GenericsClass<>("Java");
//		System.out.println("Generic Class returns: " + stringObj.getData());
//
//		ElephantItem<Integer> ObjMove = new ElephantItem<>();
//		ObjMove.move(5, "NYC");
//		System.out.println(ObjMove.getItemBeingMoved() + " Item");
//		System.out.println(ObjMove.getLocationBeingMovedTo() + " Location");
//
//		// initialize generic class with Integer value
//		MathBox<Integer> mObj = new MathBox<Integer>(5);
//		// initialize generic class with double value
//		MathBox<Double> mObj2 = new MathBox<Double>(32.1);
//
//		System.out.println(mObj.sqrt());
//		System.out.println(mObj2.sqrt());
//		// MathBox mObj3 = new MathBox<Double>(" Perscholas"); // error
//		
//		// initialize the class with Integer data
//		DemoClass dObj = new DemoClass();
//		dObj.genericsMethod(25); // passing int
//		dObj.genericsMethod("Per Scholas"); // passing String
//		dObj.genericsMethod(2563.5); // passing float
//		dObj.genericsMethod('H'); // passing Char

		// initialize generic class
		// with String and Integer data

//		GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype("Per Scholas", 11025);
//
//		System.out.println(mobj.getValueOne());
//		System.out.println(mobj.getValueTwo());
//
//		// initialize generic class
//		// with String and String data
//		GMultipleDatatype<String, String> mobj2 = new GMultipleDatatype("Per Scholas", "Non profit");
//		System.out.println(mobj2.getValueOne());
//		System.out.println(mobj2.getValueTwo());
//
//		try {
//			// ----- change file path, as per your file location
//			String location = "/Users/diemle/Downloads/CourseData.csv";
//			File file = new File(location);
//			Scanner input = new Scanner(file);
//			ArrayList<Course> data = new ArrayList<Course>();
//
//			while (input.hasNextLine()) {
//				String Line = input.nextLine();
//				String[] splitedLine = Line.split(",");
//
//				// course cObj1 = new course(splitedLine[0], splitedLine[1], splitedLine[2]);
//				Course cObj = new Course();
//				cObj.setCode(splitedLine[0]);
//				cObj.setCourse_name(splitedLine[1]);
//				cObj.setInstructor_name(splitedLine[2]);
//
//				data.add(cObj);
//			}
//
//			for (Course c : data) {
//				System.out.println(c.getCode() + " | " + c.getCourse_name() + "|" + c.getInstructor_name());
//				System.out.println("===============================");
//			}
//
//		} catch (FileNotFoundException e) {
//			System.out.println("File not found! ");
//			e.printStackTrace();
//		}

		MycomparingClass compareObj = new MycomparingClass();
		int resultInteger = compareObj.compareTwoVar.compare(55, 50);
		System.out.println(resultInteger);

		String resultString = compareObj.stCompare.compare("h", "H");
		System.out.println(resultString);

	}

}
