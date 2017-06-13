package com.java.gui;

import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MyMenuTest {

	private Frame f;
	private MenuBar menuBar;
	private Menu menu,menu1;
	private MenuItem closeItem,mi,openItem,saveItem;
	private FileDialog openDia,saveDia;
	private TextArea ta;
	private File file;
	public MyMenuTest() {
		// TODO �Զ����ɵĹ��캯�����
		init();
	}
	
	public void init() {
		f = new Frame("Hello ,my first menu!");
		f.setBounds(100, 100, 500, 500);
		
		menuBar = new MenuBar();
		
		ta = new TextArea();
		
		menu = new Menu("�ļ�(F)");
		menu1 = new Menu("�½�");
		
		openItem = new MenuItem("��");
		saveItem = new MenuItem("����");
		closeItem = new MenuItem("�˳�(X)");
		mi = new MenuItem("Java��Ŀ");
		
		menu.add(menu1);
		menu.add(openItem);
		menu.add(saveItem);
		menu.add(closeItem);
		menu1.add(mi);
		menuBar.add(menu);
		f.setMenuBar(menuBar);
		f.add(ta);
		openDia = new FileDialog(f, "��Ҫ��",FileDialog.LOAD);
		saveDia = new FileDialog(f, "��Ҫ�ر�", FileDialog.SAVE);
		
		MyEvent();
		f.setVisible(true);
	}
	
	private void MyEvent() {
		
		openItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				openDia.setVisible(true);
				String dirPath = openDia.getDirectory();
				String fileName = openDia.getFile();
		  		System.out.println(dirPath+"...."+fileName);
		  		if (dirPath==null || fileName == null) {
		  			return ;
		  		}
		  		ta.setText("");
		  		File file = new File(dirPath,fileName);
		  		
		  		try {
					BufferedReader bfr = new BufferedReader(new FileReader(file));
					
					String line = null;
					
					while ((line = bfr.readLine())!=null) {
						ta.append(line+"\r\n");
					}
					
					bfr.close();
		  		} catch (Exception e2) {
					// TODO: handle exception
		  			throw new RuntimeException();
				}
			}
		});
		
		saveItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				if (file==null) {
					saveDia.setVisible(true);
					String dirPath = saveDia.getDirectory();
					String fileName = saveDia.getFile();
			  		System.out.println(dirPath+"...."+fileName);
			  		if (dirPath==null || fileName == null) {
			  			return ;
			  		}
			  		file = new File(dirPath,fileName);
				}
				try {
					BufferedWriter bfw = new BufferedWriter(new FileWriter(file));
					String text = ta.getText();
					bfw.write(text);
					//bfw.flush();
					bfw.close();
				} catch (Exception e2) {
					// TODO: handle exception
					throw new RuntimeException();
				}
				
			}
		});
		closeItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				saveDia.setVisible(true);
			}
		});
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
		new MyMenuTest();
	}

}
