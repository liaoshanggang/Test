package com.lanqiao.date20170423.one_to_oneforone;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @Description: 客户端类， 一个客户端和一个服务器端一次通信
 * @author forward
 * @date 2017年4月23日 下午6:36:02
 * @version V2.0
 */
public class SocketClientTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Socket socket = null;
		OutputStream os = null;
		InputStream is = null;
		
		try {
			//1、创建套接字
			socket = new Socket("127.0.0.1",1766);
			
			//交互开始
			System.out.println("客户端对服务器说：");
			String wordtoServer = input.next();
			
			//输出流
			os = socket.getOutputStream();
			os.write(wordtoServer.getBytes());
		
			//输入流
			is = socket.getInputStream();
			byte[] buffer = new byte[1024];
			int index = is.read(buffer);
			String msg = new String(buffer,0,index);
			System.out.println("客户端接收到服务器端发来的消息：\n"+msg);
			
			
			//关闭
			System.out.println("客户端断开连接!");
			os.close();
			is.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
