package c_array;

/*
	캡슐화 
	
		기본적으로	멤버 변수는 private 지정
				멤버 메소드는 public 지정
				
	
	private 지정된 멤버는 접근하려면 setter/getter 필요
	
	this : 객체의 레퍼런스
		   멤버를 접근할 때 사용
*/

public class Student {

	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
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


