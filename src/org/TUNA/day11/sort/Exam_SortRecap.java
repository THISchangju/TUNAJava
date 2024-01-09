package org.TUNA.day11.sort;

public class Exam_SortRecap {
	public void insertionSort() {
		int [] arrs = {23, 11, 13, 24, 4, 25}; 
		// 삽입정렬은 왼쪽으로 작은값을 보냄
		int i, j, key;
		for(i = 1; i < arrs.length; i++) {
			key = arrs[i];
			j = i -1;
			while(j >= 0 && arrs[j] > key) {
				arrs[j+1] = arrs[j];
				j--;
			}
			arrs[j+1] = key;
		}
		
//		for(j = 1; j < arrs.length; j++) {
//			for(i = j; i >= 1; i--) {
//				if(arrs[i-1] > arrs[i]) {
//					int temp = arrs[i];
//					arrs[i] = arrs[i-1];
//					arrs[i-1] = temp;
//				}
//			}
//		}
		printArray(arrs);
	}
	public void selectionSort() {
		int [] nums = {23, 11, 13, 24, 4, 25};
		// 선택정렬은 왼쪽부터 작은값으로 정렬
		int min;
		for(int i = 0; i < nums.length; i++) {
			min = i;
			for(int j = i+1; j < nums.length; j++) {
				if(nums[min] > nums[j]) {
					min = j;
				}
			} // 첫번째로 제일 작은값을 찾음
			int temp = nums[min];
			nums[min] = nums[i];
			nums[i]  = temp; 
			// 그 값은 첫번째 위치와 바꿈
		}
		printArray(nums);
	}
	public void bubbleSort() {
		int [] nums = {23, 11, 13, 24, 4, 25};
		// 버블정렬은 오른쪽부터 큰값으로 정렬
		// 23과 11 비교 -> 11 23
		// 23과 13 비교 -> 13 23
		// 23과 24 비교 -> 23 24
		// 24와 4 비교   -> 4 24
		// 24와 25 비교 -> 24 25 // 비교는 5개
		// 11 13 4 23 24 25
		// 11과 13 비교 -> 11 13
		// 13과 4 비교  -> 4 13
		// 13와 23 비교 -> 13 23
		// 23과 24 비교 -> 23 24 // 비교는 4개
		// 11 4 13 23 24 25
		// 11과 4 비교 -> 4 11
		// 11와 13 비교 -> 11 13
		// 13과 23 비교 -> 13 23 // 비교는 3개
		// 4 11 13 23 24 25
		// 4와 11 비교
		// 11과 13 비교
		// 4 11 13 23 24 25 	// 비교는 2개
		// 4와 11 비교
		// 4 11 13 23 24 25		// 비교는 1개
		for(int i = 0; i < nums.length-1; i++) {
			for(int j = 0; j < (nums.length-1)-i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		printArray(nums);
//		if(nums[0] > nums[1]) {}
//		if(nums[1] > nums[2]) {}
//		if(nums[2] > nums[3]) {}
//		if(nums[3] > nums[4]) {}
//		if(nums[4] > nums[5]) {}
		
	}
	
	public void printArray(int [] arrays) {
		for(int i : arrays) {
			System.out.print(i + " ");
		}
	}
}