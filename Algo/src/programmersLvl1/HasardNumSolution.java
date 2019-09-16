package programmersLvl1;

//https://programmers.co.kr/learn/courses/30/lessons/12944?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 하샤드 수
public class HasardNumSolution {
	  public boolean solution(int x) {
	      boolean answer = true;

	      String xStr = String.valueOf(x);
	      int divisionSum = 0;

	      for(int i = 0; i<xStr.length(); i++) {
	          divisionSum = divisionSum + Integer.parseInt(xStr.substring(i, i+1)); // 한글자씩 잘라내서 합침
	      }

	      if(x % divisionSum != 0) {
	          answer = false; // 나누어 떨어지지 않으면 false
	      }

	      return answer;
	  }	

	public static void main(String[] args) {
		HasardNumSolution hns = new HasardNumSolution();
		System.out.println(hns.solution(10));
	}
}
