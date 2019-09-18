package programmersLvl2;

import java.util.LinkedList;
//https://programmers.co.kr/learn/courses/30/lessons/12981?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 영어 끝말잇기
public class WordChainSolution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int people = 0;
        int turn = 1;
        LinkedList<String> list = new LinkedList<>();
        
        for(int i = 0; i<words.length; i++) {
        	people++; // people은 0이 없음
        	
        	if(i>0) { // 앞, 뒷 단어 체크
        		if(list.get(i-1).charAt(list.get(i-1).length() - 1) != words[i].charAt(0)) {
        			answer[0] = people;
        			answer[1] = turn;
        			break;
        		}
        	}
        	
        	if(list.contains(words[i])) { // 중복 체크
        		answer[0] = people;
        		answer[1] = turn;
        		break;
        	}
        	
        	list.add(words[i]);        	
        	
        	if(people == n) { // people 처음부터
        		people = 0;
        		turn++;
        	}
        }
        
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        
        return answer;
    }	

	public static void main(String[] args) {
		WordChainSolution wcs = new WordChainSolution();
		String[] words = new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		wcs.solution(3, words);
	}

}
