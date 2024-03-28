package z_escaperoom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpModelImpl implements EmpModel{
	
	// 0. 필요한 변수
		String driver 	= "com.mysql.cj.jdbc.Driver";
		String url 		= "jdbc:mysql://localhost:3306/basic";
		String user 	= "scott";
		String pass 	= "tiger";
	
	/*---------------------------------------------
	 * 생성자 함수 
	 	1. DB 연동
	 		- 드라이버 등록
	*/
	public EmpModelImpl() throws Exception{
		Class.forName(driver);
	}

	/*-------------------------------------------------------
	* insert() :  입력한 값 받아서 데이타베이스에 추가
		0. 연결객체 얻어오기
		1. sql문 만들기 ( insert 구문 )
		2. PreparedStatement 객체 생성 
		3. PreparedStatement에 인자 지정
		4. sql문 전송 ( executeUpdate() 이용 )
		5. PreparedStatement 닫기
		6. 연결 닫기
	*/
	public void insert( EmpVO r ) throws SQLException{	
		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "INSERT  "
					+ "INTO  emp(empno, ename, sal, job)  "
					+ "VALUES(?, ?, ?, ?)  ";

			// 4. 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, r.getEmpno());
			ps.setString(2, r.getEname());
			ps.setInt(3, r.getSal());
			ps.setString(4, r.getJob());

			// 5. 전송
			ps.executeUpdate();

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
	}


	/*-------------------------------------------------------
	* modify() : 화면 입력값 받아서 수정
		0. 연결객체 얻어오기
		1. sql문 만들기 ( update 구문 )
		2. PreparedStatement 객체 생성 ( 또는 Statement )
		3. PreparedStatement에 인자 지정
		4. sql문 전송 ( executeUpdate() 이용 )
		5. PreparedStatement 닫기
		6. 연결 닫기
	*/
	public void modify( EmpVO r ) throws SQLException{	
		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "UPDATE emp  "
					   + "SET ename=?, sal=?, job=?  "
					   + "WHERE empno=?  ";

			// 4. 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, r.getEname());
			ps.setInt(2, r.getSal());
			ps.setString(3, r.getJob());
			ps.setInt(4, r.getEmpno());

			// 5. 전송
			ps.executeUpdate();

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
	}

	
	/*-------------------------------------------------------
	* selectByEmpno() :  입력받은 사번을 받아서 해당 레코드 검색
		0. 연결객체 얻어오기
		1. sql문 만들기 ( select 구문 )
		2. PreparedStatement 객체 얻기 ( Statement  가능 )
		4. sql문 전송 ( executeQuery() 이용 )
		5. 결과집합(ResultSet)에서 값을 읽어서 EmpVO에 저장
		6. ResultSet/ PreparedStatement 닫기
		7. 연결 닫기
		8. EmpVO 객체 리턴
	*/	
	public EmpVO selectByEmpno( int empno ) throws SQLException{
		EmpVO vo = new EmpVO();

		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "SELECT * FROM emp WHERE empno=?  ";

			// 4. 전송객체
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, empno);

			// 5. 전송
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setEmpno(rs.getInt("EMPNO"));
				vo.setEname(rs.getString("ENAME"));
				vo.setSal(rs.getInt("SAL"));
				vo.setJob(rs.getString("JOB"));
			}

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
		
		return vo;	
	}
	
	/*--------------------------------------------------------
	* delete() : 사원번호 값을 받아 해당 레코드 삭제
		0. 연결객체 얻어오기
		1. sql문 만들기 ( delete 구문 )
		2. PreparedStatement 객체 얻기
		3. sql문 전송 ( executeUpdate() 이용 )
		4. PreparedStatement 닫기
		5. 연결 닫기
	*/
	public int delete( int empno ) throws SQLException{
		int resultCnt = 0;		

		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "DELETE FROM emp WHERE empno=?  ";

			// 4. 전송객체 얻어오기
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, empno);

			// 5. 전송
			resultCnt = ps.executeUpdate();

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
		
		return resultCnt;
	}
	
	/*-------------------------------------------------------
	* selectAll() :  전체 레코드 검색
		0. 연결객체 얻어오기
		1. sql문 만들기 ( select 구문 )
		2. PreparedStatement 객체 얻기 ( Statement  가능 )
		4. sql문 전송 ( executeQuery() 이용 )
		5. 결과집합(ResultSet)에서 값을 읽어서 ArrayList에 저장
		6. ResultSet/ PreparedStatement 닫기
		7. 연결 닫기
		8. ArrayList 객체 리턴
	*/	
	public ArrayList selectAll() throws SQLException{
		ArrayList list = new ArrayList();
		
		Connection con = null;
		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. SQL 문장
			String sql = "SELECT * FROM emp  ";

			// 4. 전송객체
			PreparedStatement ps = con.prepareStatement(sql);

			// 5. 전송
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt("EMPNO"));
				vo.setEname(rs.getString("ENAME"));
				vo.setSal(rs.getInt("SAL"));
				vo.setJob(rs.getString("JOB"));

				list.add(vo);
			}

		} finally {
			// 6. 닫기
			con.close();
		}	//end try-catch
		
		return list;
	}

}