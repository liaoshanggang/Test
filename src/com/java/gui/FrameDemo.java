package com.java.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
	private Frame f;
	private Button b;
	
	public FrameDemo() {
		// TODO �Զ����ɵĹ��캯�����
		init();
	}
	
	public void init() {
		//��fram���л�������
		f = new Frame("My frame!");
		f.setBounds(500, 500, 500, 500);
		f.setLayout(new FlowLayout());
		
		b = new Button("my button");
		//�������ӵ�frame��
		f.add(b);
		
		//����һ�´����¼�
		myEvent();
		
		//��ʾ����
		f.setVisible(true);
	}
	
	private void myEvent() {
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				System.exit(0);
			}
		});
		
		//�ð�ť�߱��Ƴ�����Ĺ���
		/*
		 * ��ť�����¼�Դ��
		 * ��ôѡ���ĸ��������أ�
		 * ͨ���رմ���ʾ���˽⵽����Ҫ֪���ĸ�����߱�ʲô�������м�����
		 * ��Ҫ�鿴���������Ĺ���
		 * ͨ������button�����������ְ�ť֧��һ�����м���addActionListener.
		 * */
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				System.out.println("�˳�����ť�ɵ�");
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new FrameDemo();
	}
}
