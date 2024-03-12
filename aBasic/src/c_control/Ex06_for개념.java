package c_control;

public class Ex06_for개념 {
	public static void main(String[] args) {

//		for(char ch = 'A'; ch <= 'Z'; ch++) {				// 초깃값; 조건문; 증감식;
//			System.out.print(ch + " ");
//		}
//		
//		for(char  ch = 'Z'; ch >= 'A'; ch--) {
//			System.out.print(ch + " ");
//		}
//		
//		for(char  ch = 'A'; ch <= 'S'; ch+=2) {
//			System.out.print(ch + " ");
//		}
//		
//		int hap = 0;
//		for(int i = 1; i <= 10; i++) {
//			hap += i;
//		}
//		System.out.print(hap);
//		
//		for(int i = 10; i >= 1; i--) {
//			System.out.print(i + " ");
//		}
//		
//		for(int i = 1; i <= 30; i+=3) {
//			System.out.print(i + " ");
//		}
//		
		int hol = 0, jjak = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				jjak += i;
			} else {
				hol += i;
			}
		}
		System.out.println("홀수의 합 : " + hol + "\n짝수의 합 : " + jjak);
		
	}
}
























































