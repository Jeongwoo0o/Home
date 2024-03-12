package b_operator;

/*
 * 	shift 연산자
 * 	각각 비트의 값을 이동하는 연산자
 * 
 * 		0010
 * 	0	0100
 * 	0	1000
 * 	1	0000
 * 
 */

public class Ex04_쉬프트 {
	public static void main(String[] args) {

		int a = 4;			//0100		4
		int b = a << 2;		//1 0000	16
		int c = a >> 1;		//0010		2
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);
		
		int d = a >>> 1;
		System.out.println("D = " + d);

	}
}













































