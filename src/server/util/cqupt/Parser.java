package server.util.cqupt;

import model.cqupt.Book;

public class Parser {

	public String getOperate(String request) {
		String[] message = request.split("\n");
		String operate = message[0].substring(8, message[0].length());
		return operate;
	}

	public String getContent(String request) {
		String[] message = request.split("\n");
		String content = message[1].substring(8, message[1].length());
		return content;
	}

	public Book parseBook(String str) {
		String[] mes = str.split("#");
		String id = mes[0];
		String name = mes[1];
		String price = mes[2];
		return new Book(id, name, price);
	}
}
