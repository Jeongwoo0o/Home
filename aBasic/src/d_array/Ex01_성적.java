package d_array;

import java.util.Scanner;

public class Ex01_성적 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int num = in.nextInt();
		
		int [] score = new int[num];
		int total = 0;
		
		for(int i = 0; i < num; i++) {
			System.out.print(i + "번 학생의 국어 점수 입력 : ");
			score[i] = in.nextInt();
			total += score[i];
		}	//	end for(i)
		
		System.out.println("총점 : " + total + "\n평균 : " + total/num);
		
	}
}












































