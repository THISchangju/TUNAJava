package org.TUNA.day10.oop.member.model.vo;

public class Member {
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberEmail;
	private String memberPhone;
	
	public Member() {}
	
	public Member(String memberPw, String memberEmail, String memberPhone) {
		super();
		this.memberPw = memberPw;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		// 알트+쉬프트+s 밑에서 세번째 누르면 자동완성
	}

	public Member(String memberId
			, String memberPw
			, String memberName
			, String memberPhone
			, String memberEmail) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	
	
}
