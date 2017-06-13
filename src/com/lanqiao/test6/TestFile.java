package com.lanqiao.test6;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
		File file = new File("G:\\WorkSpace\\Test\\src\\com\\lanqiao\\test6");
		
		boolean isMkDir = file.mkdirs();
		if(!file.exists()){			
			System.out.println("isMkDir:"+isMkDir);
		}else{
			System.out.println("目录或者文件已经存在！");
		}
		
		File file2 = new File(file,"file.txt");
		boolean isCreateNewFile = file2.createNewFile();
		System.out.println("isCreateNewFile:"+isCreateNewFile);
		
		File file3 = new File("G:\\WorkSpace\\Test\\src\\com\\lanqiao\\test6\\a.txt");
		isCreateNewFile = file3.createNewFile();
		System.out.println("isCreateNewFile:"+isCreateNewFile);
	}
}
