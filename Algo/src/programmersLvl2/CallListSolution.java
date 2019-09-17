package programmersLvl2;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42577?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 전화번호 목록
public class CallListSolution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int cutLength = 0;
        Arrays.sort(phone_book);
        
        for(int i = 1; i<phone_book.length; i++) { // 최초값은 비교 안해도 됨
        	cutLength = phone_book[i].length();
        	if(cutLength < phone_book[0].length()) {
        		continue;
        	}
        	
        	if(phone_book[0].equals(phone_book[i].substring(0,phone_book[0].length()))) {
        		answer = false; // 비교해봐서 같으면 false
        		break;
        	}
        }
        return answer;
    }	

	public static void main(String[] args) {
		CallListSolution cls = new CallListSolution();
		String[] phone_book = new String[] {"119","97674223","1195524421"};
		System.out.println(cls.solution(phone_book));
	}

}
