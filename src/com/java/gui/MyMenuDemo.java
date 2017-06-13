package com.java.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyMenuDemo {
	private Frame f;
	private MenuBar menuBar;
	private Menu menu,menu1;
	private MenuItem closeItem,mi;
	
	public MyMenuDemo() {
		// TODO �Զ����ɵĹ��캯�����
		init();
	}
	
	public void init() {
		f = new Frame("Hello ,my first menu!");
		f.setBounds(500, 500, 300, 300);
		f.setLayout(new FlowLayout());
		
		menuBar = new MenuBar();
		
		menu = new Menu("�ļ�(F)");
		menu1 = new Menu("�½�");
		
		closeItem = new MenuItem("�˳�(X)");
		mi = new MenuItem("Java��Ŀ");
		
		menu.add(menu1);
		menu.add(closeItem);
		menu1.add(mi);
		menuBar.add(menu);
		f.setMenuBar(menuBar);
		
		MyEvent();
		f.setVisible(true);
	}
	
	private void MyEvent() {
		closeItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				System.exit(0);
			}
		});
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new MyMenuDemo();
	}
}
