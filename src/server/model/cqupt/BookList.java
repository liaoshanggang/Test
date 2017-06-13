package server.model.cqupt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import util.cqupt.Packager;

import data.DBconnection;

/**
 * 
 * @author Administrator
 * 
 */
public class BookList extends ArrayList<Book> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookList() {
		super();
		String sql = "SELECT id,name,price FROM books";
		DBconnection d = new DBconnection();
		Statement sta = null;
		Connection con = null;
		ResultSet re = null;
		try {
			con = d.getConnect();
			sta = con.createStatement();
			re = sta.executeQuery(sql);
			while (re.next()) {
				add(new Book(re.getString(1), re.getString(2), re.getString(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			d.close(con, sta, re);
		}
	}

	public boolean insert(Book book) {
		if (checkId(book.getId())) {
			String id = book.getId();
			String name = book.getName();
			String price = book.getPrice();
			add(book);
			String sql = "INSERT INTO books(id,name,price)" + "VALUES('" + id
					+ "','" + name + "','" + price + "')";
			DBconnection d = new DBconnection();
			Connection con = null;
			Statement sta = null;
			try {
				con = d.getConnect();
				sta = con.createStatement();
				sta.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				d.close(con, sta);
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean delete(String name) {
		if (checkName(name)) {
			String sql = "DELETE FROM books WHERE name='" + name + "'";
			DBconnection d = new DBconnection();
			Connection con = null;
			Statement sta = null;
			try {
				con = d.getConnect();
				sta = con.createStatement();
				sta.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				d.close(con, sta);
			}
			return true;
		} else {

			return false;
		}
	}

	public boolean set(Book book) {
		if (!checkId(book.getId())) {
			String id = book.getId();
			String name = book.getName();
			String price = book.getPrice();
			int index = getIndex(id);
			set(index, book);
			String sql = "UPDATE books SET name='" + name + "'," + "price='"
					+ price + "' WHERE id='" + id + "'";
			DBconnection d = new DBconnection();
			Connection con = null;
			Statement sta = null;
			try {
				con = d.getConnect();
				sta = con.createStatement();
				sta.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				d.close(con, sta);
			}
			return true;
		} else {
			return false;
		}
	}

	public String getBookList() {
		StringBuffer books = new StringBuffer("");
		Packager packager = new Packager();
		for (int i = 0; i < this.size(); ++i) {
			if (i == this.size() - 1) {
				String s = packager.BookPackage(this.get(i));
				books.append(s);
			} else {
				Book book = this.get(i);
				String str = packager.BookPackage(book);
				books.append(str + "\n");
			}
		}
		return books.toString();
	}

	public boolean checkId(String id) {
		for (int i = 0; i < this.size(); ++i) {
			Book book = this.get(i);
			String bookid = book.getId();
			if (bookid.equals(id))
				return false;
		}
		return true;
	}

	public boolean checkName(String name) {
		for (int i = 0; i < this.size(); ++i) {
			Book book = this.get(i);
			if (book.getName().equals(name)) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	public int getIndex(String bookid) {
		int i = 0;
		for (; i < this.size(); ++i) {
			Book book = this.get(i);
			String id = book.getId();
			if (id.equals(bookid)) {
				break;
			}
		}
		return i;
	}

}
