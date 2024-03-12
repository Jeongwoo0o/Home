package e_method;

public class Ex02_반환 {
	public static void main(String[] args) {

		int sum = add();
		System.out.println(sum);

	}
	
	static int add() {
		
		int a = 10, b = 20;
		int sum = a + b;
		
		return sum;
		
	}
	
	// return : 제어권 반환
	// 	반환시 데이터를 딱 한개를 가지고 넘어갈 수 있음
	
}
