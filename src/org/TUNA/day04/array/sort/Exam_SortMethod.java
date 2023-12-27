package org.TUNA.day04.array.sort;

import java.util.Arrays;

public class Exam_SortMethod {
	public static void main(String[] args) {
		int arrs [] = {11, 13, 4, 2, 6};
		Arrays.sort(arrs);
		for(int i : arrs) { // for each문(for문에 들어가는 구문을 :을 퉁칠 수 있다)
			System.out.print(i + " "); // i는 계속 순차적으로 ++가 됨.	
		}
	}
}
