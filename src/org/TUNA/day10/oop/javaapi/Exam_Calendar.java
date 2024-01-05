package org.TUNA.day10.oop.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();	//new Calendar(); 불가능 추상이라
		Calendar openDate = Calendar.getInstance();
		Calendar closeDate = Calendar.getInstance();
		
		System.out.println(today);
		System.out.println(today.get(Calendar.YEAR)+"년");
		System.out.println(today.get(Calendar.MONTH+1)+"월"); // MONTH는 +1 해줘야함(0부터 시작이기 때문)
		System.out.println(today.get(Calendar.DAY_OF_MONTH)+"일");
		System.out.println(today.get(Calendar.HOUR_OF_DAY)+"시"); // 24시간제
		System.out.println(today.get(Calendar.AM_PM)+"시"); //AM, PM시간제 (오전, 오후)
															// Calendar.AM_PM(0은 AM, 1은 PM)
		
		System.out.println(today.get(Calendar.MINUTE)+"분");
		System.out.println(today.get(Calendar.SECOND)+"초");
		System.out.println(today.get(Calendar.MILLISECOND)); // 초에 소수점 뒷자리들
		
		
		
		Exam_Calendar pCal = new Exam_Calendar();
		openDate.clear(); // 먼저 없애기
		openDate.set(2023, 11, 13, 9, 0); // 내가 지정한 날짜로 세팅
		pCal.printCalendar("개강일", openDate);
//		System.out.println(openDate.get(Calendar.YEAR)+"년" 
//		+ openDate.get(Calendar.MONTH)+"월" 
//		+ openDate.get(Calendar.DAY_OF_MONTH)+"일" 
//		+ openDate.get(Calendar.HOUR_OF_DAY)+"시" 
//		+ openDate.get(Calendar.MINUTE)+"분" 
//		+ openDate.get(Calendar.SECOND)+"초" 
//		+ openDate.get(Calendar.MILLISECOND));
		
		
		closeDate.clear(); 
		closeDate.set(2024, 4, 25, 18, 0); 
		pCal.printCalendar("종강일", openDate);
//		System.out.println(closeDate.get(Calendar.YEAR)+"년" 
//				+ closeDate.get(Calendar.MONTH)+"월" 
//				+ closeDate.get(Calendar.DAY_OF_MONTH)+"일" 
//				+ closeDate.get(Calendar.HOUR_OF_DAY)+"시" 
//				+ closeDate.get(Calendar.MINUTE)+"분" 
//				+ closeDate.get(Calendar.SECOND)+"초" 
//				+ closeDate.get(Calendar.MILLISECOND));
//	}
	
	}
	
	// 현재 2022/12/7/수요일(11시) 오전 11시 42분 33초 234밀리초
	public void printCalendar(String title, Calendar cal) {
	    int year           = cal.get(Calendar.YEAR);
	    int month           = cal.get(Calendar.MONTH)+1;
	    int day           = cal.get(Calendar.DAY_OF_MONTH);
	    int dayOfWeek     = cal.get(Calendar.DAY_OF_WEEK);
	    int hourOfDay     = cal.get(Calendar.HOUR_OF_DAY);
	    int ampm           = cal.get(Calendar.AM_PM);
	    int hour           = cal.get(Calendar.HOUR);
	    int minute        = cal.get(Calendar.MINUTE);
	    int second        = cal.get(Calendar.SECOND);
	    int millisecond = cal.get(Calendar.MILLISECOND);
	    System.out.print(title + " ");
	    System.out.print(year + "/"+ month + "/" + day);
	    
	    System.out.print("/");
	    switch(dayOfWeek) {
	        case Calendar.SUNDAY :    System.out.print("일요일"); break;
	        case Calendar.MONDAY :    System.out.print("월요일"); break;
	        case Calendar.TUESDAY :   System.out.print("화요일"); break;
	        case Calendar.WEDNESDAY : System.out.print("수요일"); break;
	        case Calendar.THURSDAY :  System.out.print("목요일"); break;
	        case Calendar.FRIDAY :    System.out.print("금요일"); break;
	        case Calendar.SATURDAY :  System.out.print("토요일"); break;
	    }
	    System.out.print("(" + hourOfDay+"시) ");
	    if(ampm == Calendar.AM) System.out.print("오전 ");
	    else System.out.print("오후 ");
	    System.out.print(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
	    System.out.println();
	}

}
