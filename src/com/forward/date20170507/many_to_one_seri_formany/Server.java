package com.forward.date20170507.many_to_one_seri_formany;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: 服务端，多个客户端和一个服务器的串行多次通信
 * @author forward
 * @date 2017年5月8日 上午11:40:47
 * @version V2.0
 */

public class Server {
	public static void main(String[] args) {
		ServerSocket listener = null;
		Socket s = null;
		InputStream is = null;
		OutputStream os = null;
		String str = null;
		int count = 0;

		try {
			// 1、创建服务器套接字 创建一个ServerSocket类，同时在运行该语句的计算机的指定端口处建立一个监听服务
			listener = new ServerSocket(1766);

			while (true) {

				// 2、创建新套接字 并返回一个用于与该Client通信的Socket对象Link-SocketServer程序
				// ServerSocket 进行accept之后，就将主动权转让了。该Socket对象绑定了客户程序的IP地址或端口号。
				System.out.println("服务端等待连接中。。。");
				s = listener.accept();

				while (!"q".equals(str)) {
					// 3、Server程序只要向这个Socket对象读写数据，就可以实现向远端的Client读写数据
					// 3、一个客户端和一个服务器的多次交互
					System.out.println("一个客户端和一个服务器的第" + (++count) + "次交互");

					// 3-1从客户端读数据
					is = s.getInputStream();
					byte[] isBuf = new byte[512];
					int index = is.read(isBuf);
					str = new String(isBuf, 0, index);
					System.out.println("服务器接收：" + str);

					// 3-2写数据到客户端
					os = s.getOutputStream();
					byte[] osBuf = "我已收到".getBytes();
					System.out.println("服务器发送："
							+ new String(osBuf, 0, osBuf.length));
					os.write(osBuf);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4、断开连接
			System.out.println("服务器端断开连接!");
			try {
				if (is != null || os != null || s != null || listener != null) {
					is.close();
					os.close();
					s.close();
					listener.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}