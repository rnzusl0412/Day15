package com.test01;

public class WhileTest {
	public static void Prn01() {
		// while을 사용한다.
		byte a = 1;
		while (true) {
			System.out.println(a++);
			if (a > 5) {
				break;
			}
		}
		System.out.println("_______________________________________");
	}

	public static void Prn02() {
		int a = 0;
		while (a < 5) {
			System.out.println(a++);
		}
	}

	public static void Prn03() {
		int a = 0;
		while (a < 3) {
			a++;
			System.out.println("안녕하세요");
		}
	}

	public static void Prn04() {
		// 1~100까지 출력
		int a = 1;
		int l = 0;
		while (a < 100) {
			a++;
			if ((a % 2 == 0) && (a % 3 == 0)) {
				System.out.println(a);
				l++;
			}
		}
		System.out.println("갯수 : " + l);
	}

	public static void Prn05() {
		int a = 0;
		int b = 0;
		int sum = 0;
		while (a < 10) {
			a++;
			b = 2 * a + 3;
			System.out.printf("a%2d : %5d\n", a, b);
			sum += b;
		}
		System.out.println("sum of ai : " + sum);
	}

	public static void Prn06() {
		int a = 0;
		while (a < 100) {
			a++;

			if (a % 5 != 0) {
				System.out.printf("%4d", a);
			} else if (a % 10 == 0) {
				System.out.printf("%4d \n", a);
			} else if (a % 10 == 5) {
				System.out.printf(" ♡");
			}

		}
	}

	public static void Prn07() {
		int a = 0;
		int sum = 0;
		while (a < 10) {
			a++;
			sum += a;
			if (a % 10 != 0) {
				System.out.printf("%2d +", a);
			} else {
				System.out.printf("%2d", a);
			}
		}
		System.out.printf(" = %2d", sum);
	}

	public static void main(String[] args) {
		Prn07();
	}
}
