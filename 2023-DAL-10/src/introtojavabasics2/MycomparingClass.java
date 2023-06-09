package introtojavabasics2;

public class MycomparingClass {
	Generic_functionInterface<Integer> compareTwoVar = new Generic_functionInterface<Integer>() {
		@Override
		public Integer compare(Integer a, Integer b) {
			// TODO Auto-generated method stub
			if (a > b) {
				return a;
			} else {
				return b;
			}
		}
	};

	Generic_functionInterface<String> stCompare = new Generic_functionInterface<String>() {
		public String compare(String a, String b) {
			// TODO Auto-generated method stub
			if (a.equals(b)) {
				return "true";
			} else {
				return "false";
			}
		}
	};

}
