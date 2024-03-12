package a_datatype;

public class Ex06_StringSpecial {
	public static void main(String[] args) {
		//************************
		//	String 클래스는 참조형이다.
		//	전무후무 유일하게 딱 하나
		//	String 클래스만 new 안써도 된다.
		
//		String hong = new String("홍길동");
//		String dong = new String("홍길동");
		String hong = "홍길동";
		String dong = "홍길동";
		
		System.out.println(hong);
		System.out.println(dong);
		
		if(hong == dong) {
			System.out.println("주소가 같다");
		} else {
			System.out.println("주소가 다르다");
		}
		
		if(hong.equals(dong)) {
			System.out.println("내용이 같다");
		} else {
			System.out.println("내용이 다르다");
		}

	}
}
