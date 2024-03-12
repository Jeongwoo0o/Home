package b_operator;

public class Ex07_이진논리 {
	public static void main(String[] args) {
		
		int a = 15;
		int b = 10;
		
		int and = a & b;			// a	00001111
									// b 	00001010
									// -------------
		System.out.println(and);	// &	00001010
		
		
		int or = a | b;				// a	00001111
									// b 	00001010
									// -------------
		System.out.println(or);		// |	00001111
		
		
		int xor = a ^ b;			// a	00001111
									// b 	00001010
									// -------------
		System.out.println(xor);	// ^	00000101
		
	}
}












































