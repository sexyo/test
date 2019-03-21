package com.member;

import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.account.AccountDao;
import com.util.MyBatisCommonFactory;

public class MemberDao {
	Logger logger = Logger.getLogger(MemberDao.class);
	SqlSessionFactory sqlSessionFactory = null;
	SqlSession sqlSession = null;
	
	public MemberDao() {
		sqlSessionFactory = MyBatisCommonFactory.getSqlSessionFactory();
		sqlSession = sqlSessionFactory.openSession();
	}
	public String check_email(String email) {
		String check = "";
		//insert 파라미터로 받은 이메일주소로 중복확인 후에 있으면 사용할수없니마니 없으면 사용가능 같은 메시지 출력
		if("heehee".equals(email)) {
			check = "사용할 수 없는 이메일입니다";
		}
		else {
			check = "사용가능한 이메일입니다.";
		}
		return check;
	}

	public String cert_email(String cert_email) {
		//inser here 개인이알아서 수정하셍
		
		return cert_email;
	}

	public String find_id(String find_id) {
		//inser here
		return find_id;
	}

	public String find_pw(String find_pw) {
		//insert here
		return find_pw;
	}
	public static void main(String[] args) {
		MemberDao mdao = new MemberDao();
		mdao.register("", "", "", "", "", "", "");
		
	}

	public String register(String P_MEM_PW, String P_MEM_PHONE, String P_MEM_BIRTHDAY, String P_MEM_ADDR, String P_MEM_MAIL, String P_MEM_NAME, String P_MEM_JOB) {
		logger.info("register 메소드 호출성공");
		String register = "";
		String P_MEM_ID = "test123zut";
		P_MEM_PW = "123";
		P_MEM_PHONE ="010-4234-9948";
		P_MEM_BIRTHDAY ="1988/07/15";
		P_MEM_ADDR = "인천시 남동구";
		P_MEM_MAIL = "hee20715@naver.com";
		P_MEM_NAME = "황희상";
		P_MEM_JOB ="무직";
		try {
			String resource = "com/mybatis/MapperConfig.xml";
			Reader reader = null; 
			reader = Resources.getResourceAsReader(resource); 
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader); //
			Map<String,Object> pMap = new HashMap<String,Object>();
			pMap.put("P_MEM_ID", P_MEM_ID);
			pMap.put("P_MEM_PW", P_MEM_PW);
			pMap.put("P_MEM_PHONE", P_MEM_PHONE);
			pMap.put("P_MEM_BIRTHDAY", P_MEM_BIRTHDAY);
			pMap.put("P_MEM_ADDR", P_MEM_ADDR);
			pMap.put("P_MEM_MAIL", P_MEM_MAIL);
			pMap.put("P_MEM_NAME", P_MEM_NAME);
			pMap.put("P_MEM_JOB", P_MEM_JOB);
			sqlSession = sqlSessionFactory.openSession();
			sqlSession.selectOne("proc_register",pMap);
			sqlSession.commit();
			logger.info("이름 :" + pMap.get("P_MEM_NAME"));
			logger.info("결과 :" + pMap.get("R_RESULT"));
			register = (String)pMap.get("P_MEM_NAME");
		} catch (Exception e) {
			logger.info("Exception : "+e.toString());
		}
		
		
		
		return register;
	}

}
