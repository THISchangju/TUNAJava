package org.TUNA.day06.oop.score;

import java.util.Scanner;

public class ScoreProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		for(;;) {}
		int kor = 0;
		int eng = 0;
		int math = 0; 
		// case1 안에서 선언된 변수(kor,eng,math)는 case2에서 사용 못함
		// 지역변수의 개념이고 case1,case2에서 모두 쓰려면 밖에서 선언하여
		// 사용해야 함. 이것이 전역변수의 개념임.
		finish :
		while(true) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt(); // 번호로 메뉴선택 값을 입력받음
			switch(choice) {
			case 1 : 
				System.out.println("====== 성적 입력 ======"); 
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
				break;
			case 2 : 
				System.out.println("====== 성적 출력 ======"); 
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println("총점 : " + (kor+eng+math));
				System.out.println("평균 : " + (kor+eng+math)/(double)3);
				break;
			case 3 : 
				System.out.println("프로그램이 종료되었습니다."); 
				break finish;	// 뒤에 코드가 있을 경우 실행해줌, while문만 나오게 됨
//				return;	// 지금은 같은 동작이나 뒤에 코드가 있고 실행해야 할 경우 달라짐.
			default : System.out.println("1 ~ 3 사이의 숫자를 입력해주세요."); break;
			}
		}
	}
}