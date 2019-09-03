package programmersLvl2;

import java.util.LinkedList;

//https://programmers.co.kr/learn/courses/30/lessons/49993?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 스킬트리
public class SkillTreeSolution {
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        int treeValue = 0;
        LinkedList<String> list = new LinkedList<>();
        
        // List 안에 Skill 값을 하나씩 잘라 넣어줌..
        for(int i = 0; i<skill.length(); i++) {
        	list.add(skill.substring(i, i+1));
        }
        
        // 비교 시 skill에 속하는 값인데 최초값 혹은 현재값보다 크다면 X
        // 트리를 다 수행하지 않아도 PASS
        for(int i = 0; i<skill_trees.length; i++) {
        	for(int j = 0; j<skill_trees[i].length(); j++) {
        		if(list.contains(skill_trees[i].substring(j, j+1))) {
        			// 정상적으로 스킬트리를 진행할 경우
        			if(treeValue == list.indexOf(skill_trees[i].substring(j, j+1))) {
        				treeValue++; // 계속 진행
        			} else { // 스킬트리 순서가 잘못된 경우
        				answer = answer - 1;
        				break; // 중단
        			}
        		}
        	}
        	treeValue = 0;
        }
        return answer;
    }	

	public static void main(String[] args) {
		SkillTreeSolution sts = new SkillTreeSolution();
		String[] skill_trees = new String[] {"BACDE", "CBADF", "AECB", "BDA"}; 
		sts.solution("CBD", skill_trees);
	}

}
