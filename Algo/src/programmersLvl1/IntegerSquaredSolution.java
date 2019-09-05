package programmersLvl1;

public class IntegerSquaredSolution {
	  public long solution(long n) {
	      long answer = 0;
	      
	      // for문 돌려서 1부터 올려가며 제곱수 맞을때까지 확인하면 시간제한에 걸림
	      // long으로 하지 않으면 소수점단위로 쪼개져서 * 하면 값이 나와버림
	      if((long)Math.sqrt(n) * (long)Math.sqrt(n) == n) { 
	    	  answer = ((long)Math.sqrt(n) + 1) * ((long)Math.sqrt(n) +1);
	      } else {
	    	  answer = -1;
	      }; 
	      
	      return answer;
  }
	
	public static void main(String[] args) {
		IntegerSquaredSolution iss = new IntegerSquaredSolution();
		System.out.println(iss.solution(121));
	}
}
