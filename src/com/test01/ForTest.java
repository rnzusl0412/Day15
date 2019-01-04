package com.test01;

public class ForTest {
	public static void For01() {
		int a = 1;
		for (a = 1; a < 11; a++) {
			System.out.printf("%3d", a);
		}
	}

	public static void For02() {
		int a = 10;
		for (a = 10; a > 0; a--) {
			System.out.printf("%3d", a);
		}
	}

	public static void For03() {
		int a = 1;

		for (a = 1; a < 6; a++) {
			int b = 2 * a;
			System.out.printf("%3d", b);
		}
	}

	public static void For04() {
		int a = 1;
		for (a = 1; a < 21; a++) {
			int b = 5 * a;
			System.out.printf("%4d", b);
		}
	}

	public static void For05(int i) {
		for (int a = 1; a <= i; a++) {
			System.out.printf("%4d", a);
		}
	}

	public static int For05(int a, int b) {
		int c = 0;
		for (int i = a;i<=b;i++) {
			System.out.printf("%2d  ",i);
			c += i;
		}
		return c;
	}

	public static void For06() {
		
	}
	
	
	public static void main(String[] args) {
		int hap = For05(1,10);
		System.out.println(hap);
		
	}
}
