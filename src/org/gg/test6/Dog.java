package org.gg.test6;
//http://www.xitongzhijia.net/xtjc/20151118/61881.html
public class Dog extends Pet{
	private String strain;
	public Dog(){
		
	}
	public Dog(String name,int health,int love,String strain){
		super(name,health,love);
		this.strain = strain;
	}
	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("���ҽ���:������"+this.name+"����ֵ��"+this.health+"���ܶȣ�"+this.love+"Ʒ�֣�"+this.strain);
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	
}
 