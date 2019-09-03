package programmersLvl2;

//https://programmers.co.kr/learn/courses/30/lessons/42588?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 탑 
public class TowerSolution {
    public int[] solution(int[] heights) {
    	// SUMMARY 
    	// 1. 배열 끝부터 시작해서 0까지
    	// 2. FOR 문을 돌려가며 자신보다 큰 수가 있는지 확인
    	//    있을 경우 해당 배열 INDEX 삽입 
    	//    없을 경우 0 삽입
    	// 3. 배열 반환
    	int[] answer = new int[heights.length];
        int[] TowerArr = new int[heights.length+1]; // 타워 리스트를 담은 Array
        
        for(int i = 1; i<heights.length+1; i++) {
        	TowerArr[i] = heights[i-1]; // 받는 배열 크기는 +1 이지만 heights 배열은 -1임
        }
        
        for(int i = heights.length; i>=1; i--) { // 역순으로 타워 진행
        	for(int j = i; j>=1; j--) {
        		if(TowerArr[i] < TowerArr[j]) { // 다음 타워 값이 현재 타워값보다 크다면
        			answer[i-1] = j;
        			break;
        		} else { // 다음 타워값도 현재 타워값보다 작을 경우
        			answer[i-1] = 0;
        		}
        	}
        }        
        return answer;
    }	

	public static void main(String[] args) {
		TowerSolution ts = new TowerSolution();
		int[] heights = new int[] {6,9,5,7,4};
		ts.solution(heights);
		
	}

}
