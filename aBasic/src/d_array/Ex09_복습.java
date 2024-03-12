package d_array;

public class Ex09_복습 {
	public static void main(String[] args) {

		char[][] star = new char[3][4];						// 3행 4열
//		char[][] star = new char[4][4];						// [2] 4행 4열
//		char[][] star = new char[4][];						// [3] 4행 ?열
		
		// 각각 char 공간에 '*' 저장하기
		for(int i = 0; i < star.length; i++) {				// star의 행의 수(3) 만큼 반복
//			star[i] = new char[i+1];						// [3]
			for(int j = 0; j < star[i].length; j++) {		// star의 i행의 수(4) 만큼 반복
//			for(int j = 0; j < i+1; j++) {					// [2] star의 i행+1 만큼 반복
//			for(int j = 0; j < star[i].length; j++) {		// [3] star의 i행의 수(i+1) 만큼 반복
				star[i][j] = '*';							// i=0 -> j1,2,3,4 / i=1 -> j1,2,3,4 / i=3 -> j1,2,3,4
			}	//end for(j)
		}	//end for(i)

		//출력
		for(int i = 0; i < star.length; i++) {				// star의 길이(3 : 행의 수)
			for(int j = 0; j < star[i].length; j++) {		// star의 i행의 길이(4 : 열의 수)
				System.out.print(star[i][j] + " ");
			}	//end for(j)
			System.out.println();
		}	//end for(i)
		
	}
}




































