package ch04_if;

import java.util.Scanner;

public class Ex08_IfExample {

	public static void main(String[] args) {
		/**
		 * 서로 다른 정수 3개를 입력받아서 가장 큰 정수 출력하기
		 * (같은 숫자는 입력하지 않는다고 가정)
		 * 입력 예
		 *  첫번째 숫자 :
		 *  두번째 숫자 :
		 *  세번째 숫자 :
		 *  
		 *  출력 예
		 *   가장 큰 숫자는 00 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		num2 = sc.nextInt();
		System.out.print("세 번째 숫자를 입력하세요 : ");
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("가장 큰 숫자는 "+ num1 + "입니다.");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("가장 큰 숫자는 "+ num2 + "입니다.");
		}else if(num3 > num1 && num3 > num2) {
			System.out.println("가장 큰 숫자는 "+ num3 + "입니다.");
		}
		
		int max = 0;
		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
	}


	}


