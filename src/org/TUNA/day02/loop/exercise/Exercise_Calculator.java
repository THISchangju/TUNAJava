package org.TUNA.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
//	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = 0; 
//		int b = 0; 
//		int c = 0; 
//		int d = 0; 
//		int e = 0; 
//		while(true) {
//			System.out.print("정수 하나 입력 : ");
//				int num = sc.nextInt();
//			System.out.print("정수 하나 더 입력 : ");
//				int more = sc.nextInt();
//			System.out.print("연산자 입력(+,-,*,/,%) : ");
//			a = num + more;
//			b = num - more;
//			c = num * more;
//			d = num / more;
//			e = num % more;
//				String plus = sc.next();
//				if(plus.equals("+")) {
//					System.out.print(a);
//				} else if (plus.equals("-")) {
//					System.out.print(b);
//				} else if (plus.equals("*")) {
//					System.out.print(c);
//				} else if (plus.equals("/")) {
//					System.out.print(d);
//				} else if (plus.equals("%")) {
//					System.out.print(e);
//			}
//				System.out.printf("결과값 : \n", a, b, c, d, e);
//		}
//	}
//}
//} 내가 한거 밑에는 선생님이 한거
	public static void main(String [] args){
	    Scanner sc = new Scanner(System.in);
	    for(;;) {
	    System.out.print("정수 입력 : ");
	    int num1 = sc.nextInt();
	    System.out.print("정수 하나 더 입력 : ");
	    int num2 = sc.nextInt();
	    System.out.print("연산자 입력(+,-,*,/,%) : ");
	    char operator = sc.next().charAt(0);
	    int result = 0;
	    switch(operator) {
	        case '+' : result = num1 + num2; break;
	        case '-' : result = num1 - num2; break;
	        case '*' : result = num1 * num2; break;
	        case '/' : result = num1 / num2; break;
	        case '%' : result = num1 % num2; break;
	    }
	    System.out.printf("%d %c %d = %d\n", num1, operator, num2, result); //출력하고 값이 정수면 %d(형식문자)
	    }
	}
}