package com.test01;

import java.util.Scanner;

public class SwitchTest01 {
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 해주세요: ");
		int i = sc.nextInt();
		
		switch(i) {
		case 1: 
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		default:
			System.out.println("1,2,3도 아닙니다.");
			break;
		}
		
	}
	public void test2() {
		char ch = 'g';
		
		switch(ch) {
		case 'a':
			System.out.println("a입니다.");
			break;
		case 'b':
			System.out.println("b입니다.");
			break;
		case 'c':
			System.out.println("c입니다.");
			break;
		default: 
			System.out.println("None.");
		}
		System.out.println("----------------");
		
		int i = 2;
		switch(i) {
		case 1:
		case 3:
			System.out.print("홀수 입니다.");
			break;
		case 2:
		case 4:
			System.out.print("짝수 입니다.");
			break;
		default:
			System.out.print("None.");
		}
	}
}
