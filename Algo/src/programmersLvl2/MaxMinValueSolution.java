package programmersLvl2;

import java.util.ArrayList;
import java.util.Collections;

//https://programmers.co.kr/learn/courses/30/lessons/12939?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 최댓값과 최솟값
public class MaxMinValueSolution {
	  public String solution(String s) {
		    String answer = "";
		    String[] arr = s.split(" "); // " "로 쪼갠다
		    ArrayList<Integer> list = new ArrayList<>();
		    
		    for(int i = 0; i<arr.length; i++) { 
		    	list.add(Integer.parseInt(arr[i])); // arr에 쪼개서 넣은 값을 Integer로 바꿔 list에 넣음
		    }
		    
		    Collections.sort(list); // 정렬
		    
		    answer = list.get(0) + " " + list.get(list.size() - 1); // 가장 작은 값 + " " + 가장 큰 값
		    
		    return answer;
	  }	

	public static void main(String[] args) {
		MaxMinValueSolution mmvs = new MaxMinValueSolution();
	 	System.out.println(mmvs.solution("1 2 3 4"));
	}

}
