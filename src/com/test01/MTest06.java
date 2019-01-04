package com.test01;

import java.util.Scanner;

public class MTest06 {
	public static void view() {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= i + 20; j += 5) {
				System.out.printf("%4d", j);
			}
			System.out.println();
		}
	}

	public static void view01() {
		for (int i = 1; i <= 25; i += 5) {
			for (int j = i; j <= i + 4; j++) {
				System.out.printf("%4d", j);
			}
			System.out.println();
		}
	}

	public static void view02() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 26 - i; j >= i - 4 && j > 0; j -= 5) {
				System.out.printf("%4d", j);
			}
			System.out.println();
		}
	}

	public static void view03() {
		for (int i = 25; i > 0; i -= 5) {
			for (int j = i; j > i - 5; j -= 1) {
				System.out.printf("%4d", j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int a = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("input su[1,2,3,4]: ");
		a = sc.nextInt();
		switch (a) {
		case 1:
			view();
			break;
		case 2:
			view01();
			break;
		case 3:
			view02();
			break;
		case 4:
			view03();
			break;
		}
	}
}
