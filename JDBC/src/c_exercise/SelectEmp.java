package c_exercise;
import java.sql.*;

public class SelectEmp {

	public static void main(String[] args) {

		// 0. 필요한 변수
		String driver 	= "com.mysql.cj.jdbc.Driver";
		String url 		= "jdbc:mysql://localhost:3306/basic";
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

			// 3. sql 문장
			String sql = " SELECT e.ENAME ename, e.JOB job, e.sal sal, d.dname  dname  "
						+" FROM	emp e INNER JOIN dept d ON e.deptno = d.deptno ";

			// 4. sql 전송 객체 얻어오기
			ps = con.prepareStatement(sql);

			// 5. 전송
			rset = ps.executeQuery();

			while(rset.next()) {
				System.out.print(rset.getString("ENAME") + "/");
				System.out.print(rset.getString("JOB") + "/");
				System.out.print(rset.getInt("SAL") + "/");
				System.out.println(rset.getString("DNAME"));
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
