package org.TUNA.day09.collection.member.model.vo;

public class Member {
	// memberId
	// memberPw
	// memberName
	// memberEmail
	// memberPhone
	private String Id;
	private int Pw;
	private String name;
	private String Email;
	private int phone;
	
	// 생성자
	public Member() {}
	
	public Member(String Id, int Pw, String name, String Email, int phone) {
		this.Id = Id;
		this.Pw = Pw;
		this.name = name;
		this.Email = Email;
		this.phone = phone;
	}
	
	// getter / setter 메소드 이거 없으면 안됨
	// id getter
	public String getId() {
		return this.Id;
	}
	// id setter
	public void setId(String Id) {
		this.Id = Id;
	}
	// Pw getter
	public int getPw() {
		return this.Pw;
	}
	// Pw setter
	public void setPw(int Pw) {
		this.Pw = Pw;
	}
	// name getter
	public String getName() {
		return this.name;
	}
	// name setter
	public void setName(String name) {
		this.name = name;
	}
	// Email getter
	public String getEmail() {
		return this.Email;
	}
	// Email setter
	public void setEmail(String Email) {
		this.Email = Email;
	}
	// phone getter
	public int getter(int phone) {
		return this.phone;
	}
	// phone setter
	public void setPhone(int phone) {
		this.phone = phone;
	}
}
