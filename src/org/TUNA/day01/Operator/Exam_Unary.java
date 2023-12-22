package org.TUNA.day01.Operator;

public class Exam_Unary {
	public static void main(String [] args) {
		// 단항 연산자
		// a++, ++a -> a = a + 1;
		// 후위연산, 전위연산
		int a1 = 1;
		System.out.println(++a1);
		System.out.println(a1++);
		System.out.println(a1);
		// 문제 1
		// a가 10, b는 20, c는 30
		int a = 10;
		int b = 20;
		int c = 30;
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
		// a : 11, b : 29, c : 39

		// 문제2
		// x는 100, y는 33, z는 0  
		int x = 100;
		int y = 33;
		int z = 0;
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		System.out.println("x : " + x + ", y : " + y + ", z : " + z);
	}
}
