package ch04_if;

import java.util.Scanner;

public class Ex07_ifExample {

	public static void main(String[] args) {
		/**
		 * 성적 출력 예제 응용
		 * 입력값 : 학년(year), 점수(score)
		 * 처리
		 *  - 1~3학년은 60점 이상이면 합격
		 *  - 4학년은 70점 이상이어야 합격
		 */
		
		Scanner sc = new Scanner(System.in);
		int year = 0;
	    int score = 0;

	    System.out.print("학년을 입력하세요 : ");
	    year = sc.nextInt();
	    System.out.print("점수를 입력하세요 : ");
	    score = sc.nextInt();

	    if(year >= 1 && year <= 4 && score >= 0 && score <= 100) {
	    	if(score >= 70) {
	    		System.out.println("축하합니다. 합격입니다.");
	    	} else {
	    		System.out.println("불합격입니다.");
	    	}
	    } else if (year <= 3) {
	    	if(score >= 60) {
	    		System.out.println("축하합니다. 합격입니다.");
	    	} else {
	    		System.out.println("불합격입니다.");
	    	}
	    } else {
	    	System.out.println("4학년까지만 사용해라 ㅡㅡ");
	    }

	}

}
