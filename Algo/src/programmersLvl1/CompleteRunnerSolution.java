package programmersLvl1;

import java.util.HashMap;

//https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 완주하지 못한 선수
public class CompleteRunnerSolution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
     // HashMap에 participant 값 넣는 과정
        for(int i = 0; i<participant.length; i++) {
        	if(map.containsKey(participant[i])) { // 이미 같은 값이 있을 경우
        		int counter = map.get(participant[i]); // 누적되는 값은 Key 별로 다르기 때문에 재정의 필요
        		map.put(participant[i], counter + 1); // 값 증가시켜 재삽입 (이전 Key는 없어짐)
        	} else { // 값이 하나밖에 없을 경우
        		map.put(participant[i], 1);
        	}
        }
        
        // Hashmap에 넣은 값을 completion에 맞춰 빼는 과정
        for(int i = 0; i<completion.length; i++) {
        	if(map.containsKey(completion[i])) { // completion 배열에 이전 삽입한 participant 배열와 일치하는 값이 있을 경우
        		int counter = map.get(completion[i]); // 기존 map에 completion 배열 들어있는 값을 넣어주면 counter 숫자가 나옴
        		map.put(completion[i], counter - 1); // -1씩 해준다
        	}
        }
        
        // answer를 찾는 과정
        // participant 배열과 completion 배열은 1 차이가 남
        for(int i = 0; i<map.size(); i++) {
        	if(map.get(participant[i]) == 1) { // Key에 비례한 Value가 1일 경우(1 차이가 나므로 하나만 남았을 것)
        		answer = participant[i]; // answer는 -1 하지 않은 단 하나의 값
        	}
        }
        
        return answer; // 답 반환    	
    }	

	public static void main(String[] args) {
		CompleteRunnerSolution crs = new CompleteRunnerSolution();
		String[] participant = new String[] {"mislav", "stanko", "mislav", "ana"}; 
		String[] completion = new String[] {"stanko","ana","mislav"}; 
		System.out.println(crs.solution(participant, completion));
	}

}
