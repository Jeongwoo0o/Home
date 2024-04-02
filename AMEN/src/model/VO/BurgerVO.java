package model.VO;

public class BurgerVO {
	String 	pName;						//상품명
	int		amount;						//수량
	int 	price;						//가격
	int  	tAmount;					//총수량
	int		tPrice;						//총가격


	public String toString() {
		return "BurgerVO [pName=" + pName + ", amount=" + amount + ", price=" + price + ", tAmount=" + tAmount
				+ ", tPrice=" + tPrice + "]";
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pNname) {
		this.pName = pNname;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int gettAmount() {
		return tAmount;
	}

	public void settAmount(int tAmount) {
		this.tAmount = tAmount;
	}
	
	public int gettPrice() {
		return tPrice;
	}

	public void settPrice(int tPrice) {
		this.tPrice = tPrice;
	}
}
