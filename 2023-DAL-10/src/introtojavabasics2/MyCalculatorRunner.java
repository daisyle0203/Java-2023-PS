package introtojavabasics2;

public class MyCalculatorRunner {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int result_Abstractmethod = c.Fobj.sum(5, 5);
		System.out.println("Result Abstract method " + result_Abstractmethod);

		int result_defaultMethod = c.Fobj.multiply(5, 5);
		System.out.println("Result defaultmethod " + result_defaultMethod);
	}

}
