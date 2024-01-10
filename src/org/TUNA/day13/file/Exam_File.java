package org.TUNA.day13.file;

import java.io.*;
// *은 io패키지 안에 있는 모든걸 쓰겠다는것
// (오라클 SELECT * FROM EMPPLOYEE이랑 같음)

public class Exam_File {
	public static void main(String[] args) {
		File file = new File("C:\\Temp\\Copyimg.jpg");
		String fileName = file.getName(); // 파일 이름을 가져와줌
		String path = file.getPath(); 	  // 파일 경로를 가져와줌
		String parent = file.getParent(); // 파일이 있는 상위 폴더의 이름을 알려줌
		System.out.printf("파일 이름 : %s \n파일 경로 : %s \n부모 폴더 : %s \n", fileName, path, parent);
		System.out.printf("파일이 존재하는가? : %b\n파일이 맞는가? : %b\n폴더가 맞는가? : %b\n", 
				file.exists(), 
				file.isFile(),
				file.isDirectory());

		// 실행시키기 위해 필요함
		Exam_File exFile = new Exam_File();
		exFile.folderMake();
		exFile.fileMake();

	}

	public void folderMake() {
		File folderMake = new File("src/org/TUNA/day13/file/dday");
		if (!folderMake.exists()) { // 폴더가 존재하는지
			folderMake.mkdir();
			System.out.println("폴더가 만들어졌습니다~");
		} else {
			System.out.println("이미 폴더가 존재합니다");
		}
	}

	public void fileMake() {
		try {
			File fileMake = new File("src/org/TUNA/day13/file/d-day.txt");
			if (!fileMake.exists()) { // 파일이 존재하는지
				fileMake.createNewFile();
				System.out.println("파일이 만들어졌습니다!");
			} else {
				System.out.println("이미 파일이 존재합니다.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
