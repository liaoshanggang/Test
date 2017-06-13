package com.forward.date20170507.one_to_oneforone;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Description: 客户端类， 一个客户端和一个服务器端一次通信
 * @author forward
 * @date 2017年5月7日 下午11:17:14
 * @version V2.0
 */
public class Client {
	public static void main(String[] args) {
		OutputStream os = null;
		InputStream is = null;
		Socket s = null;

		try {
			System.out.println("客户端");
			// 1、创建Socket套接字 //流套接字
			s = new Socket("127.0.0.1", 1766);

			// 2、一个客户端和一个服务器的一次通信
			System.out.println("客户端和服务端开始一次交互");

			// 2-1写数据到服务端
			os = s.getOutputStream();
			byte[] osBuf = "服务器，你好！".getBytes();
			os.write(osBuf);

			// 2-2从服务端读数据
			is = s.getInputStream();
			byte[] isBuf = new byte[512];
			int index = is.read(isBuf);
			System.out.println("收到服务器消息：" + new String(isBuf, 0, index));

			// 3、关闭连接
			System.out.println("客户端断开连接！");
			os.close();
			is.close();
			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
