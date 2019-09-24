package programmersLvl1;

//https://programmers.co.kr/learn/courses/30/lessons/12954?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > x만큼 간격이 있는 n개의 숫자
public class XintervalNumSolution {
	  public long[] solution(int x, int n) {
	      long[] answer = new long[n];
	      int val = x;
	      
	      for(int i =0; i<n; i++) {
	    	  answer[i] = ((long)x * (i+1)); // int 범위를 넘어서는 경우가 있어서 long 으로 변환
	      }
	      
	      return answer;
	}	

	public static void main(String[] args) {
		XintervalNumSolution xns = new XintervalNumSolution();
		xns.solution(2, 5);

	}

}
