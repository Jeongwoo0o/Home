package f_exception;
import java.io.FileInputStream;

public class Ex03_throws {
	public static void main(String[] args) {

		try {
			readFile();
			
		} catch(Exception ex) {
			System.out.println("예외 발생 : " + ex.getMessage());
		}	//end try-catch
		
	}
	
	static void readFile() throws Exception {
		FileInputStream fis = null;
		try {
			new FileInputStream("abc.txt3");
		} finally {
			fis.close();
		}
	}
}




























