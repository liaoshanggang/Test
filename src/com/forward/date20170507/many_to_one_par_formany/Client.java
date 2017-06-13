package com.forward.date20170507.many_to_one_par_formany;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @Description: 客户端类，一个客户端和一个服务器的并行多次通信
 * @author forward
 * @date 2017年5月7日 下午11:17:14
 * @version V2.0
 */
public class Client {
	public static void main(String[] args) {
		OutputStream os = null;
		InputStream is = null;
		Socket s = null;
		Scanner input = new Scanner(System.in);
		String str = null;
		int count = 0;
		try {
			System.out.println("客户端");
			// 1、创建Socket套接字 //流套接字
			s = new Socket("127.0.0.1", 1766);

			while (!"q".equals(str)) {
				// 2、一个客户端和一个服务器的多次交互
				System.out.println("一个客户端和一个服务器的第" + (++count) + "次交互");
				System.out.println("客户端发送：（q结束交互）");
				str = input.next();
				// 2-1写数据到服务端
				os = s.getOutputStream();
				byte[] osBuf = str.getBytes();
				os.write(osBuf);

				// 2-2从服务端读数据
				is = s.getInputStream();
				byte[] isBuf = new byte[512];
				int index = is.read(isBuf);
				System.out.println("客户端接收：" + new String(isBuf, 0, index));
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			// 3、关闭连接
			System.out.println("客户端断开连接！");
			try {
				if (is != null || os != null || s != null) {
					is.close();
					os.close();
					s.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
