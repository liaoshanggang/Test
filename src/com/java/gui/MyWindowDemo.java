package com.java.gui;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class MyWindowDemo {
	private Frame f;
	private TextField tf;
	private Button but;
	private TextArea ta;
	private Dialog d;
	private Label l;
	private Button okBut;
	public MyWindowDemo() {
		// TODO �Զ����ɵĹ��캯�����
		init();
	}
	
	public void init() {
		f = new Frame("ת��");
		f.setBounds(200, 200, 500, 500);
		f.setLayout(new FlowLayout());
		
		tf = new TextField(33);
		
		but = new Button("ת��");
		
		ta = new TextArea(25 ,40);
		
		d = new Dialog(f,"��ʾ��Ϣ",true);
		d.setBounds(300,300,200,100);
		d.setLayout(new FlowLayout());
		
		l = new Label();
		okBut = new Button("ȷ��");
		
		d.add(l);
		d.add(okBut);
		
		f.add(tf);
		f.add(but);
		f.add(ta);
		
		myEvent();
		
		f.setVisible(true);
	}
	
	private void myEvent() {
		
		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				showDir();
				/*String text = tf.getText();
				
				ta.setText(text);
				
				tf.setText("");
				System.out.println(text);*/
			}
		});
		
		d.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO �Զ����ɵķ������
				d.setVisible(false);
			}
		});
		
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO �Զ����ɵķ������
				if (e.getKeyCode()==KeyEvent.VK_ENTER) {
					showDir();
				}
			}
		});
		okBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				d.setVisible(false);
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
	
	private void showDir() {
		String dirPath = tf.getText();
		File f = new File(dirPath);
		
		if (f.exists() && f.isDirectory()) {
			ta.setText("");
			String[] names = f.list();
			for (String name : names) {
				ta.append(name+"\r\n");
			}
		} else {
			String info = "���������Ϣ��"+dirPath+"�Ǵ���ģ�������!";
			l.setText(info);
			d.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MyWindowDemo();
	}
}
