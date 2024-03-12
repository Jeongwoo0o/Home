package b_review;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Product p = new Product();
		
		Scanner in = new Scanner(System.in);
		System.out.print("상품번호를 입력하세요 -> ");
		p.setProductNo(in.next());
		System.out.print("상품명을 입력하세요 -> ");
		p.setProductName(in.next());
		System.out.print("초기재고량을 입력하세요 -> ");
		p.setStock(in.nextInt());
		
		System.out.print("\n판매량을 입력하세요 -> ");
		int a = in.nextInt();
		p.sale(a);
		p.output();
		
		System.out.print("\n입고량을 입력하세요 -> ");
		int b = in.nextInt();
		p.income(b);
		p.output();
		
	}

}
