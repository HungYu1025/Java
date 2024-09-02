package service.impl;

import java.util.List;

import dao.impl.MemberDaoImpl;
import model.Member;
import service.MemberService;

public class MemberServiceImpl implements MemberService{
	
	private static MemberDaoImpl mdi = new MemberDaoImpl();

	@Override
	public void addMember(Member m) {
		mdi.add(m);
	}

	@Override
	public List<Member> queryAll() {
		return mdi.selectAll();
	}

	@Override
	public Member queryMember(String username, String password) {
		List<Member> l = mdi.selectMember(username, password);
		Member[] m = l.toArray(new Member[1]);
		return m[0];
	}

	@Override
	public Member queryByUsername(String username) {
		List<Member> l = mdi.selectByUsername(username);
		Member[] m = l.toArray(new Member[1]);
		return m[0];
	}

	@Override
	public void passwordupdateMember(String username, String password) {
		Member m = queryByUsername(username);
		m.setPassword(password);
		mdi.memberupdate(m);
	}

	@Override
	public void nameupdateMember(String username, String membername) {
		Member m = queryByUsername(username);
		m.setMembername(membername);
		mdi.memberupdate(m);
	}

	@Override
	public void genderupdateMember(String username, String gender) {
		Member m = queryByUsername(username);
		m.setGender(gender);
		mdi.memberupdate(m);
	}

	@Override
	public void cityupdateMember(String username, String city) {
		Member m =queryByUsername(username);
		m.setCity(city);
		mdi.memberupdate(m);
	}

	@Override
	public void areaupdateMember(String username, String area) {
		Member m = queryByUsername(username);
		m.setArea(area);
		mdi.memberupdate(m);
	}

	@Override
	public void roadupdateMember(String username, String road) {
		Member m = queryByUsername(username);
		m.setRoad(road);
		mdi.memberupdate(m);
	}

	@Override
	public void emailupdateMember(String username, String email) {
		Member m = queryByUsername(username);
		m.setEmail(email);
		mdi.memberupdate(m);
	}

	@Override
	public void phoneupdateMember(String username, String phone) {
		Member m = queryByUsername(username);
		m.setPhone(phone);
		mdi.memberupdate(m);
	}

	@Override
	public void deleteMember(String username) {
		Member m = queryByUsername(username);
		m.setUsername(username);
		mdi.memberupdate(m);
	}

}