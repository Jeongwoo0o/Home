package e_method;

import java.util.Scanner;

public class Ex02_반환2 {
	public static void main(String[] args) {

		int[] data = add();
		int sum = 0;
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
			sum += data[i];
		}
		System.out.println(sum);
		
	}

	static int[] add() {
		
		int a = 10, b = 20;
		int[] data = {a, b};
		
		return data;	// 리턴값은 1개만 보낼 수 있어서 배열로 묶어서 리턴
		
		
	}
	
}
