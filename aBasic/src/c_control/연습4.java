package c_control;
import java.util.Scanner;

public class 연습4 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("입력 : ");
		
//		숫자사각형 1
		int n = in.nextInt();
		int m = in.nextInt();
		
		for(int i = 1; i <= n * m; i++) {
			System.out.print(i + " ");
			if(i % m == 0) {
				System.out.println();
			}
		}
		
//		숫자사각형 3
//		int o = in.nextInt();
//		
//		for(int j = 0; j < o; j++) {
//			for(int i = o/o+j; i <= o * o; i+=o) {
//				System.out.print(i + " ");
//				if(j == o) {
//					System.out.println();
//				}
//			}
//			System.out.println();
//		}
		
//		숫자사각형 2
//		int p = in.nextInt();
//		int q = in.nextInt();
//		
//		for(int i = 1; i <= p * q; i++) {					//	ex) p=4, q=5
//			System.out.print(i + " ");						//	1 ~ (4*5) 출력 (정방향)
//			if(i % q == 0) {								//	i를 5로 나눈 나머지가 0이면
//				System.out.println();						//		줄 바꿈
//				if(i == p * q) { 							//		i가 (4*5)와 같다면
//					break; 									//			블록 탈출 후 (*)로 이동
//				} else {									//		i가 (4*5)와 다르다면
//					for(int j = i + q; j >= i + 1; j--) {	//			i+5부터 i+1까지 출력(역방향)
//						System.out.print(j + " ");			//
//					}
//				}
//				System.out.println();						//		줄 바꿈(*)
//				i += q;										//		역방향으로 출력한 만큼 i 증가
//			}
//		}
		
	}
}
