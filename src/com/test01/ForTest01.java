package com.test01;

public class ForTest01 {
	public static void Exam01(int a) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(a + " * " + i + " = " + (a * i));
		}
	}

	public static void Exam02(int a, int b) {
		// 구구단 2단 출력
		for (int i = a; i <= b; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}

	public static void Exam03(int a) {
		for (int i = 1; i <= 9; i++) {
			if (i % 2 == 0) {
				System.out.println(a + " * " + i + " = " + (a * i) + "\n");
			} else {
				System.out.println(a + " * " + i + " = " + (a * i));
			}
		}
	}

	public static void Exam04(int a) {
		for (int i = 1; i <= 9; i++) {
			if (i % 4 == 0) {
				System.out.printf("%2d * %2d = %2d  \n", i, a, i * a);
			} else {
				System.out.printf("%2d * %2d = %2d   ", i, a, i * a);
			}
		}
	}

	public static void main(String[] args) {
		Exam04(5);
	}
}
