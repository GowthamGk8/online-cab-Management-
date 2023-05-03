package Com.Mytaxi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Com.Mytaxi.Ulti.DatabaseUlti;
import Com.Mytaxi.model.User;

public class UserDao {
	
	Connection con=null;
	
	public boolean createUser(User user) {
		
		try {
			con = DatabaseUlti.createConnection();
			
			String query = "insert into user(username,email,password) values(?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1,user.getUsername());
			ps.setString(2,user.getEmail() );
			ps.setString(3,user.getPassword());
			
			
			int i = ps.executeUpdate();
			if(i>0)
				return true;	
		}
		catch(Exception e) {
			return false;  
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {	
				e.printStackTrace();
			}
		}
		return false;  //insertion is not done

	}
	public User getUser(String username,String password) {
		
		try {
			con = DatabaseUlti.createConnection();
			
			String query = "select * from user where username=? and password=?";
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			User user = null;
			
			while(rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
			}
			return user;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	}


