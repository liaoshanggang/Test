package atm1;

public class User {
	String id;//账号id
	String userName;//用户名
	String userPwd;//用户名密码
	double depositMoney;
	public User(){
		
	}
	public User(String userName,String userPwd){
		this.userName = userName;
		this.userPwd = userPwd;
	}
	/*public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public double getDepositMoney() {
		return depositMoney;
	}
	public void setDepositMoney(double depositMoney) {
		this.depositMoney = depositMoney;
	}*/
	
}
