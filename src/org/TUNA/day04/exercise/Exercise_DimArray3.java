package org.TUNA.day04.exercise;

public class Exercise_DimArray3 {
	public static void main(String[] args) {
		// 1 2 3 4 5
		// num[0][0], num[0][1], num[0][2], num[0][3], num[0][4] 
		// 10 9 8 7 6
		// num[1][4], num[1][3], num[1][2], num[1][1], num[1][0] 
		// 11 12 13 14 15
		// num[2][0], num[2][1], num[2][2], num[2][3], num[2][4] 
		// 20 19 18 17 16
		// num[3][4], num[3][3], num[3][2], num[3][1], num[3][0] 
		// 21 22 23 24 25
		// num[4][0], num[4][1], num[4][2], num[4][3], num[4][4] 
		int arrs [][] = new int [5][5];
		int num = 1;
		for(int i = 0; i < arrs.length; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < arrs[i].length; j++) {
					arrs[i][j] = num++;								
				}
			}else {
				for(int j = arrs.length-1; j >= 0; j--) {
					arrs[i][j] = num++;
				}
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
