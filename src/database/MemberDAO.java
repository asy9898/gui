package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

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
	
	public Vector<MemberVO> getList() {
		String sql = "select * from membertbl";
		Vector<MemberVO> vec = new Vector<MemberVO>();
		
		try(Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			
			
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setAge(rs.getInt(3));
				vo.setGender(rs.getString(4));
				vec.add(vo);
			}
			
		} catch (Exception e) {
		}
		return vec;
	}
	
	
	
	//asdawd 테스트
	
	
	
	
	
	
	
}
