package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.DAO.bdao;
import model.VO.order;
import model.VO.BurgerVO;

public class ordermodel implements bdao {
	DBDriver dbd;
	public ordermodel() throws Exception {
		dbd = DBDriver.getInstance();
	}

	public ArrayList selectEvent() throws Exception {
		ArrayList list = new ArrayList();

		Connection con = null;

		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/basic", "scott", "tiger");

			String sql = "SELECT ENAME, EPRICE FROM event  ";
			PreparedStatement ps = con.prepareStatement(sql);

			// 5. 전송
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ArrayList temp = new ArrayList();
				temp.add(rs.getString("ENAME"));
				temp.add(rs.getInt("EPRICE"));
				list.add(temp);
			}

		} finally {
			// 6. 닫기
			con.close();
		} // end try-catch

		return list;
	}
	
	public ArrayList selectBurger() throws Exception {
		ArrayList list = new ArrayList();

		Connection con = null;

		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/basic", "scott", "tiger");

			String sql = "SELECT BNAME, BPRICE FROM burger  ";
			PreparedStatement ps = con.prepareStatement(sql);

			// 5. 전송
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ArrayList temp = new ArrayList();
				temp.add(rs.getString("BNAME"));
				temp.add(rs.getInt("BPRICE"));
				list.add(temp);
			}

		} finally {
			// 6. 닫기
			con.close();
		} // end try-catch

		return list;
	}

	public ArrayList selectSide() throws Exception{
		ArrayList list = new ArrayList();

		Connection con = null;

		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/basic", "scott", "tiger");

			String sql = "SELECT SNAME, SPRICE FROM side  ";
			PreparedStatement ps = con.prepareStatement(sql);

			// 5. 전송
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ArrayList temp = new ArrayList();
				temp.add(rs.getString("SNAME"));
				temp.add(rs.getInt("SPRICE"));
				list.add(temp);
			}

		} finally {
			// 6. 닫기
			con.close();
		} // end try-catch

		return list;
	}

	public ArrayList selectDrink() throws Exception{
		ArrayList list = new ArrayList();

		Connection con = null;

		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/basic", "scott", "tiger");

			String sql = "SELECT DNAME, DPRICE FROM drink  ";
			PreparedStatement ps = con.prepareStatement(sql);

			// 5. 전송
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ArrayList temp = new ArrayList();
				temp.add(rs.getString("DNAME"));
				temp.add(rs.getInt("DPRICE"));
				list.add(temp);
			}

		} finally {
			// 6. 닫기
			con.close();
		} // end try-catch

		return list;
	}

	public ArrayList selectSet() throws Exception{
		ArrayList list = new ArrayList();

		Connection con = null;

		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/basic", "scott", "tiger");

			String sql = "SELECT SETNAME, SETPRICE FROM sett  ";
			PreparedStatement ps = con.prepareStatement(sql);

			// 5. 전송
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ArrayList temp = new ArrayList();
				temp.add(rs.getString("SETNAME"));
				temp.add(rs.getInt("SETPRICE"));
				list.add(temp);
			}

		} finally {
			// 6. 닫기
			con.close();
		} // end try-catch

		return list;
	}

	public ArrayList checkCoupon(String cNum) throws Exception{
		ArrayList list = new ArrayList();

		Connection con = null;

		try {
			// 2. 연결 객체 얻어오기
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/basic", "scott", "tiger");

			String sql = "SELECT CNUM, CUSE, PERIOD  "
					+ "FROM coupon  "
					+ "WHERE CNUM=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cNum);

			// 5. 전송
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				list.add(rs.getString("CNUM"));
				list.add(rs.getString("CUSE"));
				list.add(rs.getString("PERIOD"));
			}

		} finally {
			// 6. 닫기
			con.close();
		} // end try-catch

		return list;
	}

	public void insertorder(BurgerVO vo) throws Exception {

		// 2. Connection 연결객체 얻어오기
		Connection con = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/basic", "scott", "tiger");

			String sql = " INSERT INTO orderlist (PNAME, PRICE, AMOUNT)  "
					   + "VALUES ( ? , ? , ? )  ";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, vo.getpName());
			ps.setInt(2, vo.getPrice());
			ps.setInt(3, vo.gettAmount());
			ps.executeUpdate();


		} finally {
			con.close();
		}

	} // end insertorder()

}
