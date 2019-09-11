package programmersLvl1;

//https://programmers.co.kr/learn/courses/30/lessons/12943?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 콜라츠 추측
public class CollatzSolution {
	  public int solution(long num) {
	      int answer = 0;
	      
	      for(int i = 1; i<=501; i++) {
		      if(num == 1) { // 1일 경우
		    	  break;
		      }	    	  
	    	  
		      if(num % 2 == 0) { // 짝수
		    	  num = num / 2;
		    	  answer++;
		      } else { // 홀수
		    	  num = (num * 3) + 1;
		    	  answer++;
		      }
		      
		      if(i == 501) { // 500번 반복해도 1이 아닐 경우
		    	  answer = -1;
		      }
	      }
      
	      return answer;
    }
	public static void main(String[] args) {
		CollatzSolution cs = new CollatzSolution();
		System.out.println(cs.solution(6));
	}
}
