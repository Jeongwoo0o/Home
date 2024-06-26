package d_constructor2;

public class GradeExpr {
	
	int[] jumsu;
	
	GradeExpr(int[] jumsu) {
		this.jumsu = jumsu;			// main에서 받은 jumsu를 멤버변수에 집어넣기
	}
	
	double getAverage() {
		double avg = (double)getTotal() / jumsu.length;
		avg = Math.round(avg * 100) /100.0;
		return avg;
	}
	
	int getTotal() {
		int total = 0;
		for(int i = 0; i < jumsu.length; i++) {
			total += jumsu[i];
		}
		return total;
	}
	
	int getGoodScore() {
		int max = jumsu[0];
		for(int i = 0; i < jumsu.length; i++) {
			if(max < jumsu[i]) {
				max = jumsu[i];
			}
		}
		return max;
	}
	
	int getBadScore() {
		int min = jumsu[0];
		for(int i = 0; i < jumsu.length; i++) {
			if(min > jumsu[i]) {
				min = jumsu[i];
			}
		}
		return min;
	}
}
