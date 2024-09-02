package service;

import java.util.List;

import model.Member;

public interface MemberService {
	
	//create
	void addMember(Member m);
	
	//read
	List<Member> queryAll();
	Member queryMember(String username,String password);
	Member queryByUsername(String username);
	
	//update
	void passwordupdateMember(String username,String password);
	void nameupdateMember(String username,String membername);
	void genderupdateMember(String username,String gender);
	void cityupdateMember(String username,String city);
	void areaupdateMember(String username,String area);
	void roadupdateMember(String username,String road);
	void emailupdateMember(String username,String email);
	void phoneupdateMember(String username,String phone);
	
	//delete
	void deleteMember(String username);
	
}