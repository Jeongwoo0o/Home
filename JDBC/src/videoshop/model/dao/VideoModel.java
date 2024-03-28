package videoshop.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import videoshop.model.VideoDao;
import videoshop.model.vo.Customer;
import videoshop.model.vo.Video;

public class VideoModel implements VideoDao{

	String driver 	= "com.mysql.cj.jdbc.Driver";
	String url 		= "jdbc:mysql://localhost:3306/basic";
	String user 	= "scott";
	String pass 	= "tiger";

	public VideoModel() throws Exception{
		// 1. 드라이버로딩
		Class.forName(driver);
	}

	public void insertVideo(Video vo, int count) throws Exception{
		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "INSERT  "
					   + "INTO  video(TITLE, DIRECTOR, ACTOR, DETAIL, GENRE)  "
					   + "VALUES(?, ?, ?, ?, ?)  ";

			// 4. 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getVideoName());
			ps.setString(2, vo.getDirector());
			ps.setString(3, vo.getActor());
			ps.setString(4, vo.getExp());
			ps.setString(5, vo.getGenre());

			// 5. 전송
			for(int i = 0; i < count; i++) {
				ps.executeUpdate();
			}
			
		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
	}	//end insertVideo()
	
	public ArrayList searchVideo(int index, String keyword) throws Exception{
		ArrayList data = new ArrayList();
		String[] column = {"TITLE", "DIRECTOR"};
		Connection con = null;
		
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			String sql = "SELECT VNUM, TITLE, GENRE, DIRECTOR, ACTOR  "
					   + "FROM video  "
					   + "WHERE " + column[index] + " LIKE '%" + keyword + "%'";
			PreparedStatement ps  = con.prepareStatement(sql);

			// 5. 전송
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ArrayList temp = new ArrayList();
				temp.add(rs.getInt("VNUM"));
				temp.add(rs.getString("TITLE"));
				temp.add(rs.getString("Genre"));
				temp.add(rs.getString("DIRECTOR"));
				temp.add(rs.getString("ACTOR"));
				data.add(temp);
			}

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
		
		return data;
	}	//end searchVideo
	
	
	public int updateVideo(Video video) throws Exception{
		int result = 0;

		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "UPDATE video  "
					   + "SET TITLE=?, DIRECTOR=?, ACTOR=?, DETAIL=?, GENRE=?  "
					   + "WHERE VNUM=?  ";

			// 4. 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, video.getVideoName());
			ps.setString(2, video.getDirector());
			ps.setString(3, video.getActor());
			ps.setString(4, video.getExp());
			ps.setString(5, video.getGenre());
			ps.setInt(6, video.getVideoNo());

			// 5. 전송
			result = ps.executeUpdate();

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch

		return result;
	}

	public Video selectVideo(int videoNum) throws Exception{
		Connection con = null;
		Video vo = new Video();
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "SELECT VNUM, TITLE, GENRE, DIRECTOR, ACTOR, DETAIL  "
					   + "FROM video  "
					   + "WHERE VNUM=?  ";

			// 4. 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, videoNum);
			
			// 5. 전송
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
						
				vo.setVideoNo(rs.getInt("VNUM"));
				vo.setVideoName(rs.getString("TITLE"));
				vo.setGenre(rs.getString("GENRE"));
				vo.setDirector(rs.getString("DIRECTOR"));
				vo.setActor(rs.getString("ACTOR"));
				vo.setExp(rs.getString("DETAIL"));
			}
			
		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
		return vo;
	}	//end selectVideo

	public Video deleteVideo(String videoNum) throws Exception{
		Video video = new Video();
		Connection con = null;
		
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "DELETE FROM video WHERE VNUM=?  ";

			// 4. 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(videoNum));

			// 5. 전송
			ps.executeUpdate();

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
		
		return video;
	}
}
