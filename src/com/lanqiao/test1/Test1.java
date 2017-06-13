package com.lanqiao.test1;
import java.util.Scanner;

/**
 * 1、 定义一个int型的一维数组，包含10个元素，从键盘接收，分别赋一些随机整数，
 * 然后求出所有元素的最大值，最小值，平均值，和值，并输出出来。（50分）
 * @author Administrator
 *
 */
public class Test1 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int average = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入随机数"+(i+1)+"：");
			arr[i] = in.nextInt();
			sum = sum + arr[i];
			count++;
		}
		average = sum/count;
		
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		//显示数组
		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		System.out.println("最大值为："+arr[0]);
		System.out.println("最小值为："+arr[arr.length-1]);
		System.out.println("平均值为："+average);
		System.out.println("和值为："+sum);
		
	}
}
