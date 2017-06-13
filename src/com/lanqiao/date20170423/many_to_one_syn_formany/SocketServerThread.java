package com.lanqiao.date20170423.many_to_one_syn_formany;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerThread extends Thread {
	Socket socket = null;
	
	public SocketServerThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		ServerSocket socketServer = null;
		OutputStream os = null;
		InputStream is = null;
		try {
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
			//socket.close();
			//socketServer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
