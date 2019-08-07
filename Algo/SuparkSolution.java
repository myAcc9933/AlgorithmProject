package Algo;

public class SuparkSolution {
	  public String solution(int n) {
		  String answer = "";
		  
		  for(int i = 0; i < n ; i++) {
			  if(i%2 == 0) { // 짝수일 경우
				  // answer에 수 추가
				  answer = answer + "수";
			  } else { // 홀수일 경우
				  // answer에 박 추가
				  answer = answer + "박";  
			  }
		  }
		  
		  // 0 % 2는 0
		  // 1 % 2는 1
		  // 2 % 2는 0
		  // 반복...
	 
	      return answer;
	  }	

	public static void main(String[] args) {
		SuparkSolution ss = new SuparkSolution();
		// 3일 경우 수박수, 4일 경우 수박수박
		// 즉 홀수는 박 추가 짝수는 수 추가
		System.out.println(ss.solution(4));
	}
}
