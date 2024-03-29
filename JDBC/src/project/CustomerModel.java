package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import videoshop.model.CustomerDao;
import videoshop.model.vo.Customer;

public class CustomerModel implements CustomerDao{

	String driver 	= "com.mysql.cj.jdbc.Driver";
	String url 		= "jdbc:mysql://localhost:3306/basic";
	String user 	= "scott";
	String pass 	= "tiger";
	
	public CustomerModel() throws Exception{
	 	// 1. 드라이버로딩
		Class.forName(driver);
	}
	
	public void insertCustomer(Customer vo) throws Exception{
		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "INSERT  "
					   + "INTO  customer(TEL, NAME, sTEL, ADDR, EMAIL)  "
					   + "VALUES(?, ?, ?, ?, ?)  ";

			// 4. 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getCustTel1());
			
			// 5. 전송
			ps.executeUpdate();

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch

	}
}
