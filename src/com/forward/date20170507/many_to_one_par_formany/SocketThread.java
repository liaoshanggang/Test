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
				// 3��Server����ֻҪ�����Socket�����д���ݣ��Ϳ���ʵ����Զ�˵�Client��д����
				// 3��һ���ͻ��˺�һ���������Ķ�ν���
				System.out.println("һ���ͻ��˺�һ���������ĵ�" + (++count) + "�ν���");

				// 3-1�ӿͻ��˶�����
				is = s.getInputStream();
				byte[] isBuf = new byte[512];
				int index = is.read(isBuf);
				str = new String(isBuf, 0, index);
				System.out.println("���������գ�" + str);

				// 3-2д���ݵ��ͻ���
				os = s.getOutputStream();
				byte[] osBuf = "�����յ�".getBytes();
				System.out.println("���������ͣ�"
						+ new String(osBuf, 0, osBuf.length));
				os.write(osBuf);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4���Ͽ�����
			System.out.println("�������˶Ͽ�����!");
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
