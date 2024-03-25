package b_prep_emp;
import java.sql.*;

public class SelectCount {

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
			String sql = "SELECT count(*) cnt FROM emp";
			
			// 4. sql 전송 객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			
			// 5. 전송
			ResultSet rset = ps.executeQuery();
			
			rset.next();
			System.out.println(rset.getInt("CNT"));
			
			
			// 6. 닫기
			rset.close();
			ps.close();
			con.close();
			
		}catch(Exception ex) {
			System.out.println("실패 : " + ex.getMessage());
		}
	}
}
