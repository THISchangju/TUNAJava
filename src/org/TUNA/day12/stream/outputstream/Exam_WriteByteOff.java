package org.TUNA.day12.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {
	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/org/TUNA/day12/stream/outputstream/writing3.txt");
			byte [] data = "마지막 입출력".getBytes();
			// 한글은 3바이트이기 때문에 길이 3으로 해야 한 글자가
			// 한글 2글자가 나오게 하고 싶으면 길이를 6바이트로 해야한다.
			// 길이 지정 안하면 전체 글 출력
			os.write(data, 10, 9); // 시작문자 지점, 얼마나 나오게 할지 길이 지정(한글3바이트)
			os.flush();
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
