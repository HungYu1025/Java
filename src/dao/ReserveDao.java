package dao;

import java.util.List;

import model.Reserve;

public interface ReserveDao {
	// create
	void add(Reserve r);
	void additem(Reserve r);
	void addAll(Reserve r);

	// read
	List<Reserve> selectAll();
	Reserve queryReserve(String username);
	Reserve queryReserve(String year, String month, String date, String time);

	// update

	// delete
	public void delete(String username);

}
