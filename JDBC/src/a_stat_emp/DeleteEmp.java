package a_stat_emp;
import java.sql.*;

public class DeleteEmp {

	public static void main(String[] args) {
		
		// 0. 필요한 변수
		String driver 	= "com.mysql.cj.jdbc.Driver";
		String url 		= "jdbc:mysql://localhost:3306/basic";
		String user 	= "scott";
		String pass 	= "tiger";
		
		try {
			// 1. 드라이버를 메모리 로딩
			Class.forName(driver);
			
			// 2. 연결 객체 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);
			
			// 3. SQL 문장 만들기
			String sql =  "DELETE FROM emp  "
						+ "WHERE JOB IS NULL";
			// 4. SQL 전송 객체 얻어오기
			/*		- Statement				: 완성된 sql을 전송할 때
			 * 		- PreparedStatement		: 미완성된 sql을 전송할 때
			 * 		- CallableStatement		: pl-sql(function/procedure)
			 */
			Statement stmt = con.createStatement();
			
			// 5. 전송
			/*
			 * 		- int		executeUpdate()	: INSERT, UPDATE, DELETE
			 * 		- ResultSet	executeQuery()	: SELECT
			 */
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "행을 수행");
			
			// 6. 닫기
			stmt.close();
			con.close();
			
		}catch(Exception ex) {
			System.out.println("실패 : " + ex.getMessage());
		}	//end try-catch
	}	//end main()
}





























