package e_method;

/*
 * 	Call by Reference
 * 
 * 		-메소드의 인자가 참조형인 경우
 * 
 * 	주소복사가 되어서 원본에 영향이 있음
 */

public class Ex05_CallByRef {
	public static void main(String[] args) {

		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");
		
		add(a, b);
		
		System.out.println("A = " + a + " B = " + b);

	}
	
	static void add(StringBuffer a, StringBuffer b) {
		a.append(b);										// a + b
		System.out.println("A = " + a + " B = " + b);		// 주소복사가 되어서 원본에 영향이 있음
	}
}











































