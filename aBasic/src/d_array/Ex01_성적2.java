package d_array;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex01_성적2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("5명의 국어 점수를 입력(ex. 99/88/77) : ");
		String score_str = input.nextLine();
		
		StringTokenizer st = new StringTokenizer(score_str, "/");
		int cnt = st.countTokens();
		int [] score = new int[cnt];
		
		int total = 0;
		for(int i = 0; i < 5; i++) {
			score[i] = Integer.parseInt(st.nextToken());
			total += score[i];
		}
		System.out.println("총점 : " + total + "\n평균 : " + total/5);
		
	}
}









































