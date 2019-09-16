package programmersLvl1;

//https://programmers.co.kr/learn/courses/30/lessons/12944?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 평균 구하기
public class AverageSolution {
	  public double solution(int[] arr) {
	      double answer = 0;

	      for(int i = 0; i<arr.length; i++) {
	          answer = answer + arr[i]; // 배열 값 더하기
	      }

	      answer = answer / arr.length; // 배열 총합 / 배열의 길이

	      return answer;
	  }	

	public static void main(String[] args) {
		AverageSolution as = new AverageSolution();
		int[] arr = new int[]{1,2,3,4};
		as.solution(arr);

	}

}
