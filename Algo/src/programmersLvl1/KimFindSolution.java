package programmersLvl1;

public class KimFindSolution {
	  public String solution(String[] seoul) {
		 String answer = "";
		 for(int i = 0; i<seoul.length; i++) {
			 if(seoul[i].equals("Kim")) { // seoul[i] 값이 Kim과 동일한 경우
				 answer = "김서방은 " + i + "에 있다";
				 break; // Kim을 찾은 후에는 for를 계속할 이유가 없음
			 }
		 }
	      return answer; // 값 반환
	  }	

	public static void main(String[] args) {
		KimFindSolution kfs = new KimFindSolution();;
		String[] arr = new String[] {"Jane","Kim"};
		System.out.println(kfs.solution(arr));
	}

}
