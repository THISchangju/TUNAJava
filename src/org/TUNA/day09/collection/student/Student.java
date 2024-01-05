package org.TUNA.day09.collection.student;

public class Student {
	// 필드(멤버변수)
	public String name;
	public int firstScore;
	public int secondScore;
	// 생성자
	public Student() {}
	// 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	// getter 메소드
	public String getName() {
	    return this.name;
	}
	public int getFirstScore() {
	    return this.firstScore;
	}
	public int getSecondScore() {
	    return this.secondScore;
	}
}
