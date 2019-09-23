package programmersLvl2;

//https://programmers.co.kr/learn/courses/30/lessons/12980?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 점프와 순간 이동
public class JumpAndTeleSolution {
    public int solution(int n) {
        int ans = 0;
        
        while(n != 0) { // 0 될때까지 반복
        	
        	if( n % 2 == 0) { // 2로 나눠지면 나눈다
        		n = n / 2;
        	} else {
        		n = n - 1; // 나눠지지 않을 경우 1을 빼본다
        		ans++; // 배터리 소모
        	}
        	
        }

        return ans;
    }
	
	public static void main(String[] args) {
		JumpAndTeleSolution jats = new JumpAndTeleSolution();
		System.out.println(jats.solution(5000));
	}

}
