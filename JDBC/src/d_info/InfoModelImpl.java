package d_info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class InfoModelImpl implements InfoModel{

	// 0. 필요한 변수
	String driver 	= "com.mysql.cj.jdbc.Driver";
	String url 		= "jdbc:mysql://localhost:3306/basic";
	String user 	= "scott";
	String pass 	= "tiger";

	public InfoModelImpl() throws Exception{
		// 1. 드라이버를 메모리 로딩
		Class.forName(driver);
	}

	// 회원가입하는 입력값을 받아서 데이터베이스에 저장
	public void insertData(InfoVO vo) throws Exception {
		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "INSERT  "
					+ "INTO  info_tab(name, tel, jumin, gender, age, home)  "
					+ "VALUES(?, ?, ?, ?, ?, ?)";

			// 4. 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getTel());
			ps.setString(3, vo.getId());
			ps.setString(4, vo.getGender());
			ps.setInt(5, vo.getAge());
			ps.setString(6, vo.getHome());

			// 5. 전송
			ps.executeUpdate();

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
	}

	// 전화번호를 누르고 엔터를 눌렀을 때
	public InfoVO searchByTel(String tel) throws Exception {
		InfoVO vo = new InfoVO();

		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "SELECT * FROM info_tab WHERE tel=?  ";

			// 4. 전송객체
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tel);

			// 5. 전송
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setName(rs.getString("NAME"));
				vo.setTel(rs.getString("TEL"));
				vo.setId(rs.getString("JUMIN"));
				vo.setGender(rs.getString("GENDER"));
				vo.setAge(rs.getInt("AGE"));
				vo.setHome(rs.getString("HOME"));
			}

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
		return vo;
	}

	// 'Search'버튼을 눌렀을 때
	public ArrayList<InfoVO> searchAll() throws Exception {
		ArrayList<InfoVO> list = new ArrayList<InfoVO>();

		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "SELECT * FROM info_tab  ";

			// 4. 전송객체
			PreparedStatement ps = con.prepareStatement(sql);

			// 5. 전송
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				InfoVO vo = new InfoVO();
				vo.setName(rs.getString("NAME"));
				vo.setTel(rs.getString("TEL"));
				vo.setId(rs.getString("JUMIN"));
				vo.setGender(rs.getString("GENDER"));
				vo.setAge(rs.getInt("AGE"));
				vo.setHome(rs.getString("HOME"));

				list.add(vo);
			}

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch

		return list;
	}

	// 'Delete'버튼을 눌렀을 때
	public void deleteData(String tel) throws Exception {
		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "DELETE FROM info_tab WHERE tel=?  ";

			// 4. 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tel);

			// 5. 전송
			ps.executeUpdate();

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
	}

	// 회원정보를 불러와서 수정
	public void modifyData(InfoVO vo) throws Exception {
		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "UPDATE info_tab  "
					   + "SET name=?, jumin=?, gender=?, age=?, home=?  "
					   + "WHERE tel=?  ";

			// 4. 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getId());
			ps.setString(3, vo.getGender());
			ps.setInt(4, vo.getAge());
			ps.setString(5, vo.getHome());
			ps.setString(6, vo.getTel());

			// 5. 전송
			ps.executeUpdate();

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
	}

}
























