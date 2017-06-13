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
		// TODO 自动生成的构造函数存根
		init();
	}
	
	public void init() {
		f = new Frame("转到");
		f.setBounds(200, 200, 500, 500);
		f.setLayout(new FlowLayout());
		
		tf = new TextField(33);
		
		but = new Button("转到");
		
		ta = new TextArea(25 ,40);
		
		d = new Dialog(f,"提示信息",true);
		d.setBounds(300,300,200,100);
		d.setLayout(new FlowLayout());
		
		l = new Label();
		okBut = new Button("确定");
		
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
				// TODO 自动生成的方法存根
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
				// TODO 自动生成的方法存根
				d.setVisible(false);
			}
		});
		
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO 自动生成的方法存根
				if (e.getKeyCode()==KeyEvent.VK_ENTER) {
					showDir();
				}
			}
		});
		okBut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				d.setVisible(false);
			}
		});
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO 自动生成的方法存根
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
			String info = "您输入的信息："+dirPath+"是错误的，请重输!";
			l.setText(info);
			d.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MyWindowDemo();
	}
}
