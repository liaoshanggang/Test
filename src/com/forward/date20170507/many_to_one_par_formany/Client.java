package com.forward.date20170507.many_to_one_par_formany;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @Description: �ͻ����࣬һ���ͻ��˺�һ���������Ĳ��ж��ͨ��
 * @author forward
 * @date 2017��5��7�� ����11:17:14
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
			System.out.println("�ͻ���");
			// 1������Socket�׽��� //���׽���
			s = new Socket("127.0.0.1", 1766);

			while (!"q".equals(str)) {
				// 2��һ���ͻ��˺�һ���������Ķ�ν���
				System.out.println("һ���ͻ��˺�һ���������ĵ�" + (++count) + "�ν���");
				System.out.println("�ͻ��˷��ͣ���q����������");
				str = input.next();
				// 2-1д���ݵ������
				os = s.getOutputStream();
				byte[] osBuf = str.getBytes();
				os.write(osBuf);

				// 2-2�ӷ���˶�����
				is = s.getInputStream();
				byte[] isBuf = new byte[512];
				int index = is.read(isBuf);
				System.out.println("�ͻ��˽��գ�" + new String(isBuf, 0, index));
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			// 3���ر�����
			System.out.println("�ͻ��˶Ͽ����ӣ�");
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
