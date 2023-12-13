package ch02_operator;

public class Ex04_LogicalOperator {

	public static void main(String[] args) {
		// 논리 연산자

		// && : 둘 중 하나라도 false 이면 무조건 false 이고, 둘 다 무조건 true 여야 true 라는 값을 얻을 수 있다.
		// || : 둘 중 하나라도 true 이면  값은 true!!
		System.out.println(true && true); // true 과 true 를 이어주는게 and 이기에 둘다 ture 여서--> true
		System.out.println(false && false); // flase 와 false 를 이어주는게 and 이기에 둘다 false 여서 --> false
		System.out.println(true || true); // true 와 true 를 이어주는게 or 이라서 --> true

		boolean bool1 = true; // 참 거짓 값이 true 이기 때문에 타입 boolean을 사용해 bool1에 true를 대입한다.
		boolean bool2 = false; // 타입 boolean을 사용해 bool2에 false 를 대입.
		boolean bool3 = true; // 타입 boolean을 사용해 bool3에 true 를 대입.

		System.out.println(bool1 && bool2); // 출력을 하게 되면은 (true && false)이므로 결과값은 --> false
		// bool2, bool3의 OR 연산 결과를 result라는 변수에 담고 result 변수값 출력
		boolean result = bool2 || bool3; // 타입 boolean 을 사용하여 result 값에 (false || true) 대입하게 되면은 result는 true
		System.out.println(result); // 그리하여 --> true

		// num1, num2 정수형 변수에 각각 10, 20을 대입하여 선언하고
		int num1 = 10, num2 = 20;
		// num1 > num2 결과를 result1 에 저장하고
		boolean result1 = num1 > num2; // 변수형이 boolean 이므로  결과값은 false
		// num1 != num2 결과를 result2 에 저장해서
		boolean result2 = num1 != num2; // != 같지 않다라는 말인데 같지 않으니까 true
		// result1 && result2 결과를 result3에 저장한뒤
		boolean result3 = result1 && result2; //  false && true 이니까 false
		// result3의 값을 출력
		System.out.println(result3); // 그래서 result3 에 결과값은 ---> false

		boolean result4 = (num1 > num2) && (num1 != num2); // false && true 가 result4 인데
		System.out.println(result4); // 그리하여 --> false

		System.out.println(bool1); // t // 위에 bool1은 true 라고 하였음
		System.out.println(!bool1); // f // bool1 이 true 니까 앞에 not ! 쓰게 되면 결과는 그 반대값 --> false
		System.out.println(bool1 && bool2); // f  // true && false 하나가 false 가 나왔으므로 --> false
		System.out.println(!(bool1 && bool2)); // !(false) 니까는 그 반대는 ---> true

		System.out.println("Not 연산 수행 전: " + bool2);
		bool2 = !bool2; // false를 Not 대입 후 반대가 되어
		System.out.println("Not 연산 수행 후: " + bool2);  //true 결과값이 된다.
	}
}





