package z_recursive;

public class FactorialTest {
	public static void main(String[] args) {

		int sum = 0;
		sum = sumFunc(5);
		System.out.println(sum);
		
	}
	
	static int sumFunc(int a) {
		if(a == 1) return 1;
		return a * sumFunc(a - 1);
	}
}










































