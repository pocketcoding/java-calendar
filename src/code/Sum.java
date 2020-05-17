package code;
import java.util.Scanner;

public class Sum {
	
	public static void main(String[] args) {
		
//		Getting the user Input
		int a, b;
		Scanner scanner = new Scanner(System.in);  // System.in : In java, it means Keyboard 
		String s1, s2;
		System.out.println("Type two numbers or characters : ");
		s1 = scanner.next();
		s2 = scanner.next();
		
//		System.out.println(s1 + ", " + s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		System.out.printf("%d plus %d equals %d", a, b, a+b); // Better than Systme.out.println
		scanner.close();
		
	}

}
