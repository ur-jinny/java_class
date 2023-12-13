package ch02_operator;

public class Ex03_AssignmentOperator {
	public static void main(String[] args) {
		int num1 = 10, num2 = 7; // 정수형 변수 num1, num2에 10, 7을 대입한다.
		System.out.println("num1: " + num1 + " num2: " + num2); //  ---->  num1: 10 num2: 7 출력
		// 대입연산자 활용
		num1 += num2; // num1 = num1 + num2;
		System.out.println("num1: " + num1 + " num2: " + num2); // num1:17 , num2:7 // 위에서 num1은 num1 +num2라고 정의했으니까
		// ---> num1: 17 num2: 7
		num1 += num2; // num1 = num1 + num2;  // num1이 17인데 다시 num2 (7) 을 더해서 num1은 여기서 24가 됨
		System.out.println("num1: " + num1 + " num2: " + num2); // num1:24 , num2:7 --> num1: 24 num2: 7
		num1 -= num2; // num1 = num1 - num2; // num1 이 현재 24에서 num2 를 빼서 17이 된다.
		System.out.println("num1: " + num1 + " num2: " + num2); // 따라서 --> num1:17 , num2:7
		num1 *= num2; // num1 = num1 * num2 --> num1 은 17 * 7 =>119
		System.out.println("num1: " + num1 + " num2: " + num2); // num1:119 , num2:7
		num1 /= num2; // 119에서 7를 나누면 17
		System.out.println("num1: " + num1 + " num2: " + num2); // num1:17 , num2:7
	}

}