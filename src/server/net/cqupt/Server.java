package server.net.cqupt;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

import ui.cqupt.MainClass;

import control.cqupt.Controller;

public class Server extends Thread {
	private ServerSocket serverscoket;
	private HashMap<String, ServerThread> threadPool = new HashMap<String, ServerThread>();
	private Controller controller;

	public Server(MainClass mainClass) {
		controller = new Controller(mainClass);
	}

	public void run() {
		try {
			serverscoket = new ServerSocket(8002);
			while (!Server.interrupted()) {
				Socket socket = serverscoket.accept();
				String name = socket.getLocalAddress().getHostAddress() + "::"
						+ socket.getPort();
				controller.addClientView(name);
				ServerThread st = new ServerThread(name, socket, this);
				threadPool.put(name, st);
				st.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public void deleteThread(String name) {
		ServerThread thread = threadPool.get(name);
		thread.interrupt();
		threadPool.remove(name);
	}

	public Controller getController() {
		return controller;
	}

	public void close() {
		if (serverscoket != null) {
			try {
				serverscoket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
