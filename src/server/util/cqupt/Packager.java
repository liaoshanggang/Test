package server.util.cqupt;

import model.cqupt.Book;
import model.cqupt.BookList;

public class Packager {
	public String addPackage(String operate, String result) {
		BookList booklist = new BookList();
		StringBuffer mes = new StringBuffer("");
		String books = booklist.getBookList();
		mes.append("operate:" + operate + "\n");
		mes.append("content:" + books + "\n");
		mes.append("result:" + result + "\n");

		return mes.toString();
	}

	public String searchPackage(String operate, String result) {
		BookList booklist = new BookList();
		StringBuffer mes = new StringBuffer("");
		String books = booklist.getBookList();
		mes.append("operate:" + operate + "\n");
		mes.append("content:" + books + "\n");
		mes.append("result:" + result + "\n");
		System.out.println(mes.toString());
		return mes.toString();
	}

	public String deletePackage(String operate, String result) {
		BookList booklist = new BookList();
		StringBuffer mes = new StringBuffer("");
		String books = booklist.getBookList();
		mes.append("operate:" + operate + "\n");
		mes.append("content:" + books + "\n");
		mes.append("result:" + result + "\n");

		return mes.toString();
	}

	public String setPackage(String operate, String result) {
		BookList booklist = new BookList();
		StringBuffer mes = new StringBuffer("");
		String books = booklist.getBookList();
		mes.append("operate:" + operate + "\n");
		mes.append("content:" + books + "\n");
		mes.append("result:" + result + "\n");

		return mes.toString();
	}

	public String BookPackage(Book book) {
		StringBuffer str = new StringBuffer("");
		str.append(book.getId() + "#" + book.getName() + "#" + book.getPrice());
		return str.toString();
	}

}
