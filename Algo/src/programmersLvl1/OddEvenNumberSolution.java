package programmersLvl1;

//https://programmers.co.kr/learn/courses/30/lessons/12937?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 짝수와 홀수
public class OddEvenNumberSolution {
	  public String solution(int num) {
	      String answer = "";

	        if(num % 2 == 0) { // 짝수
	            answer = "Even";
	        } else { // 홀수
	            answer = "Odd";
	        }

	      return answer;
	  }	

	public static void main(String[] args) {
		OddEvenNumberSolution oens = new OddEvenNumberSolution();
		System.out.println(oens.solution(3));
	}
}
