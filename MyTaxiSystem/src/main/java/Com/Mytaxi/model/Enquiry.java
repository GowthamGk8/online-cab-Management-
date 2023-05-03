package Com.Mytaxi.model;

public class Enquiry {
	
	private String name;
	private String mobile;
	private String email;
	private String subject;
	private String comment;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Enquiry [name=" + name + ", mobile=" + mobile + ", email=" + email + ", subject=" + subject
				+ ", comment=" + comment + "]";
	}
	
	
	
}
