package a_datatype;

public class Ex02_형변환 {
	public static void main(String[] args) {

		// 기본 형
		// (1) 변수의 자료형과 값이 일치
		// (2) 크기가 큰 자료형에 작은 값 넣을 때 (자동 형 변환)
		// (3) 크기가 작은 자료형에 큰 값을 넣을 때
		//			-> 에러 발생
		//			-> 형 변환 필요 (casting)
		
		int su;
		su = '문';	// == su = (int)'문';
		System.out.println(su);
		
		double d;
		d = 1000;
		System.out.println(d);
		
//		int su2;
//		su2 = 1.2;	// error
		
		float f;
		f = 1.2F;	// 4B 변수에 8B 값을 넣고자 하는 상황
		System.out.println(f);
		
		long big;
		big = 10000000000L;
		System.out.println(big);
		
		int z;
		z = (int)1.6;
		System.out.println(z);

	}
}

// 코드 줄 맞춤
// ctrl + a -> ctrl + i









































