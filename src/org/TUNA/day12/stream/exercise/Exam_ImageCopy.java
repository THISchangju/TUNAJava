package org.TUNA.day12.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {
	public static void main(String[] args) {
		// c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg
		// c\\Temp\\Copyimg.jpg로 복사
		InputStream is = null;
		OutputStream os = null; // ctrl+shift+o하면 자동 인포트

		try {
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
			os = new FileOutputStream("C:\\Temp\\Copyimg.jpg");
			int readByteCount;
			byte[] readBytes = new byte[1024*10];
			while ((readByteCount = is.read(readBytes)) != -1) {
				os.write(readBytes, 0, readByteCount);
//				os.flush(); finally에 os.close를 적었기 때문에 생략 가능
			}
			System.out.println("복사 끝");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
