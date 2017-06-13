package com.lanqiao.date20170407;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestMusic {
	
	public static final String PATH_YY = "D:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170407\\薛之谦 - 演员.mp3";
	public static final String PATH_CUT_YY = "D:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170407\\yanyuan.mp3.mp3";
	public static final String PATH_LIUHAI = "D:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170407\\刘海哥.mp3";
	public static final String PATH_CUT_LIUHAI = "D:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170407\\liuhai.mp3";
	public static final String PATH_CONNECTMUSIC = "D:\\WorkSpace\\Test\\src\\com\\lanqiao\\data20170407\\connectMusic.mp3";
	
	public static void main(String[] args) {
		cutMusic(983040, 1638400, PATH_YY, PATH_CUT_YY);
		connectMusic(PATH_CUT_YY, PATH_CONNECTMUSIC);
		cutMusic(1638400, 3358720, PATH_LIUHAI, PATH_CUT_LIUHAI);
		connectMusic(PATH_CUT_LIUHAI, PATH_CONNECTMUSIC);
	}

	//把切好的音乐连接再一起，也就是 copy
	private static void connectMusic(String source, String target) {
		// TODO 自动生成的方法存根
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(source));
			bos = new BufferedOutputStream(new FileOutputStream(target, true));

			byte[] b = new byte[512];

			int len = 0;

			while ((len = bis.read(b)) != -1) {
				bos.write(b, 0, len);
			}

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	
	//把音乐截取
	private static void cutMusic(int start, int end, String source,
			String target) {
		/*
		 * 
		 * 薛之谦 - 演员.mp3 128kpbs 4,179,360 4:21 261 60s 多少字节 100s 多少字节 1s
		 * 128bit/8 byte *1024 60* 128*1024/8 byte = 983040 100* 128*1024/8 byte
		 * = 1638400
		 */

		// 刘海哥.mp3
		// 4,723,084 字节 115秒
		// 40秒 多少字节
		// 82秒结尾的字节
		// 1s 320bit/8 byte * 1024
		// 40*320*1024/8 = 1,638,400
		// 82*320*1024/8 = 3,358,720

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			bos = new BufferedOutputStream(new FileOutputStream(target));
			bis = new BufferedInputStream(new FileInputStream(source));

			byte[] b = new byte[512];
			int len = 0;

			int total = 0;
			while ((len = bis.read(b)) != -1) {

				total += len;

				// 如果小于开始字节的就抛弃掉
				if (total < start) {
					continue;
				}

				bos.write(b);

				// 如果大于 结尾字节数 就终止读取
				if (total >= end) {
					bos.flush();
					break;
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null)
					bos.close();
				if (bis != null)
					bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
