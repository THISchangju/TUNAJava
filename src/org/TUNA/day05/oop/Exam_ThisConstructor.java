package org.TUNA.day05.oop;

public class Exam_ThisConstructor {
	public static void main(String[] args) {
		AnotherBook book = new AnotherBook();
		System.out.printf("%s : %s\n", book.title, book.author);
	}
}

class AnotherBook {
	public String title;
	public String author;
	
	public AnotherBook() {
		// Constructor call must be the first statement in a constructor(첫번째로 적어야한다는 문구)
		this("춘향뎐");
		System.out.println("AnotherBook 생성자 호출");
	}
	
	public AnotherBook(String title) {
		this(title, "작자미상");
		//		this.title = title;
	}
	public AnotherBook(String title, String author) {
		this.title = title;
		this.author = author;
	}
}