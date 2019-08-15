package programmersLvl1;

import java.util.Calendar;

//https://programmers.co.kr/learn/courses/30/lessons/12901?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 2016년
public class WeekDateSolution {
	  public String solution(int a, int b) {
		  String answer = "";
		  String[] arr = new String[] {"SUN","MON","TUE","WED","THU","FRI","SAT"}; // 배열에 일요일부터 금요일까지 담는다
		  
		  Calendar cal = Calendar.getInstance();
		  cal.set(Calendar.YEAR, 2016); // 년도 설정
		  cal.set(Calendar.MONTH, a-1); // 월 설정, 자바에서 1월은 0이기 때문에 -1 하는 것
		  cal.set(Calendar.DAY_OF_MONTH, b); // 일자 설정
		  answer = arr[cal.get(Calendar.DAY_OF_WEEK) -1]; // 요일 가져오기, 배열은 0부터 시작하기 때문에 -1 하는 것
	      return answer; // 답 반환
	  }
	  
	public static void main(String[] args) {
		WeekDateSolution wds = new WeekDateSolution();
		System.out.println(wds.solution(5, 24));
	}

}
