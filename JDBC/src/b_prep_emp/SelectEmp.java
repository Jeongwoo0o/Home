package b_prep_emp;
import java.sql.*;

public class SelectEmp {

	public static void main(String[] args) {
		
		// 0. 필요한 변수
				String driver 	= "com.mysql.cj.jdbc.Driver";
				String url 		= "jdbc:mysql://localhost:3306/basic";
				String user 	= "scott";
				String pass 	= "tiger";
				
		try {
			// 1. 드라이버 연결
			Class.forName(driver);
			
			// 2. 연결 객체 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);
			
			// 3. sql 문장
			String sql = "SELECT ename, job, sal FROM emp";
			
			// 4. sql 전송 객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			
			// 5. 전송
			ResultSet rset = ps.executeQuery();
			
			while(rset.next()) {
				System.out.print(rset.getString("ENAME") + "/");
				System.out.print(rset.getString("JOB") + "/");
				System.out.println(rset.getInt("SAL"));
			}
			
			// 6. 닫기
			rset.close();
			ps.close();
			con.close();
			
		}catch(Exception ex) {
			System.out.println("실패 : " + ex.getMessage());
		}
	}
}
