package c_control;
import java.util.*;

public class 연습5 {
	public static void main(String[] args) {
		
		Scanner in 	= new Scanner(System.in);
		System.out.print("높이와 종류 입력(띄어쓰기로 구분) : ");
		int n		= in.nextInt();
		int m		= in.nextInt();
		
		switch(m) {
			case 1: 
				for(int i = 0; i < n; i++) {
					for(int j = 0; j <= i; j++) {
						System.out.print("*");
					}	//	end for(j)
					System.out.println();
				}	//	end for(i)
				break;
			case 2: 
				for(int i = 0; i < n; i++) {
					for(int j = n-i; j > 0; j--) {
						System.out.print("*");
					}	//	end for(j)
					System.out.println();
				}	//	end for(i)
				break;
			case 3: 
				for(int i = 1; i <= n; i++) {
					for(int j = n-i; j > 0; j--) {
						System.out.print(" ");
					}	//	end for(j)
					for(int k = 1; k <= 2*i-1; k++) {
						System.out.print("*");
					}	//	end for(k)
					System.out.println();
				}	//	end for(i))
				break;
			default:
				System.out.println("INPUT ERROR!");
		}	//end switch(m)
		
	}
}










































