package com.lanqiao.date20170503;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter(new File("hello.html"));
			pw.println("<html>");
			pw.println("<head>");
			pw.println("<title>呵呵哈哈哈</title>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("<marquee>sdfsdf</marquee>");
			pw.println("</body>");
			pw.println("</html>");
			pw.println("霍华德霍华德和");
			pw.write("hello");
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
