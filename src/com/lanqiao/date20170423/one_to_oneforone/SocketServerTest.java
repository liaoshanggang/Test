package com.lanqiao.date20170423.one_to_oneforone;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: 服务器端
 * @author forward
 * @date 2017年4月23日 下午6:36:18
 * @version V2.0
 */
public class SocketServerTest {
	public static void main(String[] args) {
		ServerSocket socketServer = null;
		Socket socket = null;
		OutputStream os = null;
		InputStream is = null;
		try {
			//1、创建socketServer和socket
			socketServer = new ServerSocket(1766);
			System.out.println("服务器端等待连接.....");
			socket = socketServer.accept();
			
			//显示连接，交互开始
			String name = socketServer.getInetAddress().getHostName();
			int port = socketServer.getLocalPort();
			System.out.println("服务已经启动，客户端地址"+name+"端口："+port+"已经连接");
			
			
			//输入流
			is = socket.getInputStream();
			byte[] buffer = new byte[1024];
			int index = is.read(buffer);
			String msg = new String(buffer,0,index);
			System.out.println("服务器端收到客户端发来的消息：\n"+msg);
			
			//输出流
			os = socket.getOutputStream();
			String send = "服务器端对客户端说："+msg;
			os.write(send.getBytes());
			
			
			
			//关闭
			System.out.println("服务器端断开连接!");
			os.close();
			is.close();
			socket.close();
			socketServer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
