package com.test01;

public class MTest05 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		while (i<6) {
			i++;
			while(j<6) {
				j++;
				
				System.out.printf("%1d",j);
			}
			
			System.out.println(i);
		}
		
	}
}
