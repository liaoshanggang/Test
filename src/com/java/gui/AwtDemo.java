package com.java.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtDemo {
	public static void main(String[] args) {
		Frame f = new Frame("hello��first����");
		f.setLocation(200, 200);
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());
		
		Button btn = new Button("�ҽа�ť");
		f.add(btn);
		
//		f.addWindowListener(new MyWin());
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				System.out.println("�ҹ�");
				System.exit(0);
			}
			
			//�쳣����
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO �Զ����ɵķ������
				System.out.println("�һ���");
			}
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO �Զ����ɵķ������
				System.out.println("�ұ����ˣ�hahahhaha");
			}
		});
		f.setVisible(true);
		System.out.println("hello world!");
	}
}

/*class MyWin implements WindowListener {
	//����7������������ֻ�õ��˹رյĶ�����
	//����������û���õ�������ȴ���븴д��
}
*/

//��ΪWindowListener����WindowAdapter�Ѿ�ʵ�����Ͻӿ�
//�����������е����з�������ֻ�̳�����
class MyWin extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO �Զ����ɵķ������
		System.out.println("Window Closing"+e.toString());
		System.exit(0);
	}
}