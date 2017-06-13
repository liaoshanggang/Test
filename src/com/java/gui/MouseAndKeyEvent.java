package com.java.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseAndKeyEvent {
	private Frame f;
	private Button b;
	private TextField tf;
	
	public MouseAndKeyEvent() {
		// TODO 自动生成的构造函数存根
		init();
	}
	
	public void init() {
		//对fram进行基本设置
		f = new Frame("My frame!");
		f.setBounds(500, 500, 500, 500);
		f.setLayout(new FlowLayout());
		
		tf = new TextField(20);
		
		b = new Button("my button");
		//将组件添加到frame中
		f.add(tf);
		f.add(b);
		
		//加载一下窗体事件
		myEvent();
		
		//显示窗体
		f.setVisible(true);
	}
	
	private void myEvent() {
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO 自动生成的方法存根
				System.exit(0);
			}
		});
		
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO 自动生成的方法存根
				int code = e.getKeyCode();
				if (!(code>=KeyEvent.VK_0 && code<=KeyEvent.VK_9)) {
					System.out.println(code+".....是非法的");
					e.consume();
				}
			}
		});
		
		b.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO 自动生成的方法存根
				if (e.isControlDown()&&e.getKeyCode()==KeyEvent.VK_ENTER) {
//					System.exit(0);
					System.out.println("ctrl+enter is run");
				}
				System.out.println(KeyEvent.getKeyText(e.getKeyCode())+"。。。"+e.getKeyChar()+"....."+e.getKeyCode());
			}
			
		});
				
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				System.out.println("action ok");
			}
		});
		
		b.addMouseListener(new MouseAdapter() {
			private int count = 1;
			private int clickCount = 1;
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根
				System.out.println("鼠标进入到该组件"+count++);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO 自动生成的方法存根
				if (e.getClickCount()==2) {
					System.out.println("双击动作"+clickCount++);
				}
//				System.out.println("点击动作"+clickCount++);
			}
		});
	}
	public static void main(String[] args) {
		new MouseAndKeyEvent();
	}
}
