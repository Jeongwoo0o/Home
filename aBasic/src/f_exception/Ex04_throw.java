package f_exception;

public class Ex04_throw {
	public static void main(String[] args) {

		try {
			readArray();
		} catch(Exception ex) {
			System.out.println("예외 처리 : " + ex.getMessage());
		}	//end try-catch
	}
	
	static void readArray() throws Exception{
		try {
			String[] msg = {"행복합시다", "공부합시다", "짝꿍친하게"};
			for(int i = 0; i <= msg.length; i++) {
				System.out.println(msg[i]);
			}	//end for(i)
		} catch(Exception ex) {
			throw new MyException();	// 일부로 예외 발생
		}	//end try-catch
	}
}








































