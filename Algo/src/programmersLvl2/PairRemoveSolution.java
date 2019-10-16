package programmersLvl2;

import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/12973?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 짝지어 제거하기
public class PairRemoveSolution {
    public int solution(String s) {
	   	int answer = 0;
	   	Stack<String> stack = new Stack<>();
	   	
	   	for(int i = 0; i<s.length(); i++) {
	   		
	   		// 1. Stack이 비었을 경우에는 push
	   		// 2. Stack의 peek() 값과 다음 글자가 같을 경우에는 pop으로 제거 (삽입할 필요 X)
	   		// 3. Stack의 peek() 값과 다음 글자가 다를 경우에는 push
	   		if(stack.isEmpty()) {
	   			stack.push(s.substring(i, i+1));
	   		} else if(stack.peek().equals(s.substring(i, i+1))){
	   			stack.pop();
	   		} else {
	   			stack.push(s.substring(i, i+1));
	   		}
	   		
	   	}
	   	
	   	// 문자열 모두 제거 시 1 아닐경우 0 반환
	   	if(stack.isEmpty()) {
	   		answer = 1;
	   	} else {
	   		answer = 0;
	   	}
	       return answer;
	    }		
	
	public static void main(String[] args) {
		PairRemoveSolution prs = new PairRemoveSolution();
		System.out.println(prs.solution("baabaa"));
	}

}
