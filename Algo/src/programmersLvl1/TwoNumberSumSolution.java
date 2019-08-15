package programmersLvl1;

// https://programmers.co.kr/learn/courses/30/lessons/12912?language=java
// 프로그래머스 > 코딩테스트 연습 > 연습문제 > 두 정수 사이의 합
public class TwoNumberSumSolution {
	  public long solution(int a, int b) {
		  long answer = 0;
		  long bigNum = 0; // bigNum에 큰 숫자를 담을 것..
		  
		  if( a > b ) { // a가 b보다 클 경우
			  bigNum = a; // bigNum에 a 값을 넣는다
			  for(int i = b; i<=bigNum; i++ ) { // 작은 숫자가 큰 숫자까지 될 때까지 정수 값 더해주기
				  answer = answer + i;
			  }
		  } else if( a < b ) { //a가 b보다 작을경우
			  bigNum = b; // bigNum에 b 값을 넣는다
			  for(int i = a; i<=bigNum; i++ ) { // 작은 숫자가 큰 숫자까지 될 때까지 정수 값 더해주기
				  answer = answer + i;
			  }			  
	  	  }	else if( a == b ) { // a와 b가 같을 경우
			  answer = a;
		  }
	      return answer; // 값 반환
	  }	

	public static void main(String[] args) {
		TwoNumberSumSolution tnss = new TwoNumberSumSolution();
		System.out.println(tnss.solution(1,3));
	}
}
