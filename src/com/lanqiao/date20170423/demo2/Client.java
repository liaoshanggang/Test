package com.lanqiao.date20170423.demo2;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1",9999);
			System.out.println("客户端已经开启");
			
			InputStream is = socket.getInputStream();
			byte[] b = new byte[512];
			int c = 0;
			while((c=is.read(b, 0, b.length))!=-1){
				System.out.println(new String(b,0,b.length));
			}
			
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
