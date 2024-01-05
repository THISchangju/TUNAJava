package org.TUNA.day08.oop.polymorphism.overriding;

public class Shape {
	private String name; //캡슐화
	
	public Shape() {}
	
	public void draw() {
		System.out.println("Shape Something");
	}
	
	
	//getter 메소드
	//가져오는것 
	public String getName() {
		return this.name;   
//가져오는거니까 가져올게있어야해 return이있으니 void삭제
	}
	
	//setter 메소드
	public void setName(String name) {
		this.name = name;
	}
}
