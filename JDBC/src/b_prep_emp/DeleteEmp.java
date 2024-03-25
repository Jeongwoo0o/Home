package b_prep_emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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

			// 사용자 입력값을 받는다고 가정
			int del_dno = 20;
			int salary 	= 2000;

			// 3. SQL 문장 만들기
			String sql =  "DELETE FROM emp  "
						+ "WHERE deptno=?" + " AND " + "sal >= ?";

			// 4. SQL 전송 객체 얻어오기
			/*		- Statement				: 완성된 sql을 전송할 때
			 * 		- PreparedStatement		: 미완성된 sql을 전송할 때
			 * 		- CallableStatement		: pl-sql(function/procedure)
			 */
			// Statement stmt = con.createStatement();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, del_dno);
			ps.setInt(2, salary);

			// 5. 전송
			/*
			 * 		- int		executeUpdate()	: INSERT, UPDATE, DELETE
			 * 		- ResultSet	executeQuery()	: SELECT
			 */
			// stmt.executeUpdate(sql) //************
			ps.executeUpdate();
			System.out.println("SQL 전송");

			// 6. 닫기
			ps.close();
			con.close();

		}catch(Exception ex) {
			System.out.println("실패 : " + ex.getMessage());
		}	//end try-catch
	}
}
