package chart;

import java.sql.*;
import java.util.*;

public class Database {

	String URL = "jdbc:mysql://localhost:3306/basic";
	String USER ="scott";
	String PASS = "tiger";

	public ArrayList<ArrayList> getData() {

		ArrayList<ArrayList> data = new ArrayList<ArrayList>();
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, USER , PASS);	
			
			//***************************************************************
			String sql = "SELECT   PNAME, SUM(AMOUNT) AS AMOUNT  "
					   + "FROM 	   orderlist  "
					   + "GROUP BY PNAME  "
					   + "ORDER BY AMOUNT DESC  "
					   + "LIMIT 7  ";
			
			
			//***************************************************************
			
			PreparedStatement stmt = con.prepareStatement( sql );	

			ResultSet rset = stmt.executeQuery();

			
			while( rset.next() ){
				ArrayList temp = new ArrayList();
				temp.add( rset.getInt("AMOUNT"));				//****************
				temp.add( rset.getString("PNAME"));		//****************		
				data.add(temp);
			}
			rset.close();
			stmt.close();
			con.close();
		} catch(Exception ex){
			System.out.println("에러 : " + ex.getMessage() );
		}
		return data;
	}
}
