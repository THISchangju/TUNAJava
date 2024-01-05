package org.TUNA.day09.collection.studentmvc.model;

public class Student {
	//필드 (멤버변수)
	private String name;
	private int firstScore;
	private int secondScore;
	
	// 생성자
	public Student() {}
	
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;	
	}
	// getter / setter 메소드
	// name의 getter / setter
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// firstScore의 getter / setter
	public int getFirstScore() {
		return this.firstScore;
	}
	public int setFirstScore(int firstScore) {
		return this.secondScore;
	}
	// secondScore의 getter / setter
	public int getSecondScore() {
		return this.firstScore;
	}
	public int setSecondScore(int secondScore) {
		return this.firstScore;
	}
	
}
