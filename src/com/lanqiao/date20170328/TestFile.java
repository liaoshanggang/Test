package com.lanqiao.date20170328;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
		//创建文件
		//1.必须要存在目录
		File file = new File("G:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170328\\hasDirFile.java");
		file.createNewFile();
		
		//1.文件所在目录没有创建则必须先创建目录后创建文件
		File file2 = new File("G:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170328\\newFolder");
		file2.mkdir();
		//one way
		File file3 = new File(file2,"newFolderFile.java");
		file3.createNewFile();
		//second way
		File file4 = new File("G:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170328","\\newFolder\\newFolderFile2.java");
		file4.createNewFile();
		
		File file5 = new File("G:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170328","b.txt");
		file4.renameTo(file5);
	}
}
