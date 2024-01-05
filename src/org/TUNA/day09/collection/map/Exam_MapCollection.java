package org.TUNA.day09.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam_MapCollection {

	public static void main(String[] args) {
		// Collection은 저장소 역할, 데이터를 다루는 방법에 따라
		// List, Set, Map을 선택해서 사용함
		// 맛집 대기자 리스트 -> List
		// 순서는 상관없고 중복을 제거하는 경우 -> Set
		// 지역번호 -> Map
		// 02 : 서울, 031 : 경기도, 051 : 부산, 052 : 울산, 053 : 대구
		// 061 : 전라남도, 062 : 광주, 063 : 전라북도, 064 : 제주
		
		Map<String, String> regionNum = new HashMap<String, String>(); // Integer안되서 숫자부분도 String으로 바꿈
		regionNum.put("02", "서울"); // 알트+쉬프트+a는 선택한 범위만큼 동시에 쓰기 가능
		regionNum.put("031", "경기도");
		regionNum.put("032", "인천광역시");
		regionNum.put("033", "강원특별자치도");
		regionNum.put("041", "충천남도");
		regionNum.put("042", "대전광역시");
		regionNum.put("043", "충천북도");
		regionNum.put("044", "세종특별자치시");
		regionNum.put("051", "부산");
		regionNum.put("052", "울산");
		regionNum.put("053", "대구");
		regionNum.put("061", "전라남도"); // Map에 넣을 때마 put
		regionNum.put("062", "광주광역시");
		regionNum.put("063", "전라북도");
		regionNum.put("064", "제주특별자치도");

		System.out.println("02를 누르면 : " + regionNum.get("02")); // 가져올 때는 get
		System.out.println("031을 누르면 : " + regionNum.get("031"));
		System.out.println("032을 누르면 : " + regionNum.get("032"));
		System.out.println("033을 누르면 : " + regionNum.get("033"));
		System.out.println("041을 누르면 : " + regionNum.get("041"));
		System.out.println("042을 누르면 : " + regionNum.get("042"));
		System.out.println("043을 누르면 : " + regionNum.get("043"));
		System.out.println("044을 누르면 : " + regionNum.get("044"));
		System.out.println("051을 누르면 : " + regionNum.get("051"));
		System.out.println("052을 누르면 : " + regionNum.get("052"));
		System.out.println("053을 누르면 : " + regionNum.get("053"));
		System.out.println("061을 누르면 : " + regionNum.get("061"));
		System.out.println("062을 누르면 : " + regionNum.get("062"));
		System.out.println("063을 누르면 : " + regionNum.get("063"));
		System.out.println("064을 누르면 : " + regionNum.get("064"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		    System.out.print("지역번호 입력 : ");
//		        int num = sc.nextInt();
		    String num = sc.next(); // int로 안되서 String으로 바꿈
		    if(num.equals("exit")) break;
		            if(regionNum.get(num) == null) {
		                System.out.println("존재하지 않는 지역번호입니다."); 
		                continue;
		            }
		    System.out.println("입력하신 지역번호에 대한 지역은 : " + regionNum.get(num));

		}
	}

}
