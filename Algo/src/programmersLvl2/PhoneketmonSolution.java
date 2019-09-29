package programmersLvl2;

import java.util.HashSet;

//https://programmers.co.kr/learn/courses/30/lessons/1845?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 폰켓몬
public class PhoneketmonSolution {
	    public int solution(int[] nums) {
	        int answer = 0;
	        int half = nums.length / 2;
	        HashSet<Integer> set = new HashSet<>();
	        
	        for(int i = 0; i<nums.length; i++) {
	        	set.add(nums[i]); // set에 nums 값을 넣어준다(중복 생략)
	        }
	        
	        if(set.size() > half) { // set size가 nums.length / 2 보다 크면
	        	answer = half; // 답은 nums.length
	        	return answer;
	        } else {
	        	answer = set.size(); // 그렇지 않을 경우 set.size 반환
	        	return answer;
	        }
	    }
		

	public static void main(String[] args) {
		PhoneketmonSolution ps = new PhoneketmonSolution();
		int[] nums = new int[] {3,1,2,3};
		System.out.println(ps.solution(nums));
	}
}
