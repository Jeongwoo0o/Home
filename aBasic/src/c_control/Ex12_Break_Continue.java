package c_control;

/*
 * 		break		: 블럭을 벗어나는 문장
 * 		continue	: 블럭의 끝으로 가는 문장
 */

public class Ex12_Break_Continue {
	public static void main(String[] args) {

		END:
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				//if(j == 1) break;
				//if(j == 1) continue;
				//if(j == 1) break END;
				if(j == 1) continue END;
				System.out.println("<" + i + ", " + j + ">");
			}	//	end for(j)
			System.out.println("데이터");
		}	//	end for(i)
		
	}
}



































