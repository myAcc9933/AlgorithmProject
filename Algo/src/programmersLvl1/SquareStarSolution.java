package programmersLvl1;

import java.util.Scanner;
 
// https://programmers.co.kr/learn/courses/30/lessons/12969?language=java
//프로그래머스 > 코딩테스트 연습 > 연습문제 > 직사각형 별찍기  
public class SquareStarSolution {
 
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 처음 입력한 값
        int b = sc.nextInt(); // 다음으로 입력한 값
        
        for(int i = 0; i<b; i++) {
            for(int j = 0; j<a; j++) {
                System.out.print("*"); // 옆으로 별을 찍는다
            }
            System.out.println(); // 줄을 바꾼다
        }
	}
}
