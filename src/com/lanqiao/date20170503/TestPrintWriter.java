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
			pw.println("<title>�Ǻǹ�����</title>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("<marquee>sdfsdf</marquee>");
			pw.println("</body>");
			pw.println("</html>");
			pw.println("�����»����º�");
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
