package Chapter10;

import java.util.Calendar;

public class Chapter10_1 {

	public static void main(String[] args) { //기본적으로 현재날짜와 시간으로 설정된다.
		Calendar today = Calendar.getInstance();
		System.out.println("이 해의 연도 : " + today.get(Calendar.YEAR));
		System.out.println("이 해의 월 : " + today.get(Calendar.MONTH)); //결과값 0은 1월을 의미함
		System.out.println("이 해의 몇 째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		
		//Date와 DAY_OF_MONTH는 같다.
		System.out.println("이 달의 몇 일 : " + today.get(Calendar.DATE));
		System.out.println("이 달의 몇 일 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 일 : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7, 1:일요일):"+today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이달의 몇번째 요일 : "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전, 오후 : "+today.get(Calendar.AM_PM)); //0은 오전, 1은 오후
		System.out.println("시간(0~11) : "+today.get(Calendar.HOUR));
		System.out.println("시간(0~23) : "+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) : "+today.get(Calendar.MINUTE));
		System.out.println("초(0~59) : "+today.get(Calendar.SECOND));
		System.out.println("밀리초(1000분의 1초)(0~999) : "+today.get(Calendar.MILLISECOND));
		System.out.println("TimeZone(-12~+12) : "+(today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
		System.out.println("이 달의 마지막 날 : "+today.getActualMaximum(Calendar.DATE));
		System.out.println("이 달의 첫번째 날 : "+today.getActualMinimum(Calendar.DATE));
	}

}
