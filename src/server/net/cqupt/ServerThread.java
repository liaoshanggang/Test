package server.net.cqupt;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import util.cqupt.Parser;

import control.cqupt.Controller;

public class ServerThread extends Thread {
	private Socket socket;
	private String name;
	private InputStream in;
	private OutputStream out;
	private Server server;

	private static final int SIZE = 1024;

	public ServerThread(String name, Socket socket, Server server) {
		this.name = name;
		this.server = server;
		this.socket = socket;
		try {
			in = socket.getInputStream();
			out = socket.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		try {
			while (!this.isInterrupted()) {

				byte[] buffer = new byte[SIZE];
				int index = in.read(buffer);
				String message = new String(buffer, 0, index, "GBK");
				Parser parser = new Parser();
				String operate = parser.getOperate(message);
				Controller controller = server.getController();
				if (operate.equals("exit")) {
					server.deleteThread(name);
					controller.deleteClientView(name);
					break;
				}
				String response = controller.doResponse(message);
				send(response);
			}

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			close();
		}
	}

	public void send(String mes) {
		try {
			out.write(mes.getBytes("GBK"));
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void close() {
		try {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
			if (socket != null)
				socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
