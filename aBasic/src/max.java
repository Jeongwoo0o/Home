
public class max {
	public static void main(String[] args) {

		int a[][]=new  int[][]{{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
		int[] b = new int[a.length];
		int max = 0;
		
		for(int i = 0; i < a.length; i++) {				// 4
			for(int j = 0; j < a[i].length; j++) {		// 5
				max += a[i][j];
			}
			b[i] = max;
			max = 0;
		}	//end for(i)
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 1; j < b.length; j++) {
				if(b[b.length-j] > b[b.length-j-1]) {
					b[b.length-j-1] = b[b.length-j];
				}
			}
		}
		max = b[0];
		
		System.out.println(max);

	}
}
