package f_exception;

public class Ex01_TryCatch {
	public static void main(String[] args) {
		
		String[] str = {"행복하자", "맛점", "맑은정신"};
		
		try {
			for(int i = 0; i <= str.length; i++) {
				System.out.print(str[i] + " ");
			}
			System.out.println("\n예외가 발생할 여지가 있는 구문");
			return;
		} catch(Exception ex) {
			System.out.println("\n예외 발생 : " + ex.getMessage());
		} finally {
			System.out.println("무조건 실행");							// return이 있어도 무조건 실행 후 return
		}
		
		System.out.println("정상적인 종료");
	}
}






































