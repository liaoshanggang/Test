package com.lanqiao.test1;
import java.util.Scanner;

/**
 * 1�� ����һ��int�͵�һά���飬����10��Ԫ�أ��Ӽ��̽��գ��ֱ�һЩ���������
 * Ȼ���������Ԫ�ص����ֵ����Сֵ��ƽ��ֵ����ֵ���������������50�֣�
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
			System.out.println("�����������"+(i+1)+"��");
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
		//��ʾ����
		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		System.out.println("���ֵΪ��"+arr[0]);
		System.out.println("��СֵΪ��"+arr[arr.length-1]);
		System.out.println("ƽ��ֵΪ��"+average);
		System.out.println("��ֵΪ��"+sum);
		
	}
}
