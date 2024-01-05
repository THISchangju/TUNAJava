package org.TUNA.day10.oop.member.controller;

import java.util.ArrayList;
import java.util.List;

import org.TUNA.day10.oop.member.model.vo.Member;

public class MemberController {
	// Member List를 저장소
	List<Member> memberList;
	
	public MemberController() {
		memberList = new ArrayList<Member>();
	}
	// 회원 정보 등록
	public void addMember(Member member) {
		memberList.add(member);
	}
	
	public void modifyMember(String memberId, Member updateMember) {
		for(int i = 0; i < memberList.size(); i++) {
			// ============== 원래 저장되어있는 데티어 ==============
			Member member = memberList.get(i);
			// ======================================================
			// ============== 입력한 id와 같은지 비교 ==============
			if(memberId.equals(member.getMemberId())) { // 같으면
				// ============== 입력받은 데이터로 수정 ==============
				member.setMemberPw(updateMember.getMemberPw());
				member.setMemberEmail(updateMember.getMemberEmail());
				member.setMemberPhone(updateMember.getMemberPhone());
				// ======================================================
				// ================ 수정된 데이터로 저장 ================
				memberList.set(i,  member);
				// ========================================================
			}
		}
	}
	// 회원 정보 삭제
	public void deleteMember(String memberId) {
//		for(Member member : memberList) {
		for(int i = 0; i < memberList.size(); i++) {
			Member member = memberList.get(i);
			if(memberId.equals(member.getMemberId())) {
				memberList.remove(i);
				break;
			}
		}
		
	}
	// 회원 전체 정보
	public List<Member> printAllMembers() {
		return memberList;
	}
	// 회원 정보 아이디로 검색
	public Member printOneById(String memberId) {
		for(Member member : memberList) {
			if(memberId.equals(member.getMemberId())) {
				return member;
			}
		}
		return null;
	}
	
	// Member List를 저장소로 가지고 있으며 추가,수정,삭제,출력하는 메소드 작성
	// addMember, updateMember, deleteMember, findMember, findAllMember
}









