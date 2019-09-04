package programmersLvl1;
 
//https://programmers.co.kr/learn/courses/30/lessons/12930?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 이상한 문자 만들기 
public class OddWordSolution {
	  public String solution(String s) {
		     String answer = "";
		     String txt = "";
		     int spaceCheck = 0;
		     
		     for(int i = 0; i<s.length(); i++) {
		    	txt = s.substring(i, i+1);
		    	if(txt.equals(" ")) { // space 체크
		    		answer = answer + txt;
		    		spaceCheck = 0; // space reset
		    	} else {
		    		if(spaceCheck%2 == 0 ) { // 홀수만
		    			answer = answer + txt.toUpperCase();
		    		} else { // 짝수
		    			answer = answer + txt.toLowerCase();
		    		}
		    		spaceCheck++;	    		
		    	}
		     }
		     return answer;
	}	

	public static void main(String[] args) {

	}

}
