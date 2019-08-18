package programmersLvl1;

//https://programmers.co.kr/learn/courses/30/lessons/12928?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 약수의 합
public class MeasureSumSolution {
	  public int solution(int n) {
	      int answer = 0;
	      
	      for(int i = 1; i<=n; i++) {   // for문을 n값까지 진행
	    	  if(n % i == 0) { 			   // n을 i로 나눠 나머지 값이 없다면
	    		  answer = answer + i; // answer 값 더하기
	    	  }
	      }
	      
	      return answer; // 값 반환
	  }	

	public static void main(String[] args) {
		MeasureSumSolution mss = new MeasureSumSolution();
		System.out.println(mss.solution(5));
	}

}
