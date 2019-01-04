package com.test01;

public class DoTest {
	public static void Disp() {
		int a = 0;
		do {
			System.out.printf("%3d", a);
			a++;
		} while (a < 5);
	}

	public static void Disp02() {
		int a = 0;
		int b = 0;
		int sum = 0;
		do {
			a++;
			b = 2 * a + 3;
			System.out.printf("a%2d : %5d\n", a, b);
			sum += b;
		} while (a < 10);
		System.out.println("sum of ai : " + sum);

	}

	public static void main(String[] args) {
		Disp02();
	}
}
