package org.TUNA.day04.array.sort;

public class Exam_ArraySorf {
	public static void main(String[] args) {
		// 정렬
		// 11 13 4 2 6
		// => 2 4 6 11 13(오름차순 정렬)
		// => 13 11 6 4 2(내림차순 정렬)
		// 머리속으로 했었던 비교에 순서와 방법 정리해놓은 것
		// 알고리즘, 문제해결을 하기 위한 절차나 방법
		// 종류
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬
		// 4. 퀵정렬
		// 5. 병합정렬
		// ....
		// 그전에 알아야 할 것!
		int num1 = 11;
		int num2 = 13;
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		// num1에는 13이 들어가고 num2에는 11이 들어가도록 해주세요
		int temp = num1; // 
		num1 = num2; // 여기서 num1은 13이 되었기 때문에 num2 = num1을 하면 13이 나오기 때문에
		num2 = temp; // 임시 저장소를 만들어 줘야함
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		
		int nums [] = {2, 1, 3};
		// 3 2 1이 되도록 바꿔보세요.
//		int temp1 = nums[1];
//		int temp2 = nums[0];
//		int temp3 = nums[2];
//		System.out.printf("%d%d%d",temp3, temp2, temp1);
		int temp1 = nums[0];
		nums[0] = nums[2];
		nums[2] = temp1;
		int temp2 = nums[1];
		nums[1] = nums [2]; 
		nums[2] = temp2;  
		System.out.printf("nums[0] : %d, nums[1] : %d, nums[2] : %d\n",
				nums[0], nums[1], nums[2]);
	}
}
