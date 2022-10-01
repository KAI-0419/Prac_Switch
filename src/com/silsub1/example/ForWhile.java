package com.silsub1.example;

import java.util.Scanner;

public class ForWhile {
	Scanner sc = new Scanner(System.in);
	
//	public void printStart1() {
//		System.out.print("정수 하나 입력: ");
//		int row = sc.nextInt();
//		
//		for(int i=1; i<=row; i++) {
//			for(int j=1; j<=i; j++) {
//				if(i==j) {
//					System.out.print(i);
//				}else {
//				System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
//	}
//	
//	public void printStar2(){
//		System.out.print("정수 하나 입력: ");
//		int row = sc.nextInt();
//		
//		if(row>0) {
//		for(int i=1; i<=row; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		}else if(row<0) {
//			for(int i=(-row); i>0; i--) {
//				for(int j=1; j<=i; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//		}
//	}else {
//		System.out.println("출력 기능이 없습니다.");
//	}
//	}
	
	public void countInputCharater() {
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			char tmp = str.charAt(i);
			
			if(!(tmp>='a' && tmp<='z' || tmp>='A' && tmp<='Z')) {
				System.out.print("영문이 아닙니다.");
				return;
			}
		}
		
		System.out.print("문자 입력: ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.println("포함된 갯수: " + count);
	}
	
	public void ex1() {
		int cnt = 1;
		int sum = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i == j || i+j == 4) {
					sum += cnt;
				}
				System.out.print(cnt++ + " ");
			}
			System.out.println();
			}
		System.out.println(sum);
	}
	
	
	
	
	
	
	
}