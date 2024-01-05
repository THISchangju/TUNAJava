package org.TUNA.day05.oop;
// 접근지정자(제한자)
// 종류 : public, protected, default, private
class Sample {
	public int a;
	private int b;
	int c;
}

public class Exam_Access {
	public static void main(String[] args) {
		Sample smpl = new Sample();
		smpl.a = 1113;
//		smpl.b = 426; // The field Sample.b is not visible(private를 걸어놔서 사용 못함)
		smpl.c = 1026; // 동일 클래스 내에서는 사용가능
	}
}
