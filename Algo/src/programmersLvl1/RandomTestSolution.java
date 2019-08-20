package programmersLvl1;

//https://programmers.co.kr/learn/courses/30/lessons/42840?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 모의고사
public class RandomTestSolution {
    public int[] solution(int[] answers) {
	    int[] supo1 = new int[] {1,2,3,4,5};
	    int[] supo2 = new int[] {2,1,2,3,2,4,2,5};
	    int[] supo3 = new int[] {3,3,1,1,2,2,4,4,5,5};
	    int supo1Index = 0;
	    int supo2Index = 0;
	    int supo3Index = 0;
	    int supo1answer = 0;
	    int supo2answer = 0;
	    int supo3answer = 0;
	    int maxVal = 0;
	    int maxCounter = 0;
	    
	    for(int i = 0; i<answers.length; i++) {
	    	// 값이 맞을 시 answer를 더해준다
	    	if(answers[i] == supo1[supo1Index]) {
	    		supo1answer++;
	    	}
	    	if(answers[i] == supo2[supo2Index]) {
	    		supo2answer++;
	    	}
	    	if(answers[i] == supo3[supo3Index]) {
	    		supo3answer++;
	    	}
	    	
	    	// 배열 다음 값으로 변환
	    	supo1Index = supo1Index+1;
	    	supo2Index = supo2Index+1;
	    	supo3Index = supo3Index+1;
	    	
	    	// 배열 처음으로
	    	if(supo1Index == 5) {
	    		supo1Index = 0;
	    	}
	    	if(supo2Index == 8) {
	    		supo2Index = 0;
	    	}
	    	if(supo3Index == 10) {
	    		supo3Index = 0;
	    	}
	    }
	    
	    // MAX VALUE 찾기
	    // 1. MAX VALUE를 찾는다
	    // 2. MAX VALUE가 몇갠지 확인한다
	    // 3. 차례대로 배열에 담는다
	    
	    // maxVal은 0에서 시작
	    if(maxVal <= supo1answer) { // 수포자1이 모두 틀릴수도 있음..
	    	maxVal = supo1answer;
	    	if(maxVal < supo2answer) {
	    		maxVal = supo2answer;
	    	}
	    	if(maxVal < supo3answer) {
	    		maxVal = supo3answer;
	    	}
	    }
	    
	    // MAX VALUE 갯수 확인
	    if(maxVal == supo1answer) {
	    	maxCounter = maxCounter + 1;
	    }
	    if(maxVal == supo2answer) {
	    	maxCounter = maxCounter + 1;
	    }
	    if(maxVal == supo3answer) {
	    	maxCounter = maxCounter + 1;
	    }
	    
	    if(maxVal == 0) {
	    	int[] answer = new int[] {1,2,3};
	    	return answer;
	    } else {
	    	// 오름차순 정렬할 필요 없이 차례대로 담아준다
	    	// MAX VALUE와 동일한 갯수로 배열 생성
	    	int[] answer = new int[maxCounter];
	    	// 배열에 담기
	    	int arrCounter = 0;
	    	if(maxVal == supo1answer) {
	    		answer[arrCounter] = 1;
	    		arrCounter++;
	    	}
	    	if(maxVal == supo2answer) {
	    		answer[arrCounter] = 2;
	    		arrCounter++;
	    	}
	    	if(maxVal == supo3answer) {
	    		answer[arrCounter] = 3;
	    		arrCounter++;
	    	}	 
	    	return answer;
	    }
    }	

	public static void main(String[] args) {
		RandomTestSolution rts = new RandomTestSolution();
		int[] answers = new int[] {1,2,3,4,5};
		rts.solution(answers);

	}

}
