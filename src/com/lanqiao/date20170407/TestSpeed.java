package com.lanqiao.date20170407;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//3种字符流输入输出

public class TestSpeed {
	private static final String PATH = "D:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170407\\刘海哥.mp3";
	private static final String COPY_PATH = "D:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170407\\copyliuhai.mp3";

	public static void main(String[] args) {
	}

	// 1.缓冲，一个一个字符读和写
	private static void method1() {
		// TODO 自动生成的方法存根
		try (BufferedReader br = new BufferedReader(new FileReader(PATH));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(COPY_PATH));) {

			int c = 0;

			while ((c = br.read()) != -1) {
				bw.write(c);
			}

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	// 2.缓冲,一行一行字符串读和写
	private static void method2() {
		// TODO 自动生成的方法存根
		try (BufferedReader br = new BufferedReader(new FileReader(PATH));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(COPY_PATH));) {

			String len = "";
			while ((len = br.readLine()) != null) {
				bw.write(len);
				;
			}

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	//3，缓冲，将字符读入数组的某一部分。
	private static void method3() {
		// TODO 自动生成的方法存根
		try (BufferedReader br = new BufferedReader(new FileReader(PATH));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(COPY_PATH));) {

			char[] c = new char[1024];
			int len = 0;
			while ((len = br.read(c)) != -1) {
				bw.write(c,0,len);
			}

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
