package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

public class MemberDAO {
//	DAO: Data Access Object DB에 접근하는 객체
	
//	1. 외부라이브러리 ojdbc6.jar 추가
// 		전역변수
	Connection conn = null;
	PreparedStatement psmt =null;
	int row= 0;
	ResultSet rs = null;
	String name = null;
//	DB연결 메소드
	public void db_conn() {
		try {
//			2. OracleDriver 클래스(통로)
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			3. 카드키
			String db_url ="jdbc:oracle:thin:@localhost:1521:xe";
			String db_user ="hr";
			String db_pw ="hr";
			
			conn = DriverManager.getConnection(db_url,db_user,db_pw);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	DB연결 종료 메소드
	public void db_close() {
		try {
			if(rs !=null)rs.close();
			if(psmt !=null)psmt.close();
			if(conn !=null)conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
//	회원가입 메소드
	public int join(MemberDTO dto){
		db_conn();
		try {
			String sql = "insert into member values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1,dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			
			row = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			db_close();
		}
		return row;
	}

//	로그인 메소드
	public String login(MemberDTO dto) {
		db_conn();
		try {
			String sql = "select name from member where id =? and pw = ? ";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1,dto.getId());
			psmt.setString(2, dto.getPw());	
			rs=psmt.executeQuery();
			if(rs.next()) {
				name= rs.getString("name");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			db_close();
		}
		return name;
	}
	}

