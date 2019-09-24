package programmersLvl1;

//https://programmers.co.kr/learn/courses/30/lessons/12950?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 행렬의 덧셈
public class ArraySumSolution {
	  public int[][] solution(int[][] arr1, int[][] arr2) {
	      int[][] answer = new int[arr1.length][arr1[0].length]; // 주어지를 행렬로 answer 크기 설정 

	      for(int i = 0; i<arr1.length; i++) { // i 증가
	          for(int j = 0; j<arr1[0].length; j++) { // j 증가
	              answer[i][j] = arr1[i][j] + arr2[i][j]; // 0,0, 0,1 순으로 두 array의 값 넣음
	          }
	      }
	      
	      return answer;
	  }	

	public static void main(String[] args) {
		ArraySumSolution as = new ArraySumSolution();
		int[][] arr1 = new int[][] {{1,2},{2,3}};
		int[][] arr2 = new int[][] {{3,4},{5,6}};
		as.solution(arr1, arr2);
	}
}
