package bean;

public class Login {
	private String userId;
	private String userName;
	private String password;
	private String contactNo;
	private String userType;
	private String email;
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getContactNo() {
		return contactNo;
	}
	public String getUserType() {
		return userType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
