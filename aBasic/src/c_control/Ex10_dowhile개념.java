package c_control;

public class Ex10_dowhile개념 {
	public static void main(String[] args) {

		int i = 0;
		int sum = 0;
		
		for(i = 1; i <= 10; i++) {
			sum += i;
		}	//	end for(i)
		
		System.out.println("for		: " + sum);
		i = 0;
		sum = 0;
		
		while(i <= 10) {
			sum += i;
			i++;
		}	//	end while(i)
		
		System.out.println("while		: " + sum);
		i = 0;
		sum = 0;
		
		do {
			sum += i;
			i++;
		} while(i <= 10);	//end do-while(i)
		
		System.out.println("do-while 	: " + sum);

	}
}












































