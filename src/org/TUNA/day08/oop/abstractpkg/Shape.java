package org.TUNA.day08.oop.abstractpkg;

class Line extends Shape{
	// 추상메소드는 오버라이딩을 강제한다.
	@Override
	public void draw() {
		
	}
}

//추상메소드가 있는 클래스는 추상클래스가 됨
//추상클래스가 꼭 추상메소드를 가져야되는것은 아님
public abstract class Shape { //추상클래스로 만드려면 + abstract
	private String name;
	public Shape() {}
	//몸체없는 메소드인 추상메소드로 작성 
	abstract public void draw();
	public void paint() {}
}
