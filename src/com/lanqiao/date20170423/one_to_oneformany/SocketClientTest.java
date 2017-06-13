package com.lanqiao.date20170423.one_to_oneformany;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @Description: �ͻ����࣬ һ���ͻ��˺�һ���������˶��ͨ��
 * @author forward
 * @date 2017��4��23�� ����6:36:02
 * @version V2.0
 */
public class SocketClientTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Socket socket = null;
		OutputStream os = null;
		InputStream is = null;
		
		try {
			//1�������׽���
			socket = new Socket("127.0.0.1",1766);
			
			//�����
			os = socket.getOutputStream();
			
			int count = 0;
			//������ʼ
			while(true){
				System.out.println("һ���ͻ��˺�һ���������ˣ���ʼ��"+(++count)+"��ͨ��(����q�˳�)��");
				System.out.println("�ͻ��˶Է�����˵��");
				String wordtoServer = input.next();
				
				os.write(wordtoServer.getBytes());
				
				//������
				is = socket.getInputStream();
				byte[] buffer = new byte[1024];
				int index = is.read(buffer);
				String msg = new String(buffer,0,index);
				System.out.println("�ͻ��˽��յ��������˷�������Ϣ��\n"+msg);
				
				if(wordtoServer.equals("q")){
					break;
				}
			}
			
			//�ر�
			System.out.println("�ͻ��˶Ͽ�����!");
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
