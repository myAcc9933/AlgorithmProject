package programmersLvl1;

import java.util.ArrayList;
import java.util.Collections;

public class DivisorNumberSolution {
	  public int[] solution(int[] arr, int divisor) {
		  ArrayList<Integer> list = new ArrayList<>();
		  
		  for(int i = 0; i<arr.length; i++) {
			  if(arr[i] % divisor == 0) { // 값이 나누어 떨어지면
				  list.add(arr[i]); // list에 값을 넣는다
			  }
		  }
		  
		  Collections.sort(list);	// list 오름차순 정렬
		  int[] answer = new int[list.size()]; // list의 size 만큼 반환할 answer 배열 생성
		  
		  if(list.size() == 0) {	// divisor로 나누어 떨어지는 값이 없을 시
			  answer = new int[1]; // 한칸짜리 배열 만들고
			  answer[0] = -1;			// -1을 넣어준다
		  } else {	// 나누어 떨어지는 값이 있을 경우
			  for(int i =0; i<list.size(); i++) { // list의 길이만큼 
				  answer[i] = list.get(i); // answer에 list의 값을 넣어준다
			  }
		  }
	      return answer; // 값 반환
	  }	

	public static void main(String[] args) {
		DivisorNumberSolution dns = new DivisorNumberSolution();
		int[] arr = new int[] {5, 9, 7, 10};
		dns.solution(arr, 5);
	}
}
