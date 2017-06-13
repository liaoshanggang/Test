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
		// TODO �Զ����ɵĹ��캯�����
		init();
	}
	
	public void init() {
		//��fram���л�������
		f = new Frame("My frame!");
		f.setBounds(500, 500, 500, 500);
		f.setLayout(new FlowLayout());
		
		tf = new TextField(20);
		
		b = new Button("my button");
		//�������ӵ�frame��
		f.add(tf);
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
		
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO �Զ����ɵķ������
				int code = e.getKeyCode();
				if (!(code>=KeyEvent.VK_0 && code<=KeyEvent.VK_9)) {
					System.out.println(code+".....�ǷǷ���");
					e.consume();
				}
			}
		});
		
		b.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO �Զ����ɵķ������
				if (e.isControlDown()&&e.getKeyCode()==KeyEvent.VK_ENTER) {
//					System.exit(0);
					System.out.println("ctrl+enter is run");
				}
				System.out.println(KeyEvent.getKeyText(e.getKeyCode())+"������"+e.getKeyChar()+"....."+e.getKeyCode());
			}
			
		});
				
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				System.out.println("action ok");
			}
		});
		
		b.addMouseListener(new MouseAdapter() {
			private int count = 1;
			private int clickCount = 1;
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO �Զ����ɵķ������
				System.out.println("�����뵽�����"+count++);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO �Զ����ɵķ������
				if (e.getClickCount()==2) {
					System.out.println("˫������"+clickCount++);
				}
//				System.out.println("�������"+clickCount++);
			}
		});
	}
	public static void main(String[] args) {
		new MouseAndKeyEvent();
	}
}
