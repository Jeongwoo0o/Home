package e_method;

//	* String 특별 경우
//		- 내용이 변경되면 메모리를 새로 생성

public class Ex05_CallByString {
	public static void main(String[] args) {

		String a = "안녕";
		String b = "하이";
		
		add(a, b);
		
		System.out.println("A = " + a + " B = " + b);

	}
	
	static void add(String a, String b) {
		a += b;
		System.out.println("A = " + a + " B = " + b);		
	}
}























































