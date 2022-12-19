
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class ConnectionDB {
    static Connection conn;
	static Statement stm;

	public Statement getStm() {
		return stm;
	}

	public static void setStm(Statement stm) {
		ConnectionDB.stm = stm;
	}

	private static String DB_URL = "jdbc:sqlserver://DESKTOP-38Q6F9E\\SQLEXPRESS2012;encrypt=true;database=baitap;trustServerCertificate=true";

	public ConnectionDB() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(DB_URL, "sa", "123456788");
			System.out.println("Successful!");
			stm = conn.createStatement();
		} catch (Exception ex) {
			System.out.println("Fail!");
			ex.printStackTrace();
		}
	}

	public static Connection getConn() {
		return conn;
	}

	public static void setConn(Connection conn) {
		ConnectionDB.conn = conn;
	}

	public static void main(String[] args) {
		new ConnectionDB();

	}
}
