package ch04_if;

public class Ex01_IfBasic {

	public static void main(String[] args) {
		//  if문
		System.out.println("if문 전"); // 그대로 출력
		boolean cond = false; // 참, 거짓 변수타입이니까 cond는 false라고 보면 된다.
		if (!cond) { // 앞에 Not 반대니까 이 말은 즉 true 이므로
			System.out.println("조건을 만족하면 내가 보임"); // 이것이 출력.
		} // 여기서 if 문이 끝났고 나와서
		System.out.println("if문 후"); // if 조건문은 마쳤으니까 이 값이 츨력

		// if else
		System.out.println("if else문 전");
		if (cond) {                       // cond 는 현재 false 니깐
			System.out.println("조건 만족"); // if 문 참이 아니므로 빠져나가서
		} else {         // else 문 출력
			System.out.println("조건 만족하지 않음");
		}
		System.out.println("if else문 후"); // if문 끝났으니깐 이 문장 출력

		int num1 = 10, num2 = 10;
		if (num1 < num2) {            // if(거짓) 이니깐 빠져나와서
			System.out.println("num2가 크다");
		} else { // num1 >= num2      // else 문이 참이므로
			System.out.println("num1이 num2보다 크거나 같다"); // 이 문장이 출력
		}

		// if else if
		if (num1 > num2) {  // 거짓
			System.out.println("num1이 크다");  // X
		} else if (num1 < num2) { // 거짓
			System.out.println("num2가 크다");
		} else if (num1 == num2) {   // 참
			System.out.println("둘이 같다"); // 출력
		} else {
			System.out.println("비교 불가");
		}

	}



}