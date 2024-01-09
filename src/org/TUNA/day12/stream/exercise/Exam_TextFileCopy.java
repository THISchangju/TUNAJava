package org.TUNA.day12.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFileCopy {
	public static void main(String[] args) {
		// c:\\window\\system.ini 을 복사해서
		// c:\\Temp\\system.txt로 만들어주세요. 단 문자기반 스트림을 사용하세요.
		Reader reader = null;
		Writer writer = null;
		String src = "c:\\windows\\system.ini";
		String dest = "c:\\Temp\\system.txt";
		
		try {
			reader = new FileReader(src);
			writer = new FileWriter(dest);
			int readCharCount;
			char [] cBuf = new char[10];
			while((readCharCount = reader.read(cBuf)) != -1) {
				writer.write(cBuf, 0, readCharCount);
			}
			writer.flush();
			System.out.println("복사 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
