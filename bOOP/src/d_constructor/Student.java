package d_constructor;

/*
 * 	생성자 함수(constructure)
 * 		- 클래스의 멤버값을 초기화 할 때 사용
 * 	
 * 		- 클래스가 객체화(인스턴스화)될 때 실행되는 함수 : new 사용 시
 * 
 * 		- 클래스명과 동일한 이름이여야 함
 * 			+ 리턴형이 없음(void도 있으면 안됨)
 * 
 * 		- 오버로딩 가능(overloading)
 * 			-> 매개변수의 타입과 갯수가 다른 동일한 이름의 함수들
 * 
 * 	[참고]
 * 		class A {
 * 			int A = 10;
 * 			void A() {일반함수}
 * 			A() {생성자함수}
 * 		}
 * 
 * 	[참고] 기본 생성자 함수 : default constructor
 * 			
 * 		` 생성자 함수가 한 개도 없는 경우 자동으로 추가됨
 * 			Student() {}
 * 
 * 		` 습관처럼 기본적으로 추가하기
 */

public class Student {

	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	Student() {
		this.name = "이름없음";
		this.kor = 50;
		this.eng = 50;
		this.math = 50;
	}
	
	// constructor
	Student(String name, int kor, int eng, int math) {
		this.name = name;	// this. -> 멤버변수 지칭
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int calTotal() {
		total = kor + eng + math;
		return total;
	}
	
	public double calAvg() {
		avg = (double)total / 3;
		return avg;
	}

	// getter : 값을 밖으로 뺌
	public String getName() {
		return name;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}
}


