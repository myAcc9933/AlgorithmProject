package programmersLvl1;

public class PyCountSolution {
    boolean solution(String s) {
        boolean answer = true;
        int sNum = 0;
        int yNum = 0;
        
        s = s.toUpperCase(); // 모두 대문자로 만든다
        
        for(int i = 0; i<s.length(); i++) {
        	if(s.substring(i, i+1).equals("P")) { // P가 있을 경우
        		sNum++;
        	} else if(s.substring(i, i+1).equals("Y")) { // Y가 있을 경우
        		yNum++;
        	}
        }
        
        if(sNum == yNum) { // 추가된 값 비교하여 동일할 시 true
        	answer = true;
        } else { // 동일하지 않을 시 false
        	answer = false;
        }

        return answer; // 값 반환
    }	

	public static void main(String[] args) {
		PyCountSolution pys = new PyCountSolution();
		System.out.println(pys.solution("pPoooyY"));
	}
}
