package com.forward.date20170507.one_to_oneforone;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Description: �ͻ����࣬ һ���ͻ��˺�һ����������һ��ͨ��
 * @author forward
 * @date 2017��5��7�� ����11:17:14
 * @version V2.0
 */
public class Client {
	public static void main(String[] args) {
		OutputStream os = null;
		InputStream is = null;
		Socket s = null;

		try {
			System.out.println("�ͻ���");
			// 1������Socket�׽��� //���׽���
			s = new Socket("127.0.0.1", 1766);

			// 2��һ���ͻ��˺�һ����������һ��ͨ��
			System.out.println("�ͻ��˺ͷ���˿�ʼһ�ν���");

			// 2-1д���ݵ������
			os = s.getOutputStream();
			byte[] osBuf = "����������ã�".getBytes();
			os.write(osBuf);

			// 2-2�ӷ���˶�����
			is = s.getInputStream();
			byte[] isBuf = new byte[512];
			int index = is.read(isBuf);
			System.out.println("�յ���������Ϣ��" + new String(isBuf, 0, index));

			// 3���ر�����
			System.out.println("�ͻ��˶Ͽ����ӣ�");
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
