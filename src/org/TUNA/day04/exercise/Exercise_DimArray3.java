package org.TUNA.day04.exercise;

public class Exercise_DimArray3 {
	public static void main(String[] args) {
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25
		//nums[0][0],nums[1][0], nums[2][0], nums[3][0]
		int nums [][] = new int[5][5];
		int k = 1;
		// 이차원배열 데이터 입력
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				nums[j][i] = k++;
			}
		}
		// 이차원 배열 출력
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
