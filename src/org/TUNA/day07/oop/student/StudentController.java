package org.TUNA.day07.oop.student;

import java.util.Scanner;

public class StudentController {
	Student[] students = new Student[3];

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 메인 메뮤 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}

	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			System.out.println("이름 :");
			// students[i].name = sc.next();
			students[i].setName(sc.next()); // String name = sc.next();
			System.out.print("첫번째 점수 :");
			// students[i].firstScore = sc.nextInt(); // intfirstScore = sc.nextInt();
			students[i].setFirstScore(sc.nextInt());
			System.out.print("두번째 점수 :");
			// students[i].secondScore = sc.nextInt();
			students[i].setSecondScore(sc.nextInt());
		}
	}

	public void printScore() {
		for (int i = 0; i < students.length; i++) {
			System.out.println("======" + (i + 1) + "번째 학생의 정보 출력 ======");
			System.out.printf("%s 학생의 첫번째 점수는 %d점, 두번째 점수는 %d점입니다.\n", students[i].getName(),
					students[i].getFirstScore(), students[i].getSecondScore());
		}
	}

	// 메세지 출력
	public void displayMsg(String msg) {
		System.out.println(msg);
	}
}
