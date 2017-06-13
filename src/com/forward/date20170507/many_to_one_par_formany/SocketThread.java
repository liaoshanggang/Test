package com.forward.date20170507.many_to_one_par_formany;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketThread extends Thread {
	Socket s;

	public SocketThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		String str = null;
		int count = 0;
		InputStream is = null;
		OutputStream os = null;
		try {
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
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4、断开连接
			System.out.println("服务器端断开连接!");
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
