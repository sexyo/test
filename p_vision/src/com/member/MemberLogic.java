package com.member;

public class MemberLogic {
	MemberDao mDao = new MemberDao();
	public String check_email(String check_email) {
		check_email = mDao.check_email(check_email);
		System.out.println("mLogic");
		return check_email;
	}
	public String cert_email(String cert_email) {
		cert_email = mDao.cert_email(cert_email);
		return cert_email;
	}
	public String find_id(String find_id) {
		find_id = mDao.find_id(find_id);
		return find_id;
	}
	public String find_pw(String find_pw) {
		find_pw = mDao.find_pw(find_pw);
		return find_pw;
	}
	public String register(String register) {
		register = mDao.register("","", register, register, register, register, register);
		return register;
	}
	

}
