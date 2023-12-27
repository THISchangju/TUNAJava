package org.TUNA.day04.exercise;

public class Exercise_DimArray2 {
	public static void main(String[] args) {
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		
		// 5 10 15 20 25
		// num[0][4], num[1][4], num[2][4], num[3][4], num[4][4] 
		// 4 9 14 19 24
		// num[0][3], num[1][3], num[2][3], num[3][3], num[4][3] 
		// 3 8 13 18 23
		// num[0][2], num[1][2], num[2][2], num[3][2], num[4][2] 
		// 2 7 12 17 22
		// num[0][1], num[1][1], num[2][1], num[3][1], num[4][1] 
		// 1 6 11 16 21
		// num[0][0], num[1][0], num[2][0], num[3][0], num[4][0] 
		int arrs [][] = new int [5][5];
		int num = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = arrs.length-1; j >= 0; j--) {
				arrs[j][i] = num++;
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.print(arrs[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
