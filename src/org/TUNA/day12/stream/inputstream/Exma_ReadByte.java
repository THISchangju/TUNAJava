package org.TUNA.day12.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exma_ReadByte {
	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/org/TUNA/day12/stream/inputstream/reading.txt");
			int readByteCount;
			byte [] readBytes = new byte[3]; // 3개씩 읽음
			String result = ""; // 반복문과 if문 안에 result를 사용할 수 있도록 밖에 지정
			while(true) {
				readByteCount = is.read(readBytes); // 읽은것들을 저장해줌
				if(readByteCount == -1) break; // 무한반복이 안되도록 조건을 걸어줌
				// 바이트 배열과 갯수를 넘겨주면 문자열로 만들어주는 
				// String 생성자를 통해 문자열로 만들어줌
				// 읽은 데이터가 누적될 수 있도록 +=으로 만들어줌
				// 복합대입연산자 사용
				result += new String(readBytes, 0, readByteCount);				
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
