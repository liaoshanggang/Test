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
				System.out.println("服务器端等待连接中........");
				s = ss.accept();
				System.out.println("服务器已经开启，有客户端连接");
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
