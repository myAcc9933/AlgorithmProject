package programmersLvl2;

import java.util.ArrayList;
import java.util.HashMap;

//https://programmers.co.kr/learn/courses/30/lessons/42578?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 위장
public class CamouflageSolution {
    public int solution(String[][] clothes) {
        int answer = 1;
        int incre = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<clothes.length; i++) {
        	if(map.get(clothes[i][1]) != null) { //  
        		incre = map.get(clothes[i][1]) + 1;
        	} else {
        		incre = 1;
        	}
        	map.put(clothes[i][1], incre);
        }
        
        for( String key : map.keySet() ){
            list.add(map.get(key));
        }
        
        for(int i = 0; i<list.size(); i++) {
        	answer = answer * (list.get(i) + 1); // 모든 경우의 수 
        	if(i == list.size() - 1) { // 아무것도 선택하지 않는 경우 제외
        		answer = answer - 1;
        	}
        }
        
        return answer;
    }	

	public static void main(String[] args) {
		CamouflageSolution cs = new CamouflageSolution();
		String[][] clothes = new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(cs.solution(clothes));
	}

}
