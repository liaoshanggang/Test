package com.lanqiao.test6;

import java.io.File;
import java.io.IOException;

public class TestFile1 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\gg\\Desktop");
		System.out.println(file.mkdirs());
		/*File file1 = new File(file,"a.txt");
		file.createNewFile();
		boolean isCreateNewFile = file1.createNewFile();
		System.out.println("isCreateNewFile:"+isCreateNewFile);*/
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isAbsolute());
		System.out.println(file.isDirectory());
		System.out.println(file.getParentFile());
		System.out.println(file.length());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		System.out.println(file.isHidden());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getFreeSpace());
		String[] list = file.list();
		for (String string : list) {
			System.out.println("qwr++"+string);
		}
		System.out.println();
		System.out.println(file.delete());
	}
}
