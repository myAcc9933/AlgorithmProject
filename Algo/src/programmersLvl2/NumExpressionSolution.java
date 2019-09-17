package programmersLvl2;

//https://programmers.co.kr/learn/courses/30/lessons/12924?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 숫자의 표현
public class NumExpressionSolution {
	  public int solution(int n) {
	      int answer = 0;
	      int counter = 0;
	      int j = 1;

	      while(j <= n) {
	    	  
	    	  for(int i = j; i<=n; i++) {
	    		  counter = counter + i;
	    		  if(counter == n) {
	    			  answer++;
	    		  } else if(counter > n) {
	    			  counter = 0;
	    			  break;
	    		  }
	    	  }
	    	  
	    	  j++;
	      }
	      return answer;
	  }
	  
	public static void main(String[] args) {
		NumExpressionSolution nes = new NumExpressionSolution();
		System.out.println(nes.solution(15));
	}

}
