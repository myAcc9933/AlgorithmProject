package programmersLvl2;

//https://programmers.co.kr/learn/courses/30/lessons/12951?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > JadenCase 문자열 만들기
public class NextBiggerBinarySolution {
	  public int solution(int n) {
		    int answer = 0;
		    int firstOneCount = 0;
		    int oneCount = 0;
		    String binaryValue = "";
		    
		    for(int i = n; ; i++) {
		    	binaryValue = Integer.toBinaryString(i); // int를 2진수로 변환
		    	for(int j = 0; j<binaryValue.length(); j++) {
		    		if( i == n ) {
			    		if(binaryValue.substring(j, j+1).equals("1")) {
			    			firstOneCount++; // 처음 n의 1 갯수 확인하기
			    		}	    			
			    		continue;
		    		}
		    		
		    		if(binaryValue.substring(j, j+1).equals("1")) {
		    			oneCount++; // for문의  i 값을 2진수로 변환한 두 ㅣ1 갯수 세기
		    		}
		    	}
		    	
		    	if(firstOneCount == oneCount) { // 1 갯수가 n의 1갯수와 동일할 경우
		    		answer = i;
		    		break;
		    	}
		    	oneCount = 0;
		    }
		    
		    return answer;
	  }	

	public static void main(String[] args) {
		NextBiggerBinarySolution nbbs = new NextBiggerBinarySolution();
		System.out.println(nbbs.solution(78));
	}

}
