package com.lanqiao.date20170407;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//3���ַ����������

public class TestSpeed {
	private static final String PATH = "D:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170407\\������.mp3";
	private static final String COPY_PATH = "D:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170407\\copyliuhai.mp3";

	public static void main(String[] args) {
	}

	// 1.���壬һ��һ���ַ�����д
	private static void method1() {
		// TODO �Զ����ɵķ������
		try (BufferedReader br = new BufferedReader(new FileReader(PATH));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(COPY_PATH));) {

			int c = 0;

			while ((c = br.read()) != -1) {
				bw.write(c);
			}

		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

	// 2.����,һ��һ���ַ�������д
	private static void method2() {
		// TODO �Զ����ɵķ������
		try (BufferedReader br = new BufferedReader(new FileReader(PATH));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(COPY_PATH));) {

			String len = "";
			while ((len = br.readLine()) != null) {
				bw.write(len);
				;
			}

		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
	//3�����壬���ַ����������ĳһ���֡�
	private static void method3() {
		// TODO �Զ����ɵķ������
		try (BufferedReader br = new BufferedReader(new FileReader(PATH));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(COPY_PATH));) {

			char[] c = new char[1024];
			int len = 0;
			while ((len = br.read(c)) != -1) {
				bw.write(c,0,len);
			}

		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}
