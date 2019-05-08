package jdbc;
import java.sql.*;
public class JDBCexample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("", "", "");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from emp ");
		while ( rs.next()) {
			System.out.println(rs.getString(1)  + rs.getString(2));
		}
		st.close();
		con.close();

	}

}
