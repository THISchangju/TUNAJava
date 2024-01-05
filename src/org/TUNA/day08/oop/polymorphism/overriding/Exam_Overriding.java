package org.TUNA.day08.oop.polymorphism.overriding;
//메소드 오버라이딩 : 슈퍼클래스의 메소드를 서브 클래스마다 다르게 구현하는것
class Super {
	protected int money;

	public Super() {
		money = 100000000;
	}

	public void manageStroe() {
		System.out.println("매장운영 st : 곡객만족");
	}
}

class Sub extends Super {
//슈퍼클래스의 메소드를 서브 클래스마다 다르게 구현
//다형성사례2
//메소드오버라이딩
//접근지정자,반환형,메소드명 모두 일치 후
//실행문만 달라지는것
//오직 상속관꼐에서만 볼수 있음		
	public void manageStrore() {
		System.out.println("매장운영 st : 매출상승");
	}
}

public class Exam_Overriding {
	// 1. 오버라이딩은 상속관계에서 사용가능
	// 2. 오버라이딩 다똑같고 (접근지정,반환형,메소드명,매개변수)
	// 실행문만 재정의
	// 3. 오버라딩이 되면 동적바인딩이 되어 다형성을 이용할 수 있음.
	static void paint(Shape shape) {
		shape.draw();
	}
	
	public static void main(String[] args) {
	Shape shape = new Shape();
	Circle circle = new Circle();
		paint(shape);
		paint(circle); //업케스팅에관한내용
		paint(circle); 
		paint(new Line()); 
		paint(new Rectangle());
		
//		Sub s = new Sub();
//		s.manageStroe();
//		Circle c = new Circle();
//		c.draw();
	}
}