package org.TUNA.day12.stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
		// 문자 기반 스트림, Reader(입력 스트림) // 문자 기반이기 때문에 한글로 써도 됨
		Reader reader = null;
		
		try {
			reader = new FileReader("src/org/TUNA/day12/stream/reader/reading.txt");
			int readData;
			while((readData = reader.read()) != -1) { // 코드 단순화
				// while 안에 true가 아닌 readData가 -1이 아니면 반복을 멈춰라라는 조건을 지정 가능
//				int readData = reader.read();
//				if(readData == -1) break;
				System.out.print((char)readData);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
