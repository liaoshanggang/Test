package server.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnection {
	public static final String DBURL = "jdbc:mysql://localhost:3306/books";
	public static final String DBUSER = "root";
	public static final String DBPASS = "1111";
	public static final String DBRIVER = "org.gjt.mm.mysql.Driver";

	static {
		try {
			Class.forName(DBRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnect() throws SQLException {
		return DriverManager.getConnection(DBURL, DBUSER, DBPASS);
	}

	public void close(Connection con, Statement sta, ResultSet re) {
		try {
			re.close();
			if (con != null && re != null) {
				close(con, sta);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void close(Connection con, Statement sta) {
		if (con != null && sta != null) {
			try {
				sta.close();
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
