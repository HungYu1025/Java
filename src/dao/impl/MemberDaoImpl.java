package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;
import dao.MemberDao;
import model.Member;

public class MemberDaoImpl implements MemberDao{

	@Override
	public void add(Member m) {
		Connection conn = DbConnection.getDb();
		String SQL = "insert into member(username,password,membername,gender,city,area,road,email,phone) values(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, m.getUsername());
			ps.setString(2, m.getPassword());
			ps.setString(3, m.getMembername());
			ps.setString(4, m.getGender());
			ps.setString(5, m.getCity());
			ps.setString(6, m.getArea());
			ps.setString(7, m.getRoad());
			ps.setString(8, m.getEmail());
			ps.setString(9, m.getPhone());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Member> selectAll() {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from member";
		List<Member> l = new ArrayList<Member>();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				Member m = new Member();
				m.setId(rs.getInt("id"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setMembername(rs.getString("membername"));
				m.setGender(rs.getString("gender"));
				m.setCity(rs.getString("city"));
				m.setArea(rs.getString("area"));
				m.setRoad(rs.getString("road"));
				m.setEmail(rs.getString("Email"));
				m.setPhone(rs.getString("phone"));
				l.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Member> selectMember(String username, String password) {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from member where username=? and password=?";
		List<Member> l = new ArrayList<Member>();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				Member m = new Member();
				m.setId(rs.getInt("id"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setMembername(rs.getString("membername"));
				m.setGender(rs.getString("gender"));
				m.setCity(rs.getString("city"));
				m.setArea(rs.getString("area"));
				m.setRoad(rs.getString("road"));
				m.setEmail(rs.getString("Email"));
				m.setPhone(rs.getString("phone"));
				l.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Member> selectByUsername(String username) {
		Connection conn = DbConnection.getDb();
		String SQL ="select * from member where username=?";
		List<Member> l = new ArrayList<Member>();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				Member m = new Member();
				m.setId(rs.getInt("id"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setMembername(rs.getString("membername"));
				m.setGender(rs.getString("gender"));
				m.setCity(rs.getString("city"));
				m.setArea(rs.getString("area"));
				m.setRoad(rs.getString("road"));
				m.setEmail(rs.getString("Email"));
				m.setPhone(rs.getString("phone"));
				l.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	
	//
	@Override
	public Member queryMember(String username, String password) {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from member where username=? and password=?";
		Member m = null;
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				m = new Member();
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setMembername(rs.getString("membername"));
				m.setGender(rs.getString("gender"));
				m.setCity(rs.getString("city"));
				m.setArea(rs.getString("area"));
				m.setRoad(rs.getString("road"));
				m.setEmail(rs.getString("email"));
				m.setPhone(rs.getString("phone"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public Member querMember(String username) {
		Connection conn=DbConnection.getDb();
		String SQL="select * from member where username=?";
		Member m = null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				m = new Member();
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setMembername(rs.getString("membername"));
				m.setGender(rs.getString("gender"));
				m.setCity(rs.getString("city"));
				m.setArea(rs.getString("area"));
				m.setRoad(rs.getString("road"));
				m.setEmail(rs.getString("email"));
				m.setPhone(rs.getString("phone"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	
	@Override
	public void memberupdate(Member m) {
		Connection conn = DbConnection.getDb();
		String SQL = "update member set password=?,membername=?,gender=?,city=?,area=?,road=?,email=?,phone=? where username=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, m.getPassword());
			ps.setString(2, m.getMembername());
			ps.setString(3, m.getGender());
			ps.setString(4, m.getCity());
			ps.setString(5, m.getArea());
			ps.setString(6, m.getRoad());
			ps.setString(7, m.getEmail());
			ps.setString(8, m.getPhone());
			ps.setString(9, m.getUsername());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String username) {
		Connection conn = DbConnection.getDb();
		String SQL = "delete from member where username=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}