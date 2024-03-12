package b_operator;

public class Ex01_증가감소 {
	public static void main(String[] args) {

		int a = 5, b = 7;
		
		//	[0]
		System.out.println("A = " + a + ", B = " + b);	//A = 5, B = 7
		System.out.println("A = " + a + 1 + ", B = " + b + 1);	//A = 51, B = 71
		System.out.println("A = " + (a + 1) + ", B = " + (b + 1));	//A = 6, B = 8

		a = a + 1;
		b = b - 1;
		System.out.println("A = " + a + ", B = " + b);	//A = 6, B = 6
		
		
		//************************************************************************
		//	증가 연산자 ++
		//	감소 연산자 --
		
		
		//	[1]
		++a;
		--b;
		System.out.println("A = " + a + ", B = " + b);	//A = 7, B = 5
		
		a++;
		b--;
		System.out.println("A = " + a + ", B = " + b);	//A = 8, B = 4
		
		
		//	[2] 앞에 경우와 뒤에 경우가 다르다.
		int c = 10;
		int result = ++c;
		//	c = c + 1;
		//	int result = c;
		System.out.println("결과 = " + result);	//11
		System.out.println("C = " + c);	//11
		
		int d = 10;
		int result2 = d++;
		//	int result2 = d;
		//	d = d + 1;
		System.out.println("결과 = " + result2);	//10
		System.out.println("D = " + d);	//11
		
		
		//	[3]
		int x = 5, y = 9;
		System.out.println("X = " + ++x + ", Y = " + --y);	//X = 6, Y = 8
		System.out.println("X = " + x++ + ", Y = " + y--);	//X = 6, Y = 8
		System.out.println("X = " + x + ", Y = " + y);		//X = 7, Y = 7
		
	}
}































