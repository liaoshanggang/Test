package com.lanqiao.date20170423.many_to_one_seri_formany;

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
		OutputStream os = null;
		InputStream is = null;
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
			
			
			//������
			is = socket.getInputStream();
			
			while(true){
				byte[] buffer = new byte[1024];
				int index = is.read(buffer);
				String msg = new String(buffer,0,index);
				System.out.println("���������յ��ͻ��˷�������Ϣ��\n"+msg);
				
				//�����
				os = socket.getOutputStream();
				String send = "�������˶Կͻ���˵��"+msg;
				os.write(send.getBytes());
				if(msg.equals("q")){
					break;
				}
			}
			
			
			
			//�ر�
			System.out.println("�������˶Ͽ�����!");
			os.close();
			is.close();
			}
			//socket.close();
			//socketServer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
