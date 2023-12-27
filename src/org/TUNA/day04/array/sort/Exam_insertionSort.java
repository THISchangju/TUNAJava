package org.TUNA.day04.array.sort;

public class Exam_insertionSort {
	public static void main(String [] args) {
		// 삽입 정렬
		// 정령 알고리즘 중에 하나 가장 간다하고 기본이 되는 알고리즘
		// 배열의 N번 인덱스값을 0번에서 n-1번 인덱스까지 비교~!
		// N은 1부터 시작
		// {2, 5, 4, 1, 3}
		// 1 : 5와 2비교 -> X
		// 첫번째 결과 {2, 5, 4, 1, 3}
		// 1 : 4와 5비교 -> 교환
		// 2 : 4하고 2비교 -> X
		// 두번째 결과 {2, 4, 5, 1, 3}
		// 1 : 1과 5비교 -> 교환 {2, 4, 1, 5, 3}
		// 2 : 1과 4비교 -> 교환 {2, 1, 4, 5, 3}
		// 3 : 1과 2비교 -> 교환 {1, 2, 4, 5, 3}
		// 세번째 결과 {1, 2, 4, 5, 3}
		// 1 : 3과 5비교 -> 교환 {1, 2, 4, 3, 5}
		// 2 : 3과 4비교 -> 교환 {1, 2, 3, 4, 5}, 이때 정렬 끝
		// 3 : 3과 2비교 -> X
		// 4 : 3과 1비교 -> X
		int arrs [] = {2, 5, 4, 1, 3};
		for(int j = 1; j < arrs.length; j++) {
			for(int i = j; i >= 1; i--) {
				if(arrs[i-1] > arrs[i]) {
				int temp = arrs[i];
				arrs[i] = arrs[i-1];
				arrs[i-1] = temp;
				}
			}
		}
		// 배열 출력
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		System.out.println();
	}
}
//      if(arrs[0] > arrs[1]) {
//      int temp = arrs[1];
//      arrs[1] = arrs[0];
//      arrs[0] = temp;
//  	}
		// {2, 5, 4, 1, 3}
// 		if(arrs[1] > arrs[2]) {
//      int temp = arrs[2];
//      arrs[2] = arrs[1];
//      arrs[1] = temp;
//  	}
//  	if(arrs[0] > arrs[1]) {
//      int temp = arrs[1];
//      arrs[1] = arrs[0];
//      arrs[0] = temp;
//  	}
		//{2, 4, 5, 1, 3}
//  	if(arrs[2] > arrs[3]) {
//      int temp = arrs[3];
//      arrs[3] = arrs[2];
//      arrs[2] = temp;
//  	}
//  	if(arrs[1] > arrs[2]) {
//      int temp = arrs[2];
//      arrs[2] = arrs[1];
//      arrs[1] = temp;
//  	}
//  	if(arrs[0] > arrs[1]) {
//      int temp = arrs[1];
//      arrs[1] = arrs[0];
//      arrs[0] = temp;
//  	}

		
		
		// 오름차순, 작은거 찾아야됨
		// 1 : 2하고 5비교 -> X
		// 1번째 동작 결과 {2, 5, 4, 1, 3}
		// 1 : 2하고 4비교 -> X
		// 2 : 5하고 4비교 -> 교환
		// 2번째 동작 결과 {2, 4, 5, 1, 3}
		// 1 : 2하고 1비교 - > 교환 ({1, 4, 5, 2, 3})
		// 2 : 4하고 2비교 - > 교환 ({1, 2, 5, 4, 3})
		// 3 : 5하고 4비교 - > 교환 ({1, 2, 4, 5, 3})
		// 3번째 동작 결과 {1, 2, 3, 4, 5}
		// 1 : 1하고 3비교 -> X
		// 2 : 2하고 3비교 -> X
		// 3 : 4하고 3비교 -> 교환({1,2,3,5,4})
		// 4 : 5하고 4비교 -> 교환({1,2,3,4,5})
//		int arrs [] = {2, 5, 4, 1, 3};
//		for(int i = 1; i < arrs.length; i++) {
//		    for(int j = 0; j < i; j++) {
//		        if(arrs[j] > arrs[i]) {
//		            int temp = arrs[i];
//		            arrs[i] = arrs[j];
//		            arrs[j] = temp; // 교환
//		        }
//		    }
//		}
//		// 정렬된 배열 출력
//		for(int i = 0; i < arrs.length; i++) {
//		    System.out.print(arrs[i] + " ");
//		}
//	}
//}
// 1번째 동작
//      if(arrs[0] > arrs[1]) {
//          int temp = arrs[1];
//          arrs[1] = arrs[0];
//          arrs[0] = temp; // 교환
//      }
//결과 : {2, 5, 4, 1, 3}
//2번째 동작
//      if(arrs[0] > arrs[2]) {
//          int temp = arrs[2];
//          arrs[2] = arrs[0];
//          arrs[0] = temp;
//      }
//      if(arrs[1] > arrs[2]) {
//          int temp = arrs[2];
//          arrs[2] = arrs[1];
//          arrs[1] = temp;
//      }
//      
//결과 : {2, 4, 5, 1, 3}
//3번째 동작
//      if(arrs[0] > arrs[3]) {
//          int temp = arrs[3];
//          arrs[3] = arrs[0];
//          arrs[0] = temp;
//      }
//      if(arrs[1] > arrs[3]) {
//          int temp = arrs[3];
//          arrs[3] = arrs[1];
//          arrs[1] = temp;
//      }
//      if(arrs[2] > arrs[3]) {
//          int temp = arrs[3];
//          arrs[3] = arrs[2];
//          arrs[2] = temp;
//      }



