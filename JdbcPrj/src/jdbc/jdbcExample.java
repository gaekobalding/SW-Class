package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcExample {
		static {
			try{Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로드");
			} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			}
		}

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("test");
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "hr";
		String password = "hr";
		//생성
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println(con);
			String sql =  "select first_name, hire_date, salary, department_id "
					+ "from employees where department_id=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, 60); //이거를 써야 더 효율이 좋다 밑에 것은 거의 쓰지 않는다.
			ResultSet rs = stmt.executeQuery(); 
//			Statement stmt = con.createStatement();
////			int deptno = 60;
//			String deptno = "\'\' or \' \' = \' \'";// '' or ' '=' '
////			String sql = "select employee_id, first_name, salary from employees";
//			String sql = "select first_name, hire_date, salary, department_id "
//						+ "from employees where department_id=" + deptno;
//			System.out.println(sql);
//			ResultSet rs = stmt.executeQuery(sql);  //execute는 무조건 ResultSe으로 받아야 한다.
			System.out.println(rs);
			while(rs.next()) {
//				System.out.print(rs.getInt("employee_id") + "\t");
				System.out.print(rs.getNString("first_name") + "\t");
				System.out.println(rs.getDouble("salary") + "\t");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				con.close(); // close 는 예외처리를 해줘야 한다.
			} catch (SQLException e) {
				
			}
		}
		
		Class.forName("oracle.jdbc.OracleDriver");
	//	DriverManager.registerDriver(new oracle.jdbc.driver.OracleArray());
		System.out.println("dd");
		
	}

}
