package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

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
	
	public int insert(MemberVO vo) {
		String sql="insert into membertbl(no,name,age,gender) values(member_seq.nextval,?,?,?)";
		int result = 0;
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getAge());
			pstmt.setString(3, vo.getGender());
			
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public MemberVO getRow(int no) {
		String sql = "select * from membertbl where no=?";
		MemberVO vo = null;
		
		try(Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new MemberVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt(3));
				vo.setGender(rs.getString("gender"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	//no값을 이용해서 회원 삭제하기
	public int delete(int no) {
		int result = 0;
		String sql = "delete from membertbl where no=?";
		
		try (Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){ // 괄호안에 넣으면 try문이 끝날때 finally close문을 안사용해도 자동으로 닫힘
					
					pstmt.setInt(1, no);
					result = pstmt.executeUpdate();
		} catch (Exception e) {
		}
		
		return result;
	}
	
	
	
	
	
}
