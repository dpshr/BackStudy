package com.smhrd.model;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.mybatis.SqlSessionManager;

public class MemberDAO {
	
	static SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();

	public int join(MemberDTO dto) {
		SqlSession session = sqlSessionFactory.openSession(true);
		int row = session.insert("join", dto);
		session.close();
		
		return row;
	}

	public boolean idCheck(String email) {
		SqlSession session = sqlSessionFactory.openSession(true);
		String name = session.selectOne("idCheck", email);
		session.close();
		
		if(name != null) return true;
		else return false;
	}

	public MemberDTO login(MemberDTO dto) {
		SqlSession session = sqlSessionFactory.openSession(true);
		MemberDTO user_info = session.selectOne("login", dto);
		session.close();
		
		return user_info;
	}

	public int update(MemberDTO dto) {
	 SqlSession session = sqlSessionFactory.openSession(true);
	 int row = session.update("update",dto);
	 session.close();
		return row;
	}
	
	public static ArrayList<MemberDTO> selectMember(){
		SqlSession session = sqlSessionFactory.openSession(true);
		ArrayList<MemberDTO>memList = (ArrayList)session.selectList("selectMember");
		session.close();
		return memList;
	}
	public int delete(String dto) {
		SqlSession session= sqlSessionFactory.openSession(true);
		int row = session.insert("delete",dto);
		session.close();
		return row;
	}
	
}









