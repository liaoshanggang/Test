package com.lanqiao.date20170407;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ������һ�����ִ���  
 * ������
 *    1. ��n�����֣��ҵ��߳����֣�
 *    2. ��ȡ�߳����ֵ�������
 *    3. ���ⲿ�ֶ��󱣴��һ��mp3
 *    4. ������ƴ������
 */
public class CutMusic {

	public static void main(String[] args) {

		// 50000332 200000 400000 ��μ��㣿

		// 4,723,084 �ֽ� 115��
		// 40�� �����ֽ�
		// 82���β���ֽ�
		// 1s 320bit/8 byte * 1024
		// 40*320*1024/8 = 1,638,400
		// 82*320*1024/8 = 3,358,720

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		int start = 1638400;
		int end = 3358720;

		try {
			bos = new BufferedOutputStream(new FileOutputStream("D:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170407\\liuhai.mp3"));
			bis = new BufferedInputStream(new FileInputStream("D:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170407\\������.mp3"));

			byte[] b = new byte[512];
			int len = 0;

			int total = 0;
			while ((len = bis.read(b)) != -1) {

				total += len;

				// ���С�ڿ�ʼ�ֽڵľ�������
				if (total < start) {
					continue;
				}

				bos.write(b);

				// ������� ��β�ֽ��� ����ֹ��ȡ
				if (total >= end) {
					bos.flush();
					break;
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null) bos.close();
				if (bis != null) bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
