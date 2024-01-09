package org.TUNA.day11.music2.view;

import java.util.List;
import java.util.Scanner;

import org.TUNA.day11.music2.controller.MusicController;
import org.TUNA.day11.music2.model.Music;

public class MusicView {
	// MusicController에 있는 메소드를 사용하기 위해 만듬
	MusicController musicCtrl = new MusicController();

	// 실행프로그램
	public void launchApp() { // switch case문
		theend: while (true) {
			// 메인메뉴 출력, 여기서 선택하면
			// 선택한 값이 choice로 들어감
			int choice = this.printMainMenu();
			Music music = null;
			String title = "";
			// choice 값에 따라서 실행문이 다름
			switch (choice) {
			case 1:
				// 가수명, 곡명을 입력받음
				// music에는 가수명, 곡명이 들어가 있음.
				music = this.inputMusic();
				// 마지막 위치에 추가
				// MusicController에게 마지막 위치에 추가하도록 호출함.
				// MusicCOntroller에 있는 메소드를 호출해야하는데
				// MusicCOntroller 객체가 만들어져 있어야함. 그래서 만듬
				musicCtrl.addMusic(music);
				break;
			case 2:
				// 가수명 곡명을 입력받음
				music = this.inputMusic();
				// 첫 위치에 추가
				musicCtrl.firstaddMusic(music);
				break;
			case 3:
				// 전체 곡 목록을 가져옴
				// musicList 좀 가져와, printAllMusic() 메소드 호출
				// ctrl 누르고 printAllMusics() 메소드를 클릭해보면 해당 코드가 나옴
				List<Music> mList = musicCtrl.printAllMusics();
				// View에 있는 메소드를 이용하여 출력함.
				// musicList가져왔으니 니가 출력 좀 해라
				// View에 있는 printAllMusics() 호출, this붙여서 자기 자신 메소드임을
				// 나타내는데 생략가능함 ㅇㅇ
				this.printAllMusics(mList);
				break;
			case 4:
				// 곡명으로 검색, 곡명을 입력받음.
				title = this.inputTitle();
				// musicList는 MusicController가 가지고 있기 때문에
				// 곡명만 전달해주고 MusicController의 메소드를 호출하여
				// 곡을 검색함.
				music = musicCtrl.findOneByTitle(title);
				// 검색은 완료하고 music에 전달함.
				// 출력은 View에게 시킴, printOne() 메소드 호출 후 찾은 전달
				this.printOne(music);
				break;
			case 5:
				// 곡명을 입력 받음. view에 있는 inputTitle() 메소드
				title = this.inputTitle();
				// musicList 가지고 있는 컨트롤러에게 삭제 요청
				// removeOne() 메소드 호출(곡명전달하면서)
				musicCtrl.removeOne(title);
				break;
			case 6:
				// 곡명을 입력받아서 있는지 없는지 출력하고
				// 없으면 없다고 출력
				// 있으면 수정할 정보 입력받아서 리턴함
				// music에 꽂음
				music = this.modifyTitle();
				// musicList가 있는 컨트롤러에 수정 요청
				// modifyMusic() 호출함(music 넘겨주면서)
				if (music != null)
					musicCtrl.modifyMusic(music);
				break;
			case 7:
				// 곡명으로 오름차순 정렬
				this.displayMessage("=== === 곡명 오름차순 정렬 === ===");
				musicCtrl.sortByTitle();
				this.displayMessage("=== === 정렬 완료 === ===");
				break;
			case 8:
				this.displayMessage("=== === 곡명 내림차순 정렬 === ===");
				musicCtrl.sortByTitleDESC();
				this.displayMessage("=== === 정렬 완료 === ===");
				break;
			case 9:
				this.displayMessage("=== === 가수명 오름차순 정렬 === ===");
				musicCtrl.sortBySinger();
				this.displayMessage("=== === 정렬 완료 === ===");
				break;
			case 10:
				this.displayMessage("=== === 가수명 내림차순 정렬 === ===");
				
				this.displayMessage("=== === 정렬 완료 === ===");
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				break theend;
			}
		}
	}

	// 곡명 입력
	public String inputTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명을 입력하세요 : ");
		String title = sc.nextLine();
		return title;
	}

	// 곡 추가
	public Music inputMusic() {
		Scanner sc = new Scanner(System.in);
		// next(), nextLine()의 차이점
		// next()는 공백 입력받지 않음, 이름, 공백없는 데이터
		// nextLine()은 공백입력받음, 주소, 제목 등 띄어쓰기 있는 데이터
		System.out.print("곡명을 입력해주세요: ");
		String title = sc.nextLine();
		System.out.print("가수명을 입력해주세요: ");
		String singer = sc.nextLine();
//		Music music = new Music();
//		music.setTitle(title);
//		music.setSinger(singer);
		Music music = new Music(title, singer);
		// Music 객체 생성하여 반환
		return music;
	}

	public Music modifyTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명을 입력하세요 : ");
		String title = sc.nextLine();
		Music music = musicCtrl.findOneByTitle(title);
		if (music == null) {
			System.out.println("존재하지 않는 정보입니다.");
			return null;
		} else {
			this.printOne(music);
			System.out.print("수정할 가수명을 입력해주세요 : ");
			music.setSinger(sc.nextLine());
			System.out.print("수정할 곡명을 입력해주세요 : ");
			music.setTitle(sc.nextLine());
			return music;
		}
	}

	// 곡 수정
	public void modifyMusic() {

	}

	// 메인메뉴
	public int printMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택: ");
		int choice = sc.nextInt();
		return choice;
	}

	// 전체 곡 목록 출력
	public void printAllMusics(List<Music> mList) {
		// mList를 이용하여 전체 곡 목록을 출력하는 코드 추가
		System.out.println("=== === 전체 곡 목록 출력 === ===");
		for (Music music : mList) {
			System.out.printf("가수명 : %s, 곡명 : %s\n", music.getSinger(), music.getTitle());
		}
	}

	// 한 곡 출력
	public void printOne(Music music) {
		// TODO Auto-generated method stub
		System.out.printf("가수명 : %s, 곡명 : %s\n", music.getSinger(), music.getTitle());
	}

	// 메시지 출력
	public void displayMessage(String message) {
		System.out.println(message);
	}

	// 가수 정렬
	private void arraySinger() {
		// TODO Auto-generated method stub

	}

	// 곡 정렬
	private void arrayMusic() {
		// TODO Auto-generated method stub

	}

}
