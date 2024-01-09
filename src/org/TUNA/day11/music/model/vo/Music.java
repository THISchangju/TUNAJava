package org.TUNA.day11.music.model.vo;

public class Music {
	private String title;
	private String singer;
	
	public Music() {}
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	public final String getTitle() {
		return title;
	}
	public final void setTitle(String title) {
		this.title = title;
	}
	public final String getSinger() {
		return singer;
	}
	public final void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return "Music [제목=" + title + ", 가수명=" + singer + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (this.singer+this.title).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Music) {
			Music music = (Music)obj;
			return this.hashCode() == music.hashCode();
		}else {
			return false;
		}
	}
}
