package programmersLvl1;

//https://programmers.co.kr/learn/courses/30/lessons/12932?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 자연수 뒤집어 배열로 만들기  
public class LongReverseArraySolution {
	  public int[] solution(long n) {
	      String nStr = String.valueOf(n); // long을 String으로 변환
	      int nLength = nStr.length(); // long 자리수 확인
	      int[] answer = new int[nLength]; 
	      int inputValue = 0;

	      for(int i  = 0; i<nLength; i++) {
	          inputValue = Integer.parseInt(nStr.substring(i, i+1)); //  한 글자씩 자른 후 int로 바꿔 배열에 넣기
	          answer[nLength - i - 1] = inputValue; // 4,3,2,1,0 배열 순으로 넣음
	      }

	      return answer;
	  }	

	public static void main(String[] args) {
		LongReverseArraySolution lras = new LongReverseArraySolution();
		lras.solution(12345);
	}

}
