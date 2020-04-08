package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	//커넥션 연결
	public Connection getConnection() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "javadb";
		String password = "12345";
		try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
		
	}
	
	//데이터베이스 요청작업 (insert,delete,select........)
	
	public List<MemberVO> getList() {
		String sql = "select * from membertbl";
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		try(Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			
			MemberVO vo = new MemberVO();
			
			if(rs.next()) {
				vo.setNo(rs.getInt("no"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setGender(rs.getString("gender"));
				list.add(vo);
			}
			
		} catch (Exception e) {
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
}
