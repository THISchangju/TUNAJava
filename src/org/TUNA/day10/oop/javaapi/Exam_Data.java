package org.TUNA.day10.oop.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Data {
	public static void main(String[] args) {
		Date date = new Date(); // 실행한 시간 기준
		System.out.println(date);
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		SimpleDateFormat trans2 = new SimpleDateFormat("yy-mm-dd HH:mm:ss:SS");
		String transDate1 = trans.format(date); // 날짜 데이터를 문자로 형식변환 시켜서 위
		String transDate2 = trans2.format(date); // 내가 지정한 것처럼 날짜 및 시간이 나옴
		System.out.println("형식 변환1 : " + transDate1); 
		System.out.println("형식 변환2 : " + transDate2); 
		// =========================== 권장 사항 ===========================
		Calendar calendar = new GregorianCalendar(); // 업캐스팅
		System.out.println(calendar.getTime());
		String changed = trans2.format(calendar.getTime());
		System.out.println("그레고리안 달력 날자 변환 : " + changed);
	}
}
