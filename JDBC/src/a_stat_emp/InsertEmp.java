package a_stat_emp;
import java.sql.*;

public class InsertEmp {

	public static void main(String[] args) {
		
		// 0. 필요한 변수
		String driver 	= "com.mysql.cj.jdbc.Driver";
		String url 		= "jdbc:mysql://localhost:3306/basic";
		String user 	= "scott";
		String pass 	= "tiger";
		
		try {
			// 1. 드라이버를 메모리 로딩
			Class.forName(driver);
			System.out.println("드라이버 연결");
			
			// 2. 연결 객체 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("DB 연결 성공");
			
			// 사용자 입력값을 받는다고 가정
			int 	sabun = 7608;
			String 	sname = "그루트";
			String 	sjob  = "개발";
			
			// 3. SQL 문장 만들기
			String sql = "INSERT  "
					+ "INTO  emp(empno, ename, job)  "
					+ "VALUES("+ sabun +", '"+ sname +"', '"+ sjob +"')";
			System.out.println(sql);
			
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
			stmt.executeUpdate(sql);
			System.out.println("SQL 전송");
			
			// 6. 닫기
			stmt.close();
			con.close();
			
		}catch(Exception ex) {
			System.out.println("실패 : " + ex.getMessage());
		}	//end try-catch
	}	//end main()
}





























