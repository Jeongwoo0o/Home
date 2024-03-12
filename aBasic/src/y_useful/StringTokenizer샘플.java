package y_useful;
import java.util.*;

public class StringTokenizer샘플 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("점수 입력(90/80/70) : ");	// 90/70/80
		String sent = input.nextLine();
		
		StringTokenizer st = new StringTokenizer(sent, "/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken()); 	// 남아있는 토큰 확인
		}
		
		//ex) st.countTokens(); -> for() 이용

	}
}




































