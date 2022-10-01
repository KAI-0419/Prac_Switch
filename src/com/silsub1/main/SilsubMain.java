package com.silsub1.main;

import java.util.Scanner;

public class SilsubMain {
	public static void main(String[] args) {
		SilsubMain t1 = new SilsubMain();
//		t1.test1();
//		t1.test2();
//		t1.test3();
//		t1.test4();
//		t1.test5();
//		t1.test6();
		t1.test7();
}
//	public void test1() {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("국어 점수를 입력하세요: ");
//		int Korean = sc.nextInt();
//		
//		System.out.println("영어 점수를 입력하세요: ");
//		int English = sc.nextInt();
//		
//		System.out.println("수학 점수를 입력하세요: ");
//		int Math = sc.nextInt();
//		
//		if((((Korean>=40)&&(English>=40)&&(Math>=40))&&((Korean+English+Math)/3>=60))){
//			System.out.println("합격입니다!");
//		}else {
//			System.out.println("불합격입니다..");
//		}
//	}
//	
//	public void test2() {
//		System.out.println("***초기 메뉴***");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1. 입력");
//		System.out.println("2. 수정");
//		System.out.println("3. 조회");
//		System.out.println("4. 삭제");
//		System.out.println("7. 종료");
//		System.out.print("메뉴번호 입력: ");
//		int pick = sc.nextInt();
//		if(pick == 1) {
//			System.out.println("입력메뉴가 선택되었습니다.");
//		}else if(pick == 2){
//			System.out.println("수정메뉴가 선택되었습니다.");
//		}else if(pick == 3){
//			System.out.println("조회메뉴가 선택되었습니다.");
//		}else if(pick == 4){
//			System.out.println("삭제메뉴가 선택되었습니다.");
//		}else if(pick == 7){
//			System.out.println("프로그램이 종료됩니다.");
//		}else {
//			System.out.println("번호가 잘못 입력되었습니다."+"다시 입력하십시오.");
//		}
//		}
//	
//	public void test3() {
//		System.out.print("숫자를 입력해 주세요: ");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		if(a>0) {
//			System.out.println("양수다.");
//		}else {
//			System.out.println("양수가 아니다.");
//		}
//	}
	
//	public void test4() {
//		System.out.print("숫자를 입력해 주세요: ");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		if(num%2==0) {
//			String str = "짝수다.";
//			System.out.print(str);
//		}else {
//			String str = "홀수다.";
//			System.out.print(str);
//		}
//		}
	
//	public void test5() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력해 주세요: ");
//		String name = sc.nextLine();
//		
//		System.out.print("나이를 입력해 주세요: ");
//		int age = sc.nextInt();
//		
//		System.out.print("키를 입력해 주세요: ");
//		double height = sc.nextDouble();
//		
//		System.out.print(name + "의 " + "나이는 " + age + "살 이고," + "키는 " + height + "cm 이다.");
//	}
	
//	public void test6() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두 개의 숫자를 입력해 주세요: ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println(a+"+"+b+"="+(a+b));
//		System.out.println(a+"-"+b+"="+(a-b));
//		System.out.println(a+"*"+b+"="+(a*b));
//		System.out.println(a+"/"+b+"="+(a/b));
//		System.out.println(a+"%"+b+"="+(a%b));
//	}
	
	public void test7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요: ");
		char grade = ' ';
		int score = sc.nextInt();
		if(score<=100 && score>=90) {
			grade = 'A';
		}else if(score>=80) {
			grade = 'B';
		}else if(score>=70) {
			grade = 'C';
		}else if(score>=60) {
			grade = 'D';
		}else if(score >=0){
			grade = 'F';
		}
		System.out.print("점수: " + score);
		System.out.print("학점: " + grade);
	}
}
