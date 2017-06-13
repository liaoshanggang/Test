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
			//输入流
			is = socket.getInputStream();
			
			while(true){
				byte[] buffer = new byte[1024];
				int index = is.read(buffer);
				String msg = new String(buffer,0,index);
				System.out.println("服务器端收到客户端发来的消息：\n"+msg);
				
				//输出流
				os = socket.getOutputStream();
				String send = "服务器端对客户端说："+msg;
				os.write(send.getBytes());
				if(msg.equals("q")){
					break;
				}
			}
			
			
			
			//关闭
			System.out.println("服务器端断开连接!");
			os.close();
			is.close();
			//socket.close();
			//socketServer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
