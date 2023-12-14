package ch02_operator;

public class Ex05_IncreaseDecreaseOperator {

	public static void main(String[] args) {
		
			// 증감연산자 / 앞이냐 뒤냐에 따라서 계산이 다르다.
		// ++을 만나면 그 변수 값이 하나 커진다 일단은
			int num1 = 10, num2 = 0, num3 = 0;  //정수형 변수 num1, num2, num3 에 각 각 10, 0, 0 을 대입한다.
			System.out.println("num1: " + num1 + " num2: " + num2 + " num3: " + num3);// 따라서 --> num1: 10 num2: 0 num3: 0
		// 여기서 설명을 못하겠어요..!
			num2 = ++num1; // num2 에 1 을 더해준다
			System.out.println("num1: " + num1 + " num2: " + num2 + " num3: " + num3); // num1:  num2:
			num2 = ++num1;
			num3 = num1++;
		System.out.println("num1: " + num1 + " num2: " + num2 + " num3: " + num3); // num1:

			int result1 = num1++ + ++num2; // 정수형 변수 result1에 num++ + ++num2를 지정한다.
			System.out.println("num1: " + num1 + " num2: " + num2 + " num3: " + num3);
			System.out.println(result1);

	}

}
