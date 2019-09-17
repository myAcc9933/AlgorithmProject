package programmersLvl2;

//https://programmers.co.kr/learn/courses/30/lessons/12909?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 올바른 괄호
public class RightBracketSolution {
    boolean solution(String s) {
        boolean answer = true;
        int counter = 0;
        
        for(int i = 0; i<s.length(); i++) {
        	if(s.substring(i, i+1).equals("(")) {
        		counter = counter + 1;
        	} else { // "(" 아님 ")" 밖에 안들어옴
        		counter = counter - 1;
        	}
        	
        	if(counter < 0) {
        		answer = false;
        		break;
        	}
        }
        
        if(counter != 0) {
        	answer = false;
        }

        return answer;
    }	

	public static void main(String[] args) {
		RightBracketSolution rbs = new RightBracketSolution();
		System.out.println(rbs.solution("(())()"));
	}
}
