package d_array;

/*
 * 	임의의 수 (랜덤 수)
 * 		
 * 		Math.random() : 0.0부터 1.0보다 작은 어떤 수
 * 		
 * 		ex) 0.0000008
 * 			0.5812052
 * 
 * 		Math.random() * 10
 * 
 * 		ex) 0.000008
 * 			5.812052
 *  		
 *  	(int)(Math.random() * 10)
 * 
 * 		ex) 0
 * 			5
 */

public class Ex04_Lotto {
	public static void main(String[] args) {
		
		int [] lotto = new int[6];
		
		// 로또 번호 생성 -> 임의의 수 생성 저장
		for(int i = 0; i < lotto.length; i++) {			
			lotto[i] = (int)(Math.random()*45) + 1;
			for(int j = 0; j < i; j++) {				// i=0,j=0 / i=1,j=0 / i=2,j=1
				if(lotto[i] == lotto[j]) {				// lotto[3] == lotto[2] -> i-=1
					i--;
				}	//	end if
			}	//	end for(j)
		}	//	end for(i)
		
		// 정렬
		for(int j = lotto.length-1; j > 0; j--) {
			for(int k = 0; k < j; k++) {
				if(lotto[k] > lotto[k+1]) {
					int temp 	= lotto[k];
					lotto[k] 	= lotto[k+1];
					lotto[k+1] 	= temp;
				}	//	end if
			}	//	end for(k)
		}	//	end for(j)
		
		// 출력
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	}
}







































