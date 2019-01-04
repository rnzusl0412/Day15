package com.test01;

import java.util.Scanner;

import MyScore.score;


public class MTest02 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("받은 점수 : ");
		double point = sc.nextDouble();
		switch((int)point/10) {
		case 10:
		case 9 :System.out.println("A"); break;
		case 8 : System.out.println("B"); break;
		case 7 : System.out.println("C"); break;
		case 6 : System.out.println("D"); break;
		default : System.out.println("F"); break;
		}
		
		score se = new score();
		System.out.println(se);
	}
}
