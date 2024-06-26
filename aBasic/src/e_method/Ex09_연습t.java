package e_method;

public class Ex09_연습t {
	public static void main(String[] args) {
		int a1 = 10, b1 = 20;
		int a2 = 4;
		int a3 = 3;
		double a4 = 3.4;
		int a5 = 4, b5 = 4;
		
		// [1]
		int result1 = substract(a1, b1);
		System.out.println("[1] " + result1);
		
		// [2]
		greeting(a2);
		
		// [3]
		loopMethod(a3);
		
		// [4]
		double result4 = circle(a4);
		System.out.println("[4] " + result4);
		
		// [5]
		int result5 = square(a5, b5);
		System.out.println("[5] " + result5);
	}

	static int substract(int a1, int b1) {
		int result1 = a1 - b1;
		return result1;
	}
	
	static void greeting(int a2) {
		String hi = "";
		switch(a2) {
			case 1:	hi = "[2] 안녕하세요";	break;
			case 2:	hi = "[2] 굿모닝";	break;
			case 3:	hi = "[2] 올라";		break;
			case 4:	hi = "[2] 곤니치와";	break;
		}
		System.out.println(hi);
	}
	
	static void loopMethod(int a3) {
		for(int i = 0; i < a3; i++) {
			System.out.println("[3] 자바는 맛있다. " + (i+1));
		}
	}
	
	static double circle(double a4) {
		double result4 = a4 * a4 * Math.PI;
		return result4;
	}
	
	static int square(int a5, int b5) {
		int result5 = a5 * b5;
		return result5;
	}
}












































