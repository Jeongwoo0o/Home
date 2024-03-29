package videoshop.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import videoshop.model.RentDao;


public class RentModel implements RentDao {
	
	String driver 	= "com.mysql.cj.jdbc.Driver";
	String url 		= "jdbc:mysql://localhost:3306/basic";
	String user 	= "scott";
	String pass 	= "tiger";
	
	Connection con;
	
	public RentModel() throws Exception{
		// 1. 드라이버로딩
		Class.forName(driver);
	}
	
	public void rentVideo(String tel, int vnum) throws Exception {
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "INSERT  "
					   + "INTO  rent(VNUM, TEL, RENTDAY, BANAP)  "
					   + "VALUES(?, ?, sysdate(), 'N')  ";

			// 4. 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, vnum);
			ps.setString(2, tel);

			// 5. 전송
			ps.executeUpdate();
			
		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
	}	//end rentVideo()
	
	public String selectByTel(String tel) throws Exception {
		String name = "";
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "SELECT NAME  "
					   + "FROM customer  "
					   + "WHERE TEL = ?  ";
			
//			String sql = "SELECT c.NAME, r.BANAP  "
//					   + "FROM customer c INNER JOIN rent r  "
//					   + "WHERE c.TEL = ? AND r.VNUM = ?  ";

			// 4. 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tel);

			// 5. 전송
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				name = (rs.getString("NAME"));
			}
//			while(rs.next()) {
//				rs.getString("c.NAME");
//				rs.getString("r.BANAP");
//				list.add(rs);
//			}
			
		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
		return name;
	}	//end selectByTel()
	
	public void returnVideo(int vnum) throws Exception {
		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "UPDATE rent  "
					   + "SET BANAPDAY=sysdate(), BANAP='Y'  "
					   + "WHERE VNUM=? AND BANAPDAY IS NULL  ";

			// 4. 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, vnum);

			// 5. 전송
			ps.executeUpdate();

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
	}	//end returnVideo()
	
	public ArrayList selectNoReturn() throws Exception {
		ArrayList data = new ArrayList();
		String[] column = {"TITLE", "DIRECTOR"};
		Connection con = null;
		
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			String sql = "SELECT r.VNUM,v.TITLE,c.NAME,r.TEL,date_add(r.rentday, INTERVAL 3 DAY) AS DDAY,r.BANAP  "
					   + "FROM	 rent r INNER JOIN customer c  "
					   + "ON	 r.TEL = c.TEL  "
					   + "		 INNER JOIN video v  "
					   + "		 ON	  r.VNUM = v.VNUM  "
					   + "WHERE  r.BANAP = 'N' OR r.BANAPDAY IS NULL  ";
			PreparedStatement ps  = con.prepareStatement(sql);

			// 5. 전송
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ArrayList temp = new ArrayList();
				temp.add(rs.getInt("VNUM"));
				temp.add(rs.getString("TITLE"));
				temp.add(rs.getString("NAME"));
				temp.add(rs.getString("TEL"));
				temp.add(rs.getString("DDAY"));
				temp.add(rs.getString("BANAP"));
				data.add(temp);
			}

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
		
		return data;
	}	//end selectNoReturn()
	
}
