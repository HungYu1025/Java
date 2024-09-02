package dao;

import java.util.List;

import model.Member;

public interface MemberDao {
	
	//create
	void add(Member m);
	
	//read
	List<Member> selectAll();
	List<Member> selectMember(String username,String password);
	List<Member> selectByUsername(String username);
	Member queryMember(String username,String password);
	Member querMember(String username);
	
	//update
	public void memberupdate(Member m);
	
	//delete
	public void delete(String username);
	

}
