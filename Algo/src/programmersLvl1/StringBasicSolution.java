package programmersLvl1;

public class StringBasicSolution {
	public boolean solution(String s) {
	    boolean answer = true; // 기본값 true

			try {
				Integer.parseInt(s); // Int 형태로 변환 가능할 경우 true 유지
				 if(s.length() != 4 && s.length() != 6) { // 4,6이 아닌 경우
					 answer = false; // 문자열의 길이가 4,6이 아닌 경우 false
				 }
			} catch (Exception e) {
				answer = false;	// 불가능할 경우 false로 변경
			}		
			
	    return answer; // 값 반환
	}
	  
	public static void main(String[] args) {
		StringBasicSolution sbs = new StringBasicSolution();
		String s = "2344";
		System.out.println(sbs.solution(s));
	}
}
