package org.TUNA.day08.oop.polymorphism.overloading;


class Weapon{
	public Weapon() {}
	public Weapon(int value) {}
	public Weapon(String name) {}
	public Weapon(int value, String name) {}
}


public class Exam_Overloading {
	
	public Exam_Overloading() {}
	public Exam_Overloading(String name) {}
	public Exam_Overloading(int name) {}
	
	public static void main(String[] args) {
	//다형성 사례!
	//메소드 오버로딩
	//오버로딩 이 없다면
	//전달값마다 다른 이름의 메소드가 필요
	//이름만똑같고 전달값의 갯수나 타입이
	//달라지는경우
		System.out.println("Hello World");
		System.out.println('A');
		System.out.println(13);
		System.out.println(4.25);
	}

}
