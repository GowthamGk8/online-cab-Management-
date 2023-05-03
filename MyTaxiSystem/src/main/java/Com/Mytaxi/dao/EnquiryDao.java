package Com.Mytaxi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Com.Mytaxi.Ulti.DatabaseUlti;
import Com.Mytaxi.model.Enquiry;

public class EnquiryDao {
	
Connection con = null;
	
	public EnquiryDao ()
	throws ClassNotFoundException, SQLException{
		 con = DatabaseUlti.createConnection();
		 }
		
		public boolean createEnquiry(Enquiry enquiry) throws SQLException {
			
		String query ="insert into enquiry (name,mobile,email,subject,comment)values(?,?,?,?,?)";
		PreparedStatement en =con.prepareStatement(query);
		
		en.setString(1,enquiry.getName());
		en.setString(2,enquiry.getMobile());
		en.setString(3,enquiry.getEmail());
		en.setString(4,enquiry.getSubject());
		en.setString(5,enquiry.getComment());
		
		 
		 int i =en.executeUpdate();
		 if(i>0)
			 return true;
		 else
			return false;
		}
}
