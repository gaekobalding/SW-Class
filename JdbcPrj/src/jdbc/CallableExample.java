package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.internal.OracleCallableStatement;

public class CallableExample {
	static {
		try {
		Class.forName("oracle.driver.OracleDriver");
		System.out.println("로딩");
	}catch (ClassNotFoundException e) {
		System.out.println(e.getMessage());
	}
		}

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "hr";
		String password = "hr";
		//생성
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "{call GETSALARY(?, ?)}";
			CallableStatement stmt = con.prepareCall(sql);
			stmt.setInt(1, 103);
			stmt.registerOutParameter(2, java.sql.Types.DOUBLE); //출력 파라미터 , 더블 타입으로 출력을 받는다.
			stmt.execute();
			System.out.println(stmt.getDouble(2));
			 
		}catch (Exception e) {
			System.out.println(e.getMessage());
			}finally {
				try {
					con.close(); // close 는 예외처리를 해줘야 한다.
				} catch (SQLException e) {}
					
				}
			}
}
