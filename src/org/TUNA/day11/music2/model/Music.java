package org.TUNA.day11.music2.model;
// Comparable
public class Music implements Comparable<Music>{
	private String title;
	private String singer;

	// 기본 생성자
	public Music() {
	}

	// 매개변수 있는 생성자
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	// getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	// toString(@Override)
	@Override
	public String toString() {
		return "Music [제목=" + title + ", 가수명=" + singer + "]";
	}

	@Override
	public int compareTo(Music o) {
		// TODO Auto-generated method stub
		return this.title.compareTo(o.getTitle());
	}
	
//	@Override
//	public int compareTo(Singer o) {
//		// TODO Auto-generated method stub
//		return this.singer.compareTo(o.getSinger());
//	}

//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return (this.singer+this.title).hashCode();
//	}
//	
//	
//	@Override // override를 쓰므로 해쉬코드가 같다는걸 인지해서 같은 값이 안나옴
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		if(obj instanceof Music) {
//			Music music = (Music)obj;
//			return this.hashCode() == music.hashCode();
//		}else {
//			return false;
//		}
//	}
}
