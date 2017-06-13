package com.forward.date20170507.many_to_one_seri_formany;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: ����ˣ�����ͻ��˺�һ���������Ĵ��ж��ͨ��
 * @author forward
 * @date 2017��5��8�� ����11:40:47
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
			// 1�������������׽��� ����һ��ServerSocket�࣬ͬʱ�����и����ļ������ָ���˿ڴ�����һ����������
			listener = new ServerSocket(1766);

			while (true) {

				// 2���������׽��� ������һ���������Clientͨ�ŵ�Socket����Link-SocketServer����
				// ServerSocket ����accept֮�󣬾ͽ�����Ȩת���ˡ���Socket������˿ͻ������IP��ַ��˿ںš�
				System.out.println("����˵ȴ������С�����");
				s = listener.accept();

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
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4���Ͽ�����
			System.out.println("�������˶Ͽ�����!");
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