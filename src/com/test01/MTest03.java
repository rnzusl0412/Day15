package com.test01;

//break; �ݺ��� ���ù����� Ű����
//return; �޼ҵ带 �����ϴ� Ű����
//continue; �ݺ������� ����ϴ� Ű����
public class MTest03 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			
			if (i == 4) {
				return;	//�ݺ��� ��� ��������
			}
			System.out.println(i);
		}
		System.out.println("============================================================================================");
	}
}
