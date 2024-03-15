package d_array;

public class Ex07_로또 {
	public static void main(String[] args) {

		int [][] lotto = new int[5][6];
		
		// 로또번호 생성
		for(int i = 0; i < lotto.length; i++) {				// 0~5 반복
			for(int j = 0 ; j < lotto[i].length; j++) {		// 0~5 반복(i행 6개의 열 생성)
				lotto[i][j] = (int)(Math.random()*45) + 1;	// 랜덤 생성
				for(int k = 0; k < j; k++) {				// k<j일 때 ex) j=1
					if(lotto[i][k] == lotto[i][j]) {		// 0행0열 0행1열 비교
						j--;								// 같으면 j-=1;
					}	//end if
				}	//end for(k)
			}	//end for(j)
		}	//end for(i)
		
		// 정렬
		for(int i = 0; i < lotto.length; i++) {				// 행 0~4 반복(lotto.length(5))
			for(int j = lotto[i].length-1; j > 0; j--) {	// lotto[i].length-1(5) -> 5번 반복
				for(int k = 0; k < j; k++) {				// i행 0열~5열 비교
					if(lotto[i][k] > lotto[i][k+1]) {		// 참이면 교환
						int temp 	= lotto[i][k];
						lotto[i][k] 	= lotto[i][k+1];
						lotto[i][k+1] 	= temp;
					}	//end if
				}	//end for(k)
			}	//end for(j)
		}	//end for(i)
		
		// 삽입 정렬
//		for(int i = 0; i < lotto.length; i++) {
//			for(int j = 0; j < lotto[i].length; j++) {
//				
//			}	//end for(j)
//		}	//end for(i)
		
		// 출력
		for(int i = 0; i < lotto.length; i++) {				// 0~4 반복
			for(int j = 0; j < lotto[i].length; j++) {		// 0~5 반복
				System.out.print(lotto[i][j] + " ");		// 0행~4행 출력
			}	//end for(j)
			System.out.println();
		}	//end for(i)
		
	}
}
































