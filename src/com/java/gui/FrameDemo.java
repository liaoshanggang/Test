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
		// TODO 自动生成的构造函数存根
		init();
	}
	
	public void init() {
		//对fram进行基本设置
		f = new Frame("My frame!");
		f.setBounds(500, 500, 500, 500);
		f.setLayout(new FlowLayout());
		
		b = new Button("my button");
		//将组件添加到frame中
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
		
		//让按钮具备推出程序的功能
		/*
		 * 按钮就是事件源。
		 * 那么选择哪个监听器呢？
		 * 通过关闭窗体示例了解到，想要知道哪个组件具备什么样的特有监听器
		 * 需要查看该组件对象的功能
		 * 通过查阅button的描述，发现按钮支持一个特有监听addActionListener.
		 * */
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				System.out.println("退出，按钮干的");
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new FrameDemo();
	}
}
