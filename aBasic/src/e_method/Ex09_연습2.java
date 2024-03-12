package e_method;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex09_연습2 {
	public static void main(String[] args) {
		
		int[] score = input();
		double avg = getCalc(score);
		output(avg);
		
	}
	
	// 역할 : 국영수 점수 입력받기
	static int[] input() {
		Scanner input = new Scanner(System.in);
		System.out.print("국어, 영어, 수학 점수 입력(90/80/70) : ");
		String str = input.nextLine();
		
		StringTokenizer st = new StringTokenizer(str, "/");			// '/'로 나눔
		int kor 	= Integer.parseInt(st.nextToken());				// String -> int
		int eng 	= Integer.parseInt(st.nextToken());
		int math 	= Integer.parseInt(st.nextToken());
		int[] score = {kor, eng, math};
		
		return score;
	}
	
	// 역할 : 입력값인 국영수 점수로 총점과 평균을 구해서 출력
	static double getCalc(int[] score) {
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}	//end for(i)
		
		double avg = sum / score.length;
		
		System.out.println("총점 : " + sum + ", 평균 : " + avg);
		return avg;
	}

	// 역할 : 평균값을 받아서 학점 구하기
	static void output(double avg) {
		char hak = '0';
		if(avg >= 90) {
			hak = 'A';
		} else if(avg < 90 && avg >= 80){
			hak = 'B';
		} else if(avg < 80 && avg >= 70){
			hak = 'C';
		} else if(avg < 70 && avg >= 60){
			hak = 'D';
		} else {
			hak = 'F';
		}
		
		System.out.println("학점 : " + hak);
	}

}





























