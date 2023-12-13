package ch02_operator;

public class Ex02_ComparisonOperator {
 				//  비교 연산자 _뭐가 크냐 작냐 boolean 사용
	public static void main(String[] args) {
		// public static void main(String[] args) { //main 을 걸어줘야 출력이 된다?
		System.out.println(10 > 5); // 10은 5 보다 크니까 boolean 을 안 써도 true라는 값이 나온다.
		System.out.println(10 < 5); // 거짓으므로 false가 나온다.

		boolean result = 77 <= 60;  // boolean타입의 result 를 77 <= 60 을 쓰며은 거짓이므로
		System.out.println(result); // 출력하게 되면 false가 나옴

		result = (8 == 100); // boolean을 안 써도 값은 거짓이므로
		System.out.println(result); // 결과값은 false 가 나온다

		result = false; // result 는 false에 대입시킨다.
		boolean bool1 = true; // boolean 이라는 타입을 써 bool1에 true 를 대입시킨다. bool1은 true.
		// 변수값을 다른 변수에 대입하는 것은 복사 개념
		result = bool1; // result 는 bool1이야 . 그 말은 즉 result 는 true야.
		System.out.println(result); // 출력은 true 가 나온다. 왜냐 위에서 resultsms bool1이라고 했는데 bool1이 true니깐..
		System.out.println(bool1);  // bool1은 아까 위에서 true 라고 했으니까는 출력값은 true!!
	}

}
