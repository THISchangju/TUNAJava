package org.TUNA.day11.music2.view;

import java.util.List;

import org.TUNA.day11.music2.model.Music;


// 인터페이스는 몸체가 없어(추상메소드) 'overriding' 해서 써야 함.
public interface MusicViewInterface {
	public void launchApp(); // 반환값 지정 - 'void'
	public int printMainMenu();
	public String inputSinger(); // 반환값 지정 - 'String'
	public void printAllMusics(List<Music> mList);
	public void inputMusic();
	public void modifyMusic();
	
}
