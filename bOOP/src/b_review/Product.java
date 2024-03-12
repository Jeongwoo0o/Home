package b_review;

public class Product {
	
	private String productNo;
	private String productName;
	private int stock;
	
	public int income(int b) {
		stock += b;
		return stock;
	}
	
	public int sale(int a) {
		stock -= a;
		return stock;
	}
	
	public void output() {
		System.out.println("상품번호 : " + productNo + ", 상품명 : " + productName + ", 재고량 : " + stock);
	}
	
	
	
	// setter
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
