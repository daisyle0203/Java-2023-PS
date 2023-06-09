package introtojavabasics;
import java.util.Scanner;

public class RelationalDemo {

	public static void main(String[] args) {
		int a = 3, b = 4;
		boolean r;
		r = (a == b);
		System.out.println(r);
		r = (a != b);
		System.out.println(r);
		r = (a > b);
		System.out.println(r);
		r = (a < b);
		System.out.println(r);
		r = (a >= b);
		System.out.println(r);
		r = (a <= b);
		System.out.println(r);
		
		Scanner input = new Scanner(System.in);
		System.out.println(input instanceof Scanner);
		
		System.out.println(a<b && b<a);
		System.out.println(a>b && b>a);
		
		System.out.println(a<b || b<a);
		System.out.println(a>b || b>a);
	} 

}
