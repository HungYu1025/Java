package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;
import dao.ReserveDao;
import model.Reserve;

public class ReserveDaoImpl implements ReserveDao{

	@Override
	public void add(Reserve r) {
		Connection conn = DbConnection.getDb();
		String SQL = "insert into reserve(year,month,date,time) values(?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, r.getYear());
			ps.setString(2, r.getMonth());
			ps.setString(3, r.getDate());
			ps.setString(4, r.getTime());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void additem(Reserve r) {
		Connection conn = DbConnection.getDb();
		String SQL = "insert into reserve(scalpcare,shampoo,haircut,perm,haircoloring) values(?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, r.getScalpcare());
			ps.setString(2, r.getShampoo());
			ps.setString(3, r.getHaircut());
			ps.setString(4, r.getPerm());
			ps.setString(5, r.getHaircoloring());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void addAll(Reserve r) {
		Connection conn = DbConnection.getDb();
		String SQL = "insert into reserve(username,membername,year,month,date,time,scalpcare,shampoo,haircut,perm,haircoloring,stamp) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, r.getUsername());
			ps.setString(2, r.getMembername());
			ps.setString(3, r.getYear());
			ps.setString(4, r.getMonth());
			ps.setString(5, r.getDate());
			ps.setString(6, r.getTime());
			ps.setString(7, r.getScalpcare());
			ps.setString(8, r.getShampoo());
			ps.setString(9, r.getHaircut());
			ps.setString(10, r.getPerm());
			ps.setString(11, r.getHaircoloring());
			ps.setTimestamp(12, new java.sql.Timestamp(new java.util.Date().getTime()));
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Reserve> selectAll() {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from reserve";
		List<Reserve> l = new ArrayList<Reserve>();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				Reserve r = new Reserve();
				r.setId(rs.getInt("id"));
				r.setUsername(rs.getString("username"));
				r.setMembername(rs.getString("membername"));
				r.setYear(rs.getString("year"));
				r.setMonth(rs.getString("month"));
				r.setDate(rs.getString("date"));
				r.setTime(rs.getString("time"));
				r.setScalpcare(rs.getString("scalpcare"));
				r.setShampoo(rs.getString("shampoo"));
				r.setHaircut(rs.getString("haircut"));
				r.setPerm(rs.getString("perm"));
				r.setHaircoloring(rs.getString("haircoloring"));
				r.setStamp(rs.getTimestamp("stamp"));
				l.add(r);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public Reserve queryReserve(String username) {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from reserve where username=?";
		Reserve r = null;
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) 
			{
				r = new Reserve();
				r.setYear(rs.getString("year"));
				r.setMonth(rs.getString("month"));
				r.setDate(rs.getString("date"));
				r.setTime(rs.getString("time"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	
	@Override
	public Reserve queryReserve(String year, String month, String date, String time) {
		Connection conn = DbConnection.getDb();
		String SQL = "select * from reserve where year=? and month=? and date=? and time=?";
		Reserve r = null;
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, year);
			ps.setString(2, month);
			ps.setString(3, date);
			ps.setString(4, time);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) 
			{
				r = new Reserve();
				r.setYear(rs.getString("year"));
				r.setMonth(rs.getString("month"));
				r.setDate(rs.getString("date"));
				r.setTime(rs.getString("time"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}

	@Override
	public void delete(String username) {
		Connection conn = DbConnection.getDb();
		String SQL = "delete from reserve where username=?";
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
