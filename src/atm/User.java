package atm;

public class User {
	String id;//�˺�id
	String name;//�û���
	String pwd;//�û�������
	double balance;//�˻����
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
