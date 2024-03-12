package d_array;

public class Ex03_정렬 {
	public static void main(String[] args) {

		int [] su = {20,2,49,8,12,5};
		
		// 정렬(버블정렬)
		for(int i = su.length-1; i > 0; i--) {		// 5 4 3 2 1
			for(int j = 0; j < i; j++) {			// 01234 0123 012 01
				if(su[j] > su[j+1]) {
					int temp 	= su[j];
					su[j] 		= su[j+1];
					su[j+1] 	= temp;
				}	//	end if
			}	//	end for(j)
		}	//	end for(i)
		
		for(int i = 0; i < su.length; i++) {
			System.out.print(su[i] + " ");
		}	//	end for(i)
		
	}
}









































