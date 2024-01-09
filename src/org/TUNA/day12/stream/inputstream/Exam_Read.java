package org.TUNA.day12.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {
		InputStream is = null; // 추상 클래스이기에 new InputStream이 안됨
		
		try {
			is = new FileInputStream("src/org/TUNA/day12/stream/inputstream/reading.txt");
			int readByte;
			do {
				readByte = is.read();
				System.out.print((char)readByte);
			}while(readByte != 1);
//			while(true ) {
//				// 한 바이트씩 읽어서 출력하는 read
//				readByte = is.read(); // read라는 메소드를 쓰면 강제 예외처리
//				if(readByte == -1) break; // if로 출력 그만하라는 조건을 걸지 않으면 계속 반복함
//				System.out.print((char)readByte); // char로 강제 형변환(대신 한글자씩만 출력)
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 예외가 발생을 하든, 발생하지 않든 반드시 실행되는 코드
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
