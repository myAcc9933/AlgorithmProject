package programmersLvl1;

import java.util.Arrays;

public class HateSameNumSolution {
	public int[] solution(int []arr) {
		int[] arrOri = new int[arr.length]; // 처음 몇개가 들어올 지 알 수 없음..
		int j  = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(i == 0) { // 처음의 경우
				arrOri[j] = arr[i];	// 처음에는 무조건 값을 가져다 붙임
				j++;
			} else { // 처음이 아닐 경우
				if(arrOri[j-1] != arr[i]) { // 이전 값과 새 값을 비교해서
					arrOri[j] = arr[i];	    // 값이 다를때만 i값 arrOri 배열에 삽입
					j++;								// 다음 값을 위해 j 추가
				} else {
					// 값이 동일할 경우에는 생략
				}
			}
		}
		
		int[] answer = Arrays.copyOf(arrOri, j);	// arrOri 배열을 j 길이까지만 복사함
		
		//  *************************************
		//  ** TEST CODE (들어있는 answer 배열의 값 확인) **
		//	 *************************************
//		for(int i = 0; i<answer.length; i++) {
//			System.out.println(answer[i]);
//		}
		
        return answer;
	}

	public static void main(String[] args) {
		HateSameNumSolution hsns = new HateSameNumSolution();
		int[] arr = new int[] {1,1,3,3,0,1,1};
		hsns.solution(arr);
	}

}
