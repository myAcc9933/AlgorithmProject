package programmersLvl1;

//https://programmers.co.kr/learn/courses/30/lessons/12921
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 소수 찾기
public class MinorFindSolution {
	  public int solution(int n) {
	      int answer = 0;
	      int[] arr = new int[n+1];  // 배열과 실제 값이 1 안 맞는것 고려해 +1
	      
	      // 2부터 n까지 배열에 담는다 (1은 소수가 아니라 비교하지 않을 것)
	      for(int i = 2; i<=n; i++) {
	    	  arr[i] = i;
	      }
	      
	      // 에라토스테네스의 체 -> 소수의 배수는 모두 소수가 아님
	      // i*i가 n과 작거나 같을 경우 (제곱수만 확인하면 됨)
	      for(int i = 2; i*i<=n; i++) {
	    	  int multiplier = 2;
	    	  if(arr[i] == 0) { // 이미 비었을 경우 continue
	    		  continue;
	    	  }

	    	  for(int j = i; j<=n;) { // 소수를 숫자 올려가며 계속 곱해준다
				  if(j * multiplier > n) { // j * multiplier가 n보다 커지면 break
					  break;
			  	  }
				  arr[j*multiplier] = 0; // j의 배수를 모두 0으로 만든다
				  multiplier++; // multiplier의 값을 올린다(배수 0으로 만들기 위함)
	    	  }
	      }
	      
	      for(int i = 1; i<arr.length; i++) { // 마지막 answer 확인
	    	  if(arr[i] != 0) {
	    		  answer++; // 0이 아닌 값은 모두 소수임
	    	  }
	      }
	      return answer; // 값 반환
	  }	

	public static void main(String[] args) {
		MinorFindSolution mfs = new MinorFindSolution();
		mfs.solution(10);
	}

}
