package com.java.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtDemo {
	public static void main(String[] args) {
		Frame f = new Frame("hello，first窗体");
		f.setLocation(200, 200);
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());
		
		Button btn = new Button("我叫按钮");
		f.add(btn);
		
//		f.addWindowListener(new MyWin());
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO 自动生成的方法存根
				System.out.println("我关");
				System.exit(0);
			}
			
			//异常类似
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO 自动生成的方法存根
				System.out.println("我活了");
			}
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO 自动生成的方法存根
				System.out.println("我被打开了，hahahhaha");
			}
		});
		f.setVisible(true);
		System.out.println("hello world!");
	}
}

/*class MyWin implements WindowListener {
	//覆盖7个方法，可我只用到了关闭的动作。
	//其他动作都没有用到，可是却必须复写。
}
*/

//因为WindowListener子类WindowAdapter已经实现了上接口
//并覆盖了其中的所有方法，我只继承它。
class MyWin extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO 自动生成的方法存根
		System.out.println("Window Closing"+e.toString());
		System.exit(0);
	}
}