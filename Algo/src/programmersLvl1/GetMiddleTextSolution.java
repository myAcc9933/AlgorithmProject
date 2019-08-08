package programmersLvl1;

public class GetMiddleTextSolution {
	
	  public String solution(String s) {
	      String answer = "";
	      
	      if(s.length() % 2 == 0) { // 짝수일 경우
	    	  // 6글자가 들어왔을 경우
	    	  // 3~4번째 글자를 자른다
	    	  answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
	      } else {	// 홀수일 경우
	    	  // 5글자가 들어왔을 경우
	    	  // 3번째 글자를 자른다
	    	  answer = s.substring(s.length() / 2, s.length() / 2 + 1);
	      }
	     
	      return answer; // 값 반환
	  }	

	public static void main(String[] args) {
		GetMiddleTextSolution gmts = new GetMiddleTextSolution();
		gmts.solution("abcef");
	}

}
