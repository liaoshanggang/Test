package com.lanqiao.date20170423.demo2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerSocketTest {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		OutputStream os = null;
		try {
			ss = new ServerSocket(9999);
			while(true){				
				System.out.println("�������˵ȴ�������........");
				s = ss.accept();
				System.out.println("�������Ѿ��������пͻ�������");
				os = s.getOutputStream();
				os.write("hello".getBytes());
				
				os.close();
				s.close();
			}
			//ss.close();
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
