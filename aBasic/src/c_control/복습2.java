package c_control;

public class 복습2 {
	public static void main(String[] args) {
		
		int n = 7;

		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}	//	end for(j)
			System.out.println();
		}	//	end for(i)
		
		System.out.println("\n******************\n");
		
		for(int i = 0; i < n; i++) {
			for(int j = n-i; j > 0; j--) {
				System.out.print("*");
			}	//	end for(j)
			System.out.println();
		}	//	end for(i)
		
		System.out.println("\n******************\n");
		
		for(int i = 0; i < n; i++) {
			for(int j = n-1-i; j > 0; j--) {
				System.out.print(" ");
			}	//	end for(j)
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}	//	end for(k)
			System.out.println();
		}	//	end for(i)
		
		System.out.println("\n******************\n");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}	//	end for(j)
			for(int k = n-i; k > 0; k--) {
				System.out.print("*");
			}	//	end for(k)
			System.out.println();
		}	//	end for(i)
		
		System.out.println("\n******************\n");
		
		for(int i = 0; i < n; i++) {
			for(int j = n-i-1; j > 0; j--) {
				System.out.print(" ");
			}	//end for(j)
			for(int k = 0; k < 2*i-1; k++) {
				System.out.print("*");
			}	//	end for(k)
			System.out.println();
		}	//	end for(i)
		
		System.out.println("\n******************\n");
		
		for(int i = n; i > 0; i--) {
			for(int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}	//end for(j)
			for(int k = 2*i-3; k > 0 ; k--) {
				System.out.print("*");
			}	//	end for(k)
			System.out.println();
		}	//	end for(i)
		
	}
}
















































