package a_Basic;

/*
	멤버변수(member field)		: 서로 다른 데이터 타입의 변수들
	멤버함수(member method) 	: 멤버변수를 처리하는 역할
*/

public class Student {

	String name;
	int kor, eng, math;
	int total;
	double avg;
	
	int calTotal() {
		total = kor + eng + math;
		return total;
	}
	
	double calAvg() {
		avg = (double)total / 3;
		return avg;
	}
}


