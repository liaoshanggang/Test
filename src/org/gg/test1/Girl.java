package org.gg.test1;
/*������ת�͹����У���Ϊ���������

���һ������������õĶ���������õ���ָ������������ô������ת�͵Ĺ������ǰ�ȫ�ġ�Ҳ���Ǳ����ǲ��������ġ�

�����������������õĶ����Ǹ��౾����ô������ת�͵Ĺ������ǲ���ȫ�ģ����벻�������������ʱ�����java.lang.ClassCastException����������ʹ��instanceof���������������ʵ�����£�
*/
public class Girl {

         public void smile(){

                   System.out.println("girl smile()...");

         }

}

class MMGirl extends Girl{

                   @Override

         public void smile() {

                                     System.out.println("MMirl smile sounds sweet...");

         }

         public void c(){

                   System.out.println("MMirl c()...");

         }

}

class main{

                   public static void main(String[] args) {

                   Girl g1=new MMGirl(); //����ת��

                   g1.smile();

                   MMGirl mmg=(MMGirl)g1;    //����ת��,��������нԲ������

                   mmg.smile();

                   mmg.c();

                   Girl g2=new Girl();

           //MMGirl mmg1=(MMGirl)g2; //����ȫ������ת��,�����޴������л����

           //mmg1.smile();

           //mmg1.c();

                   if(g2 instanceof MMGirl){

                            MMGirl mmg1=(MMGirl)g2;

                            mmg1.smile();

                            mmg1.c();

                   }

         }
}

/*�ܽ᣺

1���������ÿ���ָ����������������ò���ָ�������

2�����������ֱ�Ӹ����������ý�upcasting����ת�ͣ�����ת�Ͳ���ǿ��ת�͡�

���� ��Father father = new Son();

3����ָ���������ĸ������ø����������ý�����ת�ͣ�downcasting����Ҫǿ��ת�͡�

���� ��father����һ��ָ���������ĸ������ã���father������������son ��Son son =��Son��father��

���� ����fatherǰ��ģ�Son��������ӣ�����ǿ��ת����

4��upcasting �ᶪʧ�������еķ���,��������overriding ����ķ��������෽����Ч

5������ת�͵����ã������ظ����룬����Ϊ����������ʱ��������Ϊ��������������������ת�͡�����ʹ�����ü�ࡣ������JAVA�ĳ�����˼�롣
*/
