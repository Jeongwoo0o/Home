package e_method;

public class Ex01_인자2 {
	public static void main(String[] args) {

		int a = 10, b = 20;
		method(a, b);
		System.out.println("a = " + a + " b = " + b);	// a = 10, b = 20
		
	}
	
	static void method(int a, int b) {
		a += b;
		System.out.println("a = " + a + " b = " + b);	// a = 30, b = 20
	}
	
}














































