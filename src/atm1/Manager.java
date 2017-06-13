package atm1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Manager {
	int userSel = -1;
	User user = new User();;
	static int num = 0;//������¼�û���
	User[] users = new User[40];//��users����洢����û�
	static Scanner in = new Scanner(System.in);
	//��ʼ������
	public void startMainMenu(){
			System.out.println("=======Welcome to ATMȡ��!=========");
			System.out.println("1���洢�û�");
			System.out.println("2�����г���");
			System.out.println("3���޿����");
			System.out.println("4�������˳�");
			System.out.println("����������ѡ��");
			
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
					System.out.println("û�д�ѡ�");
		}
	}
	
	//�û�ϵͳ1���洢�û��洢�û�����
	public void subMenu1(){
		while(true){
			System.out.println("========�û�ϵͳ1���洢�û�=========");
			System.out.println("1��ע��");
			System.out.println("2����½");
			System.out.println("3������");
			System.out.println("���������ѡ��");
			userSel = in.nextInt();
			switch(userSel){
			case 1:
				subMenu1Register();
				break;
			case 2:
				subMenu1Login();
				break;
			case 3:
				startMainMenu();
				break;
			default:
				System.out.println("�������벻��ȷ");
				break;
			}
		}
	}
	//ע��˵��Ĺ���
	public void subMenu1Register(){
//		user = new UserInfo();
		Register();
		System.out.println("�˻���ע��ɹ���");
		subMenu1();//���û�ϵͳ�˵�ȥ
		
		
	}
	//ע��ҵ�񲢷���ÿһ���û�����
	public User Register(){
		
		boolean resp = false;//����Ƿ�ɹ�
		int userNum = 0; 
		String userPwd2 = "";
		String userPwd = "";
		do{
			System.out.println("����������������");
			user.userName = in.next();
			System.out.println("�������������룺");
			user.userPwd = in.next();
			System.out.println("���ٴ������������룺");
			userPwd2 = in.next();
			System.out.println("�������δ����:");
			user.depositMoney = in.nextDouble();
			//�����ⷽ�����û��������������֤�������Ƿ�ɹ�
			resp = verify(user.userName,user.userPwd,userPwd2);
			
		}while(!resp);
		
		//��������û��˺�id
		user.id = 6220+randId(new Date());
		System.out.println("����˺�idΪ��"+user.id);
		num++;
		return user;
	}
	public String randId(Date date) {
		// TODO Auto-generated method stub
		//����ʱ��14λ
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return simpleDateFormat.format(date);
	}

	/*���û������Ⱥ���������ж�*/
	public boolean verify(String userName, String userPwd1, String userPwd2) {
		// TODO �Զ����ɵķ������
		boolean flag = false;//����Ƿ�ɹ�
		if(user.userName.length()<1||user.userPwd.length()<6){
			System.out.println("�û������Ȳ���С��1�����볤�Ȳ���С��6��");
		}else if(!user.userPwd.equals(userPwd2)){
			System.out.println("����������������һ��");
		}else{
			System.out.println("ע��ɹ������μ��û��������롣");
			flag = true;
		}
		return flag;
	}
	//��ÿһ���ɹ�ע�Ὺ�����û��浽users������ȥ
	public void UsersInfo(){
			users[num] = Register();
	}
	//��½
	public void subMenu1Login(){
//		UsersInfo();
		String name = "";
		String pwd = "";
		w:for(;;){
			System.out.println("�������û�����");
			name = in.next();
			System.out.println("���������룺");
			pwd = in.next();
			for(int i=0;i<num;i++){
				if(name.equals(users[i].userName)&&pwd.equals(users[i].userPwd)){
					System.out.println("��¼�ɹ���");
					break w;
				}	
			}
			
		}
		userBubusiness();	
	}
	//�û�ҵ�����
	private void userBubusiness() {
		// TODO �Զ����ɵķ������
		while(true){
			System.out.println("=======��ӭ�����û�ҵ�����======");
			System.out.println("1���鿴�û�");
			System.out.println("2�������Ŀ");
			System.out.println("3��ȡ����Ŀ");
			System.out.println("4����ʱת��");
			System.out.println("5����ֵ�ɷ�");
			System.out.println("6���鿴��¼");
			System.out.println("7���޸�����");
			System.out.println("8�����ز˵�");
			System.out.println("����������ѡ��");
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
			System.out.println("=====��ӭ�����ֵ�ɷ�====");
			System.out.println("1������ˮ�����");
			System.out.println("2������ҵ������");
			System.out.println("3�����ط����б�");
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
		// TODO �Զ����ɵķ������
		
	}

	public void toUpPayment1() {
		// TODO �Զ����ɵķ������
		
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

	//2�����г���
	public void subMenu2(){
//		user = new UserInfo();
		
//		users[40].id = "1000";//�ͷ�id��
		while(true){
			System.out.println("========2�����г���=========");
			System.out.println("1���鿴�����˻���Ϣ");
			System.out.println("2��ע���û�");
			System.out.println("3���鿴�û���¼");
			System.out.println("4���޸��û�����");
			System.out.println("5���ⶳ�û�");
			System.out.println("����������ѡ��");
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

	//3���޿����
	public void subMenu3(){
		System.out.println("========3���޿����=========");
	}
	//4�������˳�
	public void subMenu4(){
		System.out.println("�˳�");
	}
	
	
}
