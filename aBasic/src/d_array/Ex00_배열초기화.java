package d_array;

/*
 * 	변수 선언
 * 	int a;
 * 
 * 	값 지정
 * 	a = 10;
 * 
 * 	초기화
 * 	int b = 5;
 */

public class Ex00_배열초기화 {
	public static void main(String[] args) {

		// 배열 변수 선언
//		int [] kor;
		// 배열 객체 생성
//		kor = new int [5];
		
		// 초기화
		//int [] kor = new int [] {99, 88, 77, 66, 55};
		int [] kor = {99, 88, 77, 66, 55};
		
		// 값 지정
//		kor[0] = 99;
//		kor[1] = 88;
//		kor[2] = 77;
//		kor[3] = 66;
//		kor[4] = 55;
		
		int total = 0;
		for(int j = 0; j < 5; j++) {
			total += kor[j];
		}	//	end for[j]

		System.out.println("총점 : " + total);
		
	}
}






























