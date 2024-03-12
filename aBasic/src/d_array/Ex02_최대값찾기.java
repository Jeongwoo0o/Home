package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex02_최대값찾기 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		String num = in.nextLine();								// 문자열 변수 num에 입력 값 저장
		
		StringTokenizer st = new StringTokenizer(num, " ");		// 공백을 기준으로 num값 자르고 st에 저장
		int cnt = st.countTokens();								// st값 카운트
		int [] su = new int[cnt];								// 카운트만큼 su배열 크기 지정
		
		for(int j = 0; j < cnt; j++) {							// su 배열의 크기만큼
			su[j] = Integer.parseInt(st.nextToken());			// 자른 값들을 int로 변환시켜 su배열에 저장
		}
		
		int max = su[0];										// su의 0번째 값을 max에 저장
		
		for(int i = 0; i < su.length; i++) {					// su의 길이만큼
			if(max < su[i]) {									// max값이 su[i]보다 작으면
				max = su[i];									// su[i]값을 max에 저장
			}	//	end if										// max값이 su[i]보다 크면
		}	//	end for(i)										// su[i+1]값과 비교 반복 
		System.out.println("MAX : " + max);
		
	}
}


































