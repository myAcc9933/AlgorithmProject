package programmersLvl1;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12982
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 예산
public class BudgetSolution {
	  public int solution(int[] d, int budget) {
	      int answer = 0;
	      int counter = 0;

	      Arrays.sort(d); // 배열 정렬

	      for(int i = 0; i<d.length; i++) {
	          answer = answer + d[i]; // answer에 배열 값을 합쳐본다
	          if(answer > budget) { // 예산보다 커지면 break
	        	  answer = counter; 
	              break;
	          }
	          counter++; // 부서 수 증가
	      }
	      answer = counter; // for 문이 끝난 후 answer에 counter 넣어 반환
	      return answer;
	  }	

	public static void main(String[] args) {
		BudgetSolution bs = new BudgetSolution();
		int[] d = new int[] {2,2,3,3};
		System.out.println(bs.solution(d, 10));
	}

}
