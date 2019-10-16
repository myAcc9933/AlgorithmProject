package programmersLvl2;

//https://programmers.co.kr/learn/courses/30/lessons/12945?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 피보나치 수 
public class FibonacciSolution {
	
    public int solution(int n) {
    	int arr[] = new int[n];
		
		for(int i = 0; i<n; i++) {
			
			if(i == 0) {
				arr[i] = 0;
			} else if(i == 1) {
				arr[i] = 1;
			} else {
				arr[i] = (arr[i-2] % 1234567) + (arr[i-1] % 1234567); 
			}
			
		}
		
		int answer = ( arr[n-1] + arr[n-2] ) % 1234567;
		
		return answer;
    }	

	public static void main(String[] args) {
		FibonacciSolution fs = new FibonacciSolution();
		System.out.println(fs.solution(3));

	}

}
