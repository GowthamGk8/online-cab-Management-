package Com.Mytaxi.model;

public class Trip {
	
   private int id;
   private String pickup;
   private String droplocation;
   private String mobile;
   private String time;
   private String date;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPickup() {
	return pickup;
}
public void setPickup(String pickup) {
	this.pickup = pickup;
}
public String getDroplocation() {
	return droplocation;
}
public void setDroplocation(String droplocation) {
	this.droplocation = droplocation;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString() {
	return "Trip [id=" + id + ", pickup=" + pickup + ", droplocation=" + droplocation + ", mobile=" + mobile + ", time="
			+ time + ", date=" + date + "]";
}
   
	
   
	
	
	
	
	

}
