package programmersLvl1;

import java.util.ArrayList;
import java.util.Collections;

//https://programmers.co.kr/learn/courses/30/lessons/12933?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 정수 내림차순으로 배치하기
public class LongDescendingSolution {
	  public long solution(long n) {
	      long answer = 0;
	      int nLength = String.valueOf(n).length();
	      String answerString = "";
	      
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      for(int i = 0; i<nLength; i++) {
	    	  // String으로 만든 뒤 그걸 substring으로 쪼개고 다시 int로 만들어 list에 삽입
	    	  list.add(Integer.parseInt(String.valueOf(n).substring(i, i+1)));
	      }
	      
	      Collections.sort(list, Collections.reverseOrder() ); // 역정렬
	      
	      for(int i = 0; i<nLength; i++) {
	    	  answerString = answerString + list.get(i); // 역정렬 시킨 값 넣어주기
	      }
	      
	      answer = Long.parseLong(answerString); // String을 Long으로 변환
	      
	      return answer;
  }	

	public static void main(String[] args) {
		LongDescendingSolution lds = new LongDescendingSolution();
		System.out.println(lds.solution(118372));
	}

}
