package com.lanqiao.date20170423.many_to_one_syn_formany;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description: ��������
 * @author forward
 * @date 2017��4��23�� ����6:36:18
 * @version V2.0
 */
public class SocketServerTest {
	public static void main(String[] args) {
		ServerSocket socketServer = null;
		Socket socket = null;
		try {
			//1������socketServer��socket
			socketServer = new ServerSocket(1766);
			
			while(true){//��ѭ��ʵ��һ���������ȴ�����ͻ������ӡ�
			System.out.println("�������˵ȴ�����.....");
			socket = socketServer.accept();
			
			//��ʾ���ӣ�������ʼ
			String name = socketServer.getInetAddress().getHostName();
			int port = socketServer.getLocalPort();
			System.out.println("�����Ѿ��������ͻ��˵�ַ"+name+"�˿ڣ�"+port+"�Ѿ�����");
			new SocketServerThread(socket).start();;
			}
			//socket.close();
			//socketServer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
