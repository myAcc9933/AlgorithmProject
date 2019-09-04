package programmersLvl1;

//https://programmers.co.kr/learn/courses/30/lessons/12931?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 자리수 더하기
public class JarisuAddSolution {
    public int solution(int n) {
        int answer = 0;
        
        String nVal = String.valueOf(n); // int를 String으로
        
        for(int i =0; i<nVal.length(); i++) {
        	// String을 한 글자씩 자른 후 int로 변환
        	answer = answer + Integer.parseInt(nVal.substring(i, i+1));
        }
        
        return answer;
    }	

	public static void main(String[] args) {
		JarisuAddSolution jas = new JarisuAddSolution();
		System.out.println(jas.solution(123));
	}

}
