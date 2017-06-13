package com.lanqiao.date20170507.one_to_oneforone;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: �������ˣ�һ���ͻ��˺�һ����������һ��ͨ��
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
		try {
			// 1�������������׽��� ����һ��ServerSocket�࣬ͬʱ�����и����ļ������ָ���˿ڴ�����һ����������
			listener = new ServerSocket(1766);

			// 2���������׽��� ������һ���������Clientͨ�ŵ�Socket����Link-SocketServer����
			// ServerSocket ����accept֮�󣬾ͽ�����Ȩת���ˡ���Socket������˿ͻ������IP��ַ��˿ںš�
			System.out.println("����˵ȴ������С�����");
			s = listener.accept();

			// 3��Server����ֻҪ�����Socket�����д���ݣ��Ϳ���ʵ����Զ�˵�Client��д����
			// 3��һ���ͻ��˺�һ����������һ��ͨ��
			System.out.println("����˺Ϳͻ��˿�ʼһ�ν���");

			// 3-1�ӿͻ��˶�����
			is = s.getInputStream();
			byte[] isBuf = new byte[512];
			int index = is.read(isBuf);
			System.out.println("�յ��ͻ�����Ϣ��" + new String(isBuf, 0, index));

			// 3-2д���ݵ��ͻ���
			os = s.getOutputStream();
			byte[] osBuf = "�����յ�".getBytes();
			os.write(osBuf);

			// 4���Ͽ�����
			System.out.println("�������˶Ͽ�����!");
			is.close();
			os.close();
			s.close();
			listener.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}