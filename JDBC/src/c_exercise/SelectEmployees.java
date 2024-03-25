package c_exercise;
import java.sql.*;

public class SelectEmployees {

	public static void main(String[] args) {

		// 0. 필요한 변수
		String driver 	= "com.mysql.cj.jdbc.Driver";
		String url 		= "jdbc:mysql://localhost:3306/advanced";
		String user 	= "scott";
		String pass 	= "tiger";

		Connection 				con 	= null;
		PreparedStatement 		ps 		= null;
		ResultSet 				rset 	= null;

		try {
			// 1. 드라이버 연결
			Class.forName(driver);

			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);
			
			String searchName = "Jonathon";

			// 3. sql 문장
			String sql = "SELECT	CONCAT(FIRST_NAME,'',LAST_NAME) AS ENAME, HIRE_DATE "
					+ " FROM	employees "
					+ " WHERE	DEPARTMENT_ID IN (SELECT DEPARTMENT_ID FROM employees WHERE FIRST_NAME=?) "
					+ " AND FIRST_NAME<>? ";

			// 4. sql 전송 객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setString(1, searchName);
			ps.setString(2, searchName);
			
			// 5. 전송
			rset = ps.executeQuery();

			while(rset.next()) {
				System.out.print(rset.getString("ENAME") + " ");
				System.out.println(rset.getString("HIRE_DATE"));
			}

		}catch(Exception ex) {
			System.out.println("실패 : " + ex.getMessage());
		}finally {
			try {
				// 6. 닫기
				rset.close();
				ps.close();
				con.close();
			}catch(Exception ex) { }
		}
	}
}
