package e_method;

import java.util.Scanner;

public class Ex09_복습2 {
	public static void main(String[] args) {

		char[][] ch = input();								// [1]input()으로 이동 / [11]input()에서 'ch'를 받은 후 저장
		output(ch);											// [12]output()에 'ch' 전달

	}

	/**
	 * 	역할 : 두 정수와 알파벳 문자 하나를 입력받음
	 * 	[예] 두 정수와 알파벳 문자 하나를 입력 : 
	 * 		3 4 F
	 */
	static char[][] input() {
		Scanner in = new Scanner(System.in);
		System.out.print("두 정수와 알파벳 문자 하나를 입력 : ");
		int h = in.nextInt();
		int y = in.nextInt();
		String s = in.next();
		char c = s.charAt(0);

		char[][] ch = makeSquare(h, y, c);					// [2]makeSquare()에 변수 h, y, c 전달 / [9]makeSquare()에서 'ch' 받음
		return ch;											// [10]'ch'를 main()에 반환
	}

	/**
	 * 	역할 : input()함수에서 입력받은 첫번째 정수만큼의 행과
	 * 			두번째 정수만큼의 열의 배열을 만들어서
	 * 			입력받은 문자로 시작하는 배열값을 저장합니다
	 * 
	 * 	[예]
	 * 		F	G	H	I
	 * 		J	K	L	M
	 * 		N	O	P	Q
	 */
	static char[][] makeSquare(int h, int y, char c) {		// [3]input()에서 변수 h, y, c 받음
		char[][] ch = new char[h][y];						// [4]행=h, 열=y 배열 생성
		
		for(int i = 0; i < ch.length; i++) {						// [5]h길이의 행
			for(int j = 0; j < ch[i].length; j++) {					// [6]y길이의 열
				ch[i][j] = c++;								// [7]'ch[i][j]'에 차례대로 문자를 넣고,
			}	//end for(j)								// 문자 하나씩 증가
		}	//end for(i)
		
		return ch;											// [8]배열 'ch'를 input()으로 반환
	}

	/**
	 * 	 역할 : makeSquare()함수 안에서 생성한 문자 배열에 저장된 문자를 화면에 출력
	 */
	static void output(char[][] ch) {						// [13]main()에서 'ch' 받음
		for(int i = 0; i < ch.length; i++) {				// [14]'ch'의 길이(행의 수)
			for(int j = 0; j < ch[i].length; j++) {			// [15]'ch'의 i행의 길이(열의 수)
				System.out.print(ch[i][j] + " ");			// [16]'ch' 차례대로 출력
			}	//end for(j)
			System.out.println();
		}	//end for(i)
	}
}













































