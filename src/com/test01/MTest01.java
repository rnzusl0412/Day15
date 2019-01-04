package com.test01;

import java.util.Scanner;

public class MTest01 {
	public static void main(String[] args) {
		//평균을 기준으로 A,B,C,D 나머지는 F
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("받은 점수 : ");
		double point = sc.nextDouble();
		if(point >= 90) {
			System.out.println("A");
		} else if (point >=80) {
			System.out.println("B");
		}else if (point >=70) {
			System.out.println("C");
		}else if (point >=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
