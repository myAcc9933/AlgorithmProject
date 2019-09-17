package programmersLvl2;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/12941?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 최솟값 만들기
public class MakeMinValueSolution {
    public int solution(int []A, int []B)		{
        int answer = 0;	
        int j = B.length - 1;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0; i<A.length; i++) {
        	answer = answer + (A[i] * B[j]);
        	j--;
        }

        return answer;
    }
	public static void main(String[] args) {
		MakeMinValueSolution mmvs = new MakeMinValueSolution();
		int[] A = new int[] {1,4,2};
		int[] B = new int[] {5,4,4};
		System.out.println(mmvs.solution(A, B));
	}

}
