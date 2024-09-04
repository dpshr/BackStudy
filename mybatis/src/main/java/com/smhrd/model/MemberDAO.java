package com.smhrd.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.mybatis.SqlSessionManager;

public class MemberDAO {
	// SqlSessionManager에 있는 sqlSessionFactory불러오기
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
	// 회원가입 메소드
	public int join(MemberDTO dto) {
		// openSession(): sqlSessionFactory객체에서 Connection(SqlSession)빌려오는 메소드
		// true: auto commit
		SqlSession session = sqlSessionFactory.openSession(true);
		// sql : insert into member values(id,pw,name,age);
		
		// 첫번째 매개변수 : mapper.xml에서 호출할 sql문장의 id, 
					// 일반적으로 현재 메소드의 이름을 작성하는 것이 관습
		// 두번째 매개변수 : sql문장을 실행할 때 필요한 값이 있는 경우 넘겨주는 데이터 
		int row = session.insert("join", dto);
		session.close();
		
		return row;
	}
	// 로그인 메소드
	public String login(MemberDTO dto) {
		 SqlSession session = sqlSessionFactory.openSession(true);
		String name = session.selectOne("login", dto);
		 session.close();
		return name;
	}



}
