package com.forward.date20170507.one_to_oneforone;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextArea;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.border.TitledBorder;

public class ClientGUI extends JFrame{
	JScrollPane jScrollPane;
	JSplitPane jSplitPane;
	TextArea textArea;
	/**
	 * 
	 */
	private static final long serialVersionUID = -3347218841253657742L;

	public ClientGUI() {
		init();
		setMainPanel();
	}

	private void setMainPanel() {
		//设置主面板
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(getClientIP());
		this.setSize(500, 500);
		//this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.pack();
	}

	private void init() {
		
		setTopComp();
		setBottomComp();
		//设置滑动面板
		textArea = new TextArea();
		textArea.setPreferredSize(new Dimension(500, 500));
		
		jScrollPane = new JScrollPane(textArea);
		jScrollPane.setBorder(new TitledBorder("客户端信息"));
		jScrollPane.setBackground(Color.GRAY);
		
		JPanel j = new JPanel();
		j.setSize(100,100);
		jSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,jScrollPane,j);
		jSplitPane.setDividerLocation(300);
		this.add(jSplitPane,BorderLayout.CENTER);
	}
	
	private void setBottomComp() {
		// TODO 自动生成的方法存根
		
	}

	private void setTopComp() {
	}

	public String getClientIP(){
		InetAddress ia = null;
		String address = null;
		String name = null;
		try {
			ia = InetAddress.getLocalHost();
			address = ia.getHostAddress();
			name = ia.getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return "主机名："+name +" Ip地址："+ address;
	}
	
	public static void main(String[] args) {
		new ClientGUI();
	}
}
