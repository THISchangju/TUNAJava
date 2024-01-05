package org.TUNA.day09.collection.list.exercise;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Exercise_List1 {
	public static void main(String[] args) {
		// 이름을 4개 입력받아 ArrayList에 저장하고 모두 출력한 후 제일 긴 이름을
		// 출력하여라.
		Scanner sc = new Scanner(System.in);
		// 1. 문자열만 삽입가능한 ArrayList 컬렉션 생성
//		ArrayList<String> list = new ArrayList<String>();
		List<String> strlist = new ArrayList<String>(); // 업캐스팅
		// 2. 키보드로부터 4개의 이름을 입력받아 ArrayList에 삽입
		for (int j = 0; j < 4; j++) {
			System.out.print("이름을 입력하세요");
			strlist.add(sc.next());
		}
		// 3. ArrayList에 들어있는 모든 이름 출력
		for (int i = 0; i < strlist.size(); i++) {
			System.out.println(strlist.get(i));
		}
		// 4. 가장 긴 이름 출력
		int longname = 0;
		for(int k = 0; k<strlist.size(); k++) {
			if(strlist.get(longname).length() < strlist.get(k).length()) // 인덱스 longname을 선언해서 get()안에 집어넣어줌
				longname = k; // 선택정렬과 같은 구조(?)
							  // if로 내가 선언한 것보다 큰걸 찾을 때까지 숫자를 올리면서 찾아감
		}
		System.out.println("\n가장 긴 이름은 : " + strlist.get(longname));
	}
}
