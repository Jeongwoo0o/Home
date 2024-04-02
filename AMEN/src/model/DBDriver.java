package model;

public class DBDriver {

	static DBDriver dbd = null;
	
	private DBDriver() throws Exception {
		// 드라이버 로딩
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버로딩");
	}
	
	public static DBDriver getInstance() throws Exception {
		if(dbd == null) dbd = new DBDriver();
		return dbd;
	}
}
