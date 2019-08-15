package programmersLvl1;

// https://programmers.co.kr/learn/courses/30/lessons/12925?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 문자열을 정수로 바꾸기
public class PlusMinusSolution {
	  public int solution(String s) {
	      int answer = 0;
	      
	      answer = Integer.parseInt(s); // String을 Int 형태로 변환
	      
	      return answer;
	  }	

	public static void main(String[] args) {
		PlusMinusSolution pms = new PlusMinusSolution();
		System.out.println(pms.solution("1234"));
	}
}
