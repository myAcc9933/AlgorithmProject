package programmersLvl1;

//https://programmers.co.kr/learn/courses/30/lessons/12948?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 핸드폰 번호 가리기
public class PhoneNumHideSolution {
	  public String solution(String phone_number) {
	      String answer = "";
	      int num = phone_number.length() - 4;
	      for(int i = 0; i<phone_number.length() ; i++) {
	          if(i < num) {
	              answer = answer + "*";
	          } else {
	              answer = answer + phone_number.charAt(i);
	          }
	      }
	      return answer;
	  }	

	public static void main(String[] args) {
		PhoneNumHideSolution pnhs = new PhoneNumHideSolution();
		System.out.println(pnhs.solution("01033334444"));
	}
}
