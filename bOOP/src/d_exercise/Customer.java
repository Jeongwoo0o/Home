package d_exercise;

public class Customer {
	
	private String tel;
	private String name;
	private int	   mileage;

	// default constructor
	public Customer() {
		// this.tel = "0000";
		// this.name = "홍길순"
		// this.mileage = 10000;
		this("0000", "이름없음", 10);
	}
	
	// constructor
	public Customer(String tel, String name, int mileage){
		this.tel = tel;
		this.name = name;
		this.mileage = mileage;
	}
	
	public void output() {
		System.out.println(name + "님(" + tel + ")은 " + mileage + "점 있습니다.");
	}

	
	// setter, getter
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
}
