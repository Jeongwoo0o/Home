package view.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import view.VO.BurgerVO;

public class BurgerModel implements BurgerVO{
	String driver 	= "com.mysql.cj.jdbc.Driver";
	String url 		= "jdbc:mysql://localhost:3306/basic";
	String user 	= "scott";
	String pass 	= "tiger";
	
	public BurgerModel() throws Exception{
		// 1. 드라이버로딩
		Class.forName(driver);
	}
	
	public void insertOrder() throws Exception {
//		Connection con = null;
//		try {
//			// 2. 연결 객체 얻어오기
//			con = DriverManager.getConnection(url, user, pass);
//
//			// 3. SQL 문장
//			String sql = "INSERT  "
//					   + "INTO  video(TITLE, DIRECTOR, ACTOR, DETAIL, GENRE)  "
//					   + "VALUES(?, ?, ?, ?, ?)  ";
//
//			// 4. 전송객체 얻어오기
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setString(1, vo.getVideoName());
//			ps.setString(2, vo.getDirector());
//			ps.setString(3, vo.getActor());
//			ps.setString(4, vo.getExp());
//			ps.setString(5, vo.getGenre());
//
//			// 5. 전송
//			for(int i = 0; i < count; i++) {
//				ps.executeUpdate();
//			}
//			
//		} finally {
//			// 6. 닫기
//			con.close();
//		}	//end try-catch
	}	//end insertOrder()
}
