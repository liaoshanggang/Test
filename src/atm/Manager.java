package atm;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Manager {
	int userSel = -1;
	User user = new User();
	static Scanner in = new Scanner(System.in);
	//开始主界面
	public void startMainMenu(){
			System.out.println("=======Welcome to ATM取款!=========");
			System.out.println("1、存储用户");
			System.out.println("2、银行超管");
			System.out.println("3、无卡存款");
			System.out.println("4、结束退出");
			System.out.println("请输入您的选择：");
			
			userSel = in.nextInt();
			switch(userSel){
				case 1:
					subMenu1();
					break;
				case 2:
					subMenu2();
					break;
				case 3:
					subMenu3();
					break;
				case 4:
					subMenu4();
					break;
				default:
					System.out.println("没有此选项！");
		}
	}
	
	//用户系统1、存储用户存储用户界面
	public void subMenu1(){
		while(true){
			System.out.println("========用户系统1、存储用户=========");
			System.out.println("1、注册");
			System.out.println("2、登陆");
			System.out.println("3、返回");
			System.out.println("请输入你的选择：");
			userSel = in.nextInt();
			switch(userSel){
			case 1:
				//subMenu1Register();//用户注册
				createUser();
				break;
			case 2:
				subMenu1Login();
				break;
			case 3:
				startMainMenu();
				break;
			default:
				System.out.println("数据输入不正确");
				break;
			}
		}
	}
	//系统自动分配数据
	private void createUser() {
		// TODO 自动生成的方法存根
		System.out.println("系统自动分配如下信息：");
		String id = randId(new Date());
		User admin = new User("Tom", "123456", id, 10000.0);
		System.out.println("用户名："+user.name);
		System.out.println("密码："+user.pwd);
		System.out.println("id："+user.id);
		System.out.println("余额："+user.balance);
	}
	
	//注册菜单的功能
	public void subMenu1Register(){
		boolean resp = false;//标记是否成功
		int userNum = 0; 
		String userPwd2 = "";
		String userPwd = "";
		System.out.println("============普通用户登录界面=============");
		do{
			System.out.println("请输入您的姓名：");
			user.name = in.next();
			System.out.println("请输入您的密码：");
			user.pwd = in.next();
			System.out.println("请再次输入您的密码：");
			userPwd2 = in.next();
			System.out.println("请存入初次存款金额:");
			user.balance = in.nextDouble();
			//调用这方法对用户名，密码进行验证，返回是否成功
			resp = verify(user.name,user.pwd,userPwd2);
			
		}while(!resp);
		
		//随机生成用户账号id
		user.id = randId(new Date());
		System.out.println("你的账号id为："+user.id);
		System.out.println("账户已注册成功！");
		subMenu1();//到用户系统菜单去
		
		
	}
	public String randId(Date date) {
		// TODO Auto-generated method stub
		//生成时间14位
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return 6220+simpleDateFormat.format(date);
	}

	/*对用户名长度和密码进行判断*/
	public boolean verify(String userName, String userPwd1, String userPwd2) {
		// TODO 自动生成的方法存根
		boolean flag = false;//标记是否成功
		if(user.name.length()<1||user.pwd.length()<6){
			System.out.println("用户名长度不能小于1，密码长度不能小于6！");
		}else if(!user.pwd.equals(userPwd2)){
			System.out.println("两次输入的密码必须一致");
		}else{
			System.out.println("注册成功！请牢记用户名和密码。");
			flag = true;
		}
		return flag;
	}
	//登陆
	public void subMenu1Login(){
		String name = "";
		String pwd = "";
		while(true){
			System.out.println("请输入用户名：");
			name = in.next();
			System.out.println("请输入密码：");
			pwd = in.next();
			if(name.equals(user.name)&&pwd.equals(user.pwd)){
				System.out.println("登录成功！");
				break;	
			}
		}
		userBubusiness();	
	}
	//用户业务界面
	private void userBubusiness() {
		// TODO 自动生成的方法存根
		while(true){
			System.out.println("=======欢迎进入用户业务界面======");
			System.out.println("1、查看用户");
			System.out.println("2、存款项目");
			System.out.println("3、取款项目");
			System.out.println("4、即时转账");
			System.out.println("5、充值缴费");
			System.out.println("6、查看记录");
			System.out.println("7、修改密码");
			System.out.println("8、返回菜单");
			System.out.println("请输入您的选择：");
			userSel = in.nextInt();
			switch(userSel){
			case 1:
				lookCount();
				break;
			case 2:
				depositProject();
				break;
			case 3:
				withdrawProject();
				break;
			case 4:
				instantMoneyTransfer(); 
				break;
			case 5:
				topUpPayment();
				break;
			case 6:
				checkRecord();
				break;
			case 7:
				changePwd();
				break;
			case 8:
				startMainMenu();
				break;
			default:
				break;
			}
		}
	}

	public void changePwd() {
		// TODO Auto-generated method stub
		
	}

	public void checkRecord() {
		// TODO Auto-generated method stub
		
	}

	public void topUpPayment() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("=====欢迎进入充值缴费====");
			System.out.println("1、代缴水电费用");
			System.out.println("2、代交业务管理费");
			System.out.println("3、返回服务列表");
			switch(userSel){
			case 1:
				toUpPayment1();
				break;
			case 2:
				toUpPayment2();
				break;
			case 3:
				subMenu1Login();
				break;
			default:
				break;
			}
			
		}
	}

	public void toUpPayment2() {
		// TODO 自动生成的方法存根
		
	}

	public void toUpPayment1() {
		// TODO 自动生成的方法存根
		
	}

	public void instantMoneyTransfer() {
		// TODO Auto-generated method stub
		
	}

	public void withdrawProject() {
		// TODO Auto-generated method stub
		
	}

	public void depositProject() {
		// TODO Auto-generated method stub
		
	}

	public void lookCount() {
		// TODO Auto-generated method stub
		
	}
	//自动创建系统管理员的信息
	public User createAdm(){
		String id = randId(new Date());
		User admin = new User("Admin", "123456", id, 1000.0);
		return admin;
	}
	//系统管理员登录界面
	public void adminLogin(){
		User admin = createAdm();
		String name = "";
		String pwd = "";
		System.out.println("========管理员登录界面=============");
		while(true){
			System.out.println("请输入你的管理员名字：");
			name = in.next();
			System.out.println("请输入你的密码：");
			pwd = in.next();
			if(name.equals(admin.name)&&pwd.equals(admin.pwd)){
				System.out.println("登录成功！");
				break;	
			}
		}
	}
	//2、银行超管
	public void subMenu2(){
		adminLogin();
		while(true){
			System.out.println("========2、银行超管=========");
			System.out.println("1、查看所有账户信息");
			System.out.println("2、注销用户");
			System.out.println("3、查看用户记录");
			System.out.println("4、修改用户密码");
			System.out.println("5、解冻用户");
			System.out.println("请输入您的选择：");
			userSel = in.nextInt();
			switch(userSel){
			case 1:
				lookAllCountInfo();
				break;
			case 2:
				cancleUser();
				break;
			case 3:
				lookUserRecord();
				break;
			case 4:
				updateUserPwd();
				break;
			case 5:
				unfreezeUser();
				break;
			}
		}
	}
	public void unfreezeUser() {
		// TODO Auto-generated method stub
		
	}

	public void updateUserPwd() {
		// TODO Auto-generated method stub
		
	}

	public void lookUserRecord() {
		// TODO Auto-generated method stub
		
	}

	public void cancleUser() {
		// TODO Auto-generated method stub
		
	}

	public void lookAllCountInfo() {
		// TODO Auto-generated method stub
		
	}

	//3、无卡存款
	public void subMenu3(){
		System.out.println("========3、无卡存款=========");
	}
	//4、结束退出
	public void subMenu4(){
		System.out.println("退出");
	}
	
	
}
