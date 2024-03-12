package c_control;

public class Ex08_for중첩2 {
	public static void main(String[] args) {
		
		// A ~ Z 한줄 출력
//		for(char ch = 'A'; ch <= 'Z'; ch++) {
//			System.out.print(ch+ " ");
//		}
//		System.out.println();
		
//		for(int i = 0; i < 26; i++) {
//			for(char ch = 'A'; ch <= 'Z'; ch++) {
//				System.out.print(ch+ " ");
//			}
//			System.out.println(i);
//		}
		
		//**
//		for(int i = 0; i < 26; i++) {
//			for(char ch = 'A'; ch <= 'A' + i; ch++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
		
//		for(int i = 0; i < 26; i++) {
//			for(char ch = 'A'; ch <= 'Z' - i; ch++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
		
		//3번
		for(int i = 26; i > 0; i--) {
			for(char ch = 'Z'; ch - i +1 >= 'A'; ch--) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
		System.out.println("\n*******************************\n");
		
		//4번
		for(int i = 0; i < 26; i++) {
			for(char ch = (char)('A' + i); ch <= 'Z'; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}
}

























































