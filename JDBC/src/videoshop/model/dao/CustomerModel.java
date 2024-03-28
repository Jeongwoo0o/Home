package videoshop.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
			ps.setString(2, vo.getCustName());
			ps.setString(3, vo.getCustTel2());
			ps.setString(4, vo.getCustAddr());
			ps.setString(5, vo.getCustEmail());
			
			// 5. 전송
			ps.executeUpdate();

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch

	}
	
	public Customer selectByTel(String tel) throws Exception{
		Customer vo = new Customer();
		
		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "SELECT * FROM customer WHERE tel=?  ";

			// 4. 전송객체
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tel);

			// 5. 전송
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setCustTel1(rs.getString("TEL"));
				vo.setCustName(rs.getString("NAME"));
				vo.setCustTel2(rs.getString("sTEL"));
				vo.setCustAddr(rs.getString("ADDR"));
				vo.setCustEmail(rs.getString("EMAIL"));
			}

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
		
		return vo;
		
	}
	
	public int updateCustomer(Customer vo) throws Exception{
		int result = 0;
		
		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "UPDATE customer  "
					   + "SET tel=?, name=?, stel=?, addr=?, email=?  "
					   + "WHERE tel=?  ";

			// 4. 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getCustTel1());
			ps.setString(2, vo.getCustName());
			ps.setString(3, vo.getCustTel2());
			ps.setString(4, vo.getCustAddr());
			ps.setString(5, vo.getCustEmail());
			ps.setString(6, vo.getCustTel1());

			// 5. 전송
			result = ps.executeUpdate();

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
		
		return result;
	}

	public ArrayList<Customer> selectByName(String name) throws Exception{
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "SELECT * FROM customer WHERE name=?  ";

			// 4. 전송객체
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			// 5. 전송
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Customer vo = new Customer();		
				vo.setCustTel1(rs.getString("TEL"));
				vo.setCustName(rs.getString("NAME"));
				vo.setCustTel2(rs.getString("sTEL"));
				vo.setCustAddr(rs.getString("ADDR"));
				vo.setCustEmail(rs.getString("EMAIL"));
				list.add(vo);
			}
			
		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
		
		return list;
		
	}
	
}
