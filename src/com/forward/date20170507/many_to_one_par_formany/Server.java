package com.forward.date20170507.many_to_one_par_formany;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: 服务端，一个客户端和一个服务器的多次通信
 * @author forward
 * @date 2017年5月8日 上午11:40:47
 * @version V2.0
 */

public class Server {
	public static void main(String[] args) {
		ServerSocket listener = null;
		Socket s = null;
		int count = 0;
		try {
			// 1、创建服务器套接字 创建一个ServerSocket类，同时在运行该语句的计算机的指定端口处建立一个监听服务
			listener = new ServerSocket(1766);

			while (true) {

				// 2、创建新套接字 并返回一个用于与该Client通信的Socket对象Link-SocketServer程序
				// ServerSocket 进行accept之后，就将主动权转让了。该Socket对象绑定了客户程序的IP地址或端口号。
				System.out.println("服务端等待连接中。。。");
				s = listener.accept();
				System.out.println("不同的客户端socket:" + s);
				System.out.println("服务器连接到第" + (++count) + "个客户端");
				;
				String address = listener.getInetAddress().getHostAddress();
				int port = listener.getLocalPort();
				System.out.println("客户端信息：" + "ip:" + address + "port:" + port);

				new SocketThread(s).start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				listener.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}