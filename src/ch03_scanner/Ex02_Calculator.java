package ch03_scanner;

import java.util.Scanner;

public class Ex02_Calculator {

	public static void main(String[] args) {
		/**
		 * 정수 2개를 각각 스캐너로 num1, num2에 입력받아서 입력받은 수의 합을 출력하세요. 
		 */
		Scanner scanner = new Scanner(System.in); // 스캐너라는 객채를 선언해준다. // 입력하기 위해서
		System.out.print("첫번째 숫자: "); // 일단 입력하고 싶은 말을 써 준다.
		int num1 = scanner.nextInt(); // 스캐너 안에 입력하고 싶은게 정수 이니까 정수형 타입 num1을 시스템 쓰고 싶다는 표현을 한다.
		System.out.print("두번째 숫자: "); // 마찬가지로 정수 2개가 필요하니까 하나더 호출하기 위한. 출력값 작성
		int num2 = scanner.nextInt(); // 입력하기 위한 두번째 숫자의 스캐너 선언
		int sum = num1 + num2;  // 문제에서 두 개의 숫자를 입력받아서 합계가 궁금한 것이니까 합계에 대한 변수 선언해준다
		// 정수형 변수 sum 을 두 개의 숫자의 합이라고 지정하고 나서
		System.out.println("합계: " + sum); //  두 정수의 합계를 나타내준다.
		System.out.println(num1 + "과 " + num2 + "의 합계는" + sum + "입니다.");
		System.out.println(num1 + "+" + num2 + "=" + sum);

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("첫 번째 정수: ");
//		int num1 = scanner.nextInt();
//		System.out.print("두 번쨰 정수: ");
//		int num2 = scanner.nextInt();
//
//		int sum = num1 +num2;
//		System.out.print("두 정수의 합: " + sum);








	}
}






