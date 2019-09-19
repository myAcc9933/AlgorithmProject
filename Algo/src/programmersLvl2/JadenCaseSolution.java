package programmersLvl2;

import java.util.LinkedList;

//https://programmers.co.kr/learn/courses/30/lessons/12951?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > JadenCase 문자열 만들기
public class JadenCaseSolution {
	  public String solution(String s) {
	      String answer = "";
	      s = s.toLowerCase(); // 일단 전체 소문자 처리
	      int flag = 0;
	      
	      for(int i = 0; i<s.length(); i++) {
	    	  if(s.substring(i, i+1).equals(" ")) {
	    		  flag = 0; // 띄어쓰기 나오면 flag = 0 처리
	    	  }
	    	  
	    	  if(flag == 0 && !s.substring(i, i+1).equals(" ")) { // flag가 0인 상태에서 잘라낸 값이 " "가 아니라면
	    		  answer = answer + s.substring(i, i+1).toUpperCase(); // 대문자로 변환해서 answer에 붙임
	    		  flag++; // 다음 값은 소문자로 나올 것
	    	  } else {
	    		  answer = answer + s.substring(i, i+1).toLowerCase();
	    	  }
	      }
	      return answer;
	}
	  
	public static void main(String[] args) {
		JadenCaseSolution jcs = new JadenCaseSolution();
		System.out.println(jcs.solution("3people unFollowed me"));
	}

}
