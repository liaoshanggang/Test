package com.lanqiao.date20170423.many_to_one_syn_formany;

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
		try {
			//1、创建socketServer和socket
			socketServer = new ServerSocket(1766);
			
			while(true){//外循环实现一个服务器等待多个客户端连接。
			System.out.println("服务器端等待连接.....");
			socket = socketServer.accept();
			
			//显示连接，交互开始
			String name = socketServer.getInetAddress().getHostName();
			int port = socketServer.getLocalPort();
			System.out.println("服务已经启动，客户端地址"+name+"端口："+port+"已经连接");
			new SocketServerThread(socket).start();;
			}
			//socket.close();
			//socketServer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
