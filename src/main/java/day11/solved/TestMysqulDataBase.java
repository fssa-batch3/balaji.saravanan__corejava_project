package day11.solved;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMysqulDataBase {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/fssa";
		String userName = "root";
		String password = "123456";

		String query ="select* from users";
		
		Connection con = DriverManager.getConnection(url, userName, password);

//		System.out.println("connection created...");
		
		Statement st= con.createStatement();
		
		ResultSet rs= st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
		}
		con.close();

	}

}
