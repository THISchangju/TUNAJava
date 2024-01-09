package org.TUNA.day11.music2.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.TUNA.day11.music2.model.DescTitle;
import org.TUNA.day11.music2.model.Music;


// 저장소 만들기
public class MusicController {
	List<Music> mList;
	public MusicController() {
		mList = new ArrayList<Music>();
	}
	// 마지막 위치에 곡 추가
	public void addMusic(Music music) {
		mList.add(music);
	}
	// 첫 위치에 곡 추가
	public void firstaddMusic(Music music) {
		mList.add(0, music);
	}
	// 곡명으로 검색
	public Music findOneByTitle(String title) {
		// TODO Auto-generated method stub
		// for each문 : mList에서 music 하나씩 꺼내서 반복, 없을 때까지 함
		for(Music music : mList) {
			// 입력받은 타이틀과 저장되어있는 타이틀 반복 비교
			if(title.equals(music.getTitle())) {
				return music; // 있으면 리턴 후 종료
			}
		}
		return null; // 없으면 null 리턴
	}
	// 전체 곡 출력
	public List<Music> printAllMusics(){
		return mList;
	}
	// 특정 곡 삭제
	public void deleteMusic() {
		
	}
	// 특정 곡 정보수정
	public void modifyMusic(Music music) {
		int i = 0;
		for(Music mOne : mList) {
			if(music.getTitle().equals(mOne.getTitle())) {
				mList.set(i, music); // 찾아서 수정할 때 index 필요, set() 메소드 사용
				// set() 메소드는 index 위치에 해당하는 값을 전달해주는 값으로 교체해줌
				break; // 수정이 완료되면 반복문 종료
			}else {
				i++; // 찾았는데 없을 땐 뒤로 넘어가서 출력해야하기 때문에 i값 증가
			}
		}
	}
	// 곡명으로 삭제
	public void removeOne(String title) {
		// TODO Auto-generated method stub
		// 내가 너를 선언한 이유, 삭제할 때 쓰기 위해서
		int i = 0;
		// List에서 찾을 땐 for문과 if문이 있어야됨 ㅇ?ㅇ
		for(Music music : mList) {
			if(title.equals(music.getTitle())) { // 문자열 비교는 equals
				// 삭제할 때는 index 이용해야하지만 for-each는 i가 없어서
				// 따로 선언하고 찾아서 없을 땐 i를 증가시켜줌
				mList.remove(i);
				break; // 삭제가 완료되면 뒤에 값은 찾을 필요없으면 break로 반복 종료
			}else {
				i++; // 찾았는데 없을 땐 다음 값을 찾기 위해서 수종으로 i값 증가
			}
		}
	}
	// 곡명으로 정렬
	public void sortByTitle() {
		// TODO Auto-generated method stub
		// 정렬 대상이 정수배열이면 이렇게 하면 됨, 근데 아님
//		for(int i = 0; i < nums.lengths-1; i++) {
//			for(int j = 0; nums.length-1-i; j++) {
//				if(nums[j] > nums[j+1]) {
//					int temp = nums[j+1];
//					nums[j+1]= nums[j];
//					nums[j] = temp;
//				}
//			}
//		}
		// 정렬 대상은 Music의 인스턴스임 ㅇㅇ
		for(int i = 0; i < mList.size(); i++) {
			for(int j = 0; j < i; j++) {
				Music mOne = mList.get(i);
				Music mTwo = mList.get(j);
				if(mOne.compareTo(mTwo) < 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(j, temp);
				}
			}
		}
	}
	// 곡명 내림차순
	public void sortByTitleDESC() {
		// 이렇게 하면 오름차순이지만
		// 내림차순의 경우 클래스가 필요
		Collections.sort(mList, new DescTitle());
	}
	// 가수명 오름차순
	public void sortBySinger() {
		// TODO Auto-generated method stub
		for(int i = 0; i < mList.size(); i ++) {
			for(int j = 0; j < i; j++) {
				Music sOne = mList.get(i);
				Music sTwo = mList.get(j);
				if(sOne.compareTo(sTwo) < 1) {
					Music temp = sOne;
					mList.set(i, sOne);
					mList.set(j, temp);
				}
			}
		}

		
	}
}
