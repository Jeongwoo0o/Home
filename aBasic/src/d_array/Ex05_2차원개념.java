package d_array;

public class Ex05_2차원개념 {
	public static void main(String[] args) {

		int[][] data = new int[3][2];					// [행][열]([i][j])
		
		data[0][0] = 9;
		data[1][1] = 2;
		data[2][0] = 3;
		data[2][1] = 5;
		
		// 값 지정(저장)
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				// 각각의 배열값에 임의의 수를 저장
				data[i][j] = (int)(Math.random()*45)+1;
			}	//end for(j)
		}	//end for(i)
		
		// 출력
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}	//end for(j)
			System.out.println();
		}	//end for(i)

	}
}












































