package server.control.cqupt;

import ui.cqupt.MainClass;
import util.cqupt.Packager;
import util.cqupt.Parser;
import model.cqupt.Book;
import model.cqupt.BookList;

public class Controller {
	private MainClass mainclass;
	private String result;

	public Controller(MainClass mainclass) {
		this.mainclass = mainclass;
	}

	public String doResponse(String request) {
		Parser parser = new Parser();
		String operate = parser.getOperate(request);
		String content = parser.getContent(request);
		String response = null;
		if (operate.equals("insert")) {
			addBook(content);
			Packager packager = new Packager();
			response = packager.addPackage(operate, result);
		} else if (operate.equals("delete")) {
			deleteBook(content);
			Packager packager = new Packager();
			response = packager.deletePackage(operate, result);
		} else if (operate.equals("set")) {
			setBook(content);
			Packager packager = new Packager();
			response = packager.setPackage(operate, result);
		} else if (operate.equals("select")) {
			getBookList();
			Packager packager = new Packager();
			response = packager.searchPackage(operate, result);
		}
		return response.toString();
	}

	public void addBook(String content) {
		Parser parser = new Parser();
		Book book = parser.parseBook(content);
		BookList booklist = new BookList();
		if (booklist.insert(book)) {
			result = "����ɹ�";
		} else {
			result = "����ʧ��,���д�ͼ��";
		}
	}

	public void deleteBook(String content) {
		BookList booklist = new BookList();
		if (booklist.delete(content)) {
			result = "ɾ���ɹ�";
		} else {
			result = "ɾ��ʧ��,û�д�ͼ��";
		}
	}

	public void setBook(String content) {
		BookList booklist = new BookList();
		Parser parser = new Parser();
		Book book = parser.parseBook(content);
		if (booklist.set(book)) {
			result = "�޸ĳɹ�";
		} else {
			result = "�޸�ʧ�ܣ�û�д�ͼ��";
		}
	}

	@SuppressWarnings("unused")
	public void getBookList() {
		BookList booklist = new BookList();
		if (booklist != null) {
			result = "��ѯ�ɹ� ";
		} else {
			result = "��ѯʧ��";
		}

	}

	public void deleteClientView(String name) {
		mainclass.setTextArea("�ͻ���" + name + "�˳�");
		mainclass.deleteList(name);
	}

	public void addClientView(String name) {
		mainclass.addList(name);
		mainclass.setTextArea(name + "�ͻ���������");
	}

}
