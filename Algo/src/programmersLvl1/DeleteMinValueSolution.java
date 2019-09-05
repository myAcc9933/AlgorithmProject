package programmersLvl1;

import java.util.Collections;
import java.util.LinkedList;

//https://programmers.co.kr/learn/courses/30/lessons/12934?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 제일 작은 수 제거하기
public class DeleteMinValueSolution {
	  public int[] solution(int[] arr) {
		  int[] answer = {};
	      LinkedList<Integer> list = new LinkedList<Integer>();
	      
	      for(int i = 0; i < arr.length; i++) {
	    	  list.add(arr[i]); // 배열과 동일하게 list에 담아줌
	      }
	      
	      if(list.size() != 1) {
		      list.remove(Collections.min(list)); // 최소값 제거
		      
		      answer = new int[list.size()];
		      for(int i = 0; i < list.size(); i++) {
		    	  answer[i] = list.get(i); // answer 배열에 최소값만 제거해서 담아줌
		      }
	      } else {
	    	  answer = new int[] {-1}; // 배열의 크기가 0일 경우
	      }
	      
	      return answer;
	  }	

	public static void main(String[] args) {
		DeleteMinValueSolution dnvs = new DeleteMinValueSolution();
		int[] arr = new int[] {4,3,2,1};
		dnvs.solution(arr);
	}

}
