package atm;

public class User {
	String id;//账号id
	String name;//用户名
	String pwd;//用户名密码
	double balance;//账户余额
	public User(){
		
	}
	public User(String name,String pwd,String id,Double balance){
		this.name = name;
		this.pwd = pwd;
		this.id = id;
		this.balance = balance;
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
