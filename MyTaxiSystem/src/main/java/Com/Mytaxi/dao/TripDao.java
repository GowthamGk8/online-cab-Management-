package Com.Mytaxi.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Com.Mytaxi.Ulti.DatabaseUlti;
import Com.Mytaxi.model.Trip;

public class TripDao {
	
	Connection con =null;
	
	public TripDao() throws ClassNotFoundException,SQLException{
		con=DatabaseUlti.createConnection();
		
	}
	
	public boolean createTrip(Trip trip) throws SQLException{
		
		String query="insert into trip(pickup,droplocation,mobile,time,date) values (?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setString(1,trip.getPickup());
		ps.setString(2,trip.getDroplocation());
		ps.setString(3,trip.getMobile());
		ps.setString(4,trip.getTime());
		ps.setString(5,trip.getDate());
		
		
		int i =ps.executeUpdate();
		if(i>0)
			return true;
		else
			return false;
	}
	

}
