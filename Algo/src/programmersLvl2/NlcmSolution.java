package programmersLvl2;

//https://programmers.co.kr/learn/courses/30/lessons/12953?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > N개의 최소공배수
public class NlcmSolution {
	  public int solution(int[] arr) {
	      int answer = 0;
	      int largeVal = 0;
	      int smallVal = 0;
	      
	      for(int i = 0; i<arr.length; i++) {
	    	  
			  if(i == arr.length-1) { // 배열 마지막에서 return
				  answer = arr[i];
				  return answer;
			  }    	  
	    	  
			  if(arr[i] > arr[i+1]) { // 큰 수 찾기
				  largeVal = arr[i]; 
				  smallVal = arr[i+1];
			  } else {
				  largeVal = arr[i+1]; 
				  smallVal = arr[i];    			  
			  }
			  
			  for(int j = largeVal; j>0; j--) { // 큰 수에서 1씩 줄여본다
				  if(largeVal % j == 0 && smallVal % j == 0) {
					  arr[i+1] = (arr[i] * arr[i+1]) / j; // 유클리드 호제법
					  arr[i] = 0;									   // 두 값을 곱한 뒤 최대공약수로 나누면 최소공배수
					  break;
				  }
			  }
	    	  
	      }
	      
	      return answer;
	  }	

	public static void main(String[] args) {
		NlcmSolution ns = new NlcmSolution();
		int[] nums = new int[] {3,1,2,3};
		System.out.println(ns.solution(nums));
	}

}
