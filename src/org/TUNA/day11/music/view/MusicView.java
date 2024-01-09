package org.TUNA.day11.music.view;

import java.util.Scanner;

public class MusicView {

	public void launchApp() {
		int val = -1;
		do {
			val = this.printMainMenu();
		}while(val != 0);
	}
	
	public int printMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >> ");
		int val = sc.nextInt();
		return val;
		// === === 메인 메뉴 === ===
		// 1. 마지막 위치에 곡 추가
		// 2. 첫 위치에 곡 추가
		// 3. 전체 곡 목록 출력
		// 4. 특정 곡 검색
		// 5. 특정 곡 삭제
		// 6. 특정 곡 정보수정
		// 7. 곡명 오름차순 정렬
		// 8. 곡명 내림차순 정렬
		// 9. 가수명 오름차순 정렬
		// 10. 가수명 내림차순 정렬
		// 0. 종료
		// 메뉴 선택 >> 1
	}
}