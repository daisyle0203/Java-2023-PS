package introtojavabasics2;

public class Calculator {
	FuncInterfaceExample Fobj = new FuncInterfaceExample() { // anonymous inner class
		@Override
		public int sum(int a, int b) {
			return a + b;
		}
	};

}
