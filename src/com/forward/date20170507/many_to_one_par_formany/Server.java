package com.forward.date20170507.many_to_one_par_formany;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: ����ˣ�һ���ͻ��˺�һ���������Ķ��ͨ��
 * @author forward
 * @date 2017��5��8�� ����11:40:47
 * @version V2.0
 */

public class Server {
	public static void main(String[] args) {
		ServerSocket listener = null;
		Socket s = null;
		int count = 0;
		try {
			// 1�������������׽��� ����һ��ServerSocket�࣬ͬʱ�����и����ļ������ָ���˿ڴ�����һ����������
			listener = new ServerSocket(1766);

			while (true) {

				// 2���������׽��� ������һ���������Clientͨ�ŵ�Socket����Link-SocketServer����
				// ServerSocket ����accept֮�󣬾ͽ�����Ȩת���ˡ���Socket������˿ͻ������IP��ַ��˿ںš�
				System.out.println("����˵ȴ������С�����");
				s = listener.accept();
				System.out.println("��ͬ�Ŀͻ���socket:" + s);
				System.out.println("���������ӵ���" + (++count) + "���ͻ���");
				;
				String address = listener.getInetAddress().getHostAddress();
				int port = listener.getLocalPort();
				System.out.println("�ͻ�����Ϣ��" + "ip:" + address + "port:" + port);

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