package c_control;

public class 중요_369 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 50; i++) {
			int su = i;
			boolean su369 = false;
			
			while(su != 0) {
				int na = su % 10;
				if(na == 3 || na == 6 || na == 9) {
					System.out.print("짝");
					su369 = true;
				}	//	end if(na)
				su /= 10;
			}	//	end while(su)
			if(!su369) System.out.println(i);
			else System.out.println();
		}	//	end for(i)

	}
}







































