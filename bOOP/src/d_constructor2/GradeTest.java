package d_constructor2;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GradeTest {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("입력 : ");
		int s = in.nextInt();
		int[] jumsu = new int[s];
		
		System.out.print("점수 입력 : ");
		String a = in.next();
		
		System.out.println("점수들 : " + a);
		
		StringTokenizer st = new StringTokenizer(a, ",");	// ','를 기준으로 점수 분리
		int cnt = st.countTokens();							// 개수 세기
		
		for(int i = 0; i < jumsu.length; i++) {
			jumsu[i] = Integer.parseInt(st.nextToken());	// 분리된 점수들을 int로 형변환 후 jumsu[]에 넣기
		}
		
		GradeExpr g = new GradeExpr(jumsu);					// 변수 선언 + 객체 생성 / jumsu 값 보내기
		//-------------
		
//		Scanner in = new Scanner(System.in);
//		System.out.print("입력 : ");
//		String a = in.nextLine();
		
//		StringTokenizer st = new StringTokenizer(a, ",");	// ','를 기준으로 점수 분리
//		int cnt = st.countTokens();							// 개수 세기
//		int[] jumsu = new int[cnt];							// 개수만큼 배열 생성
		
//		System.out.println("점수들 : " + a);3
		
//		for(int i = 0; i < cnt; i++) {
//			jumsu[i] = Integer.parseInt(st.nextToken());	// 분리된 점수들을 int로 형변환 후 jumsu[]에 넣기
//		}
//		GradeExpr g = new GradeExpr(jumsu);					// 변수 선언 + 객체 생성 / jumsu 값 보내기
		
		System.out.println("총점 : " + g.getTotal());
		System.out.println("평균 : " + g.getAverage());
		System.out.println("최고 점수 : " + g.getGoodScore());
		System.out.println("최저 점수 : " + g.getBadScore());
	}
}
