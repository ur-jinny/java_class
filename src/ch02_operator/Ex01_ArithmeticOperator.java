package ch02_operator;

public class Ex01_ArithmeticOperator {

	public static void main(String[] args) {
		// 산술연산자 
		/**
		 * num1, num2 두개의 정수형 변수를 선언하고 값은 마음대로 
		 * 두 변수의 +, -, *, /, % 연산결과를 print() 를 활용하여 출력해봅시다. 
		 * 출력방법 
		 * System.out.println(num1 + num2)
		 */
		int num1 = 10, num2 = 5; // num1에 정수형 타입 10을 선언하고 마찬가지로 num2에도 선언. 값은 내마음대로 했으니까.
		System.out.println("덧셈결과: " + num1 + num2); // 덧셈결과 : 출력되고 연결고리 + 지정된 num1과 num2의 값을 +라는 연산자가 나왔으니깐 연결되어 --> 105
		System.out.println("덧셈결과: " + (num1 + num2)); // 위에랑 똑같은데 다른점은 가로가 하나더 쳐져있음: 그 말은 계산되어 출력된다--> (10+5)이니깐 --> 15
		System.out.println(num1 - num2); // 10-5  --> 5
		System.out.println(num1 * num2); // 10*5 --> 50
		System.out.println(num1 / num2); //결과값이 몫이 나옴--> / 라는 연산자는 나누기 인데 10에서 5를 나누면  몫:2 / 나머지: 0 여기서, 몫 결과값만 출력되어--> 2
		System.out.println(num1 % num2); //결과값이 나머지가 나옴 --> % 라는 연산자는 /와 반대로 나머지가 결과값으로 출력된다 -->0
		
		// 계산 결과를 담을 변수 활용  // result 라는 변수를 담는 이유는 나중에 결과값을 담은 수가 필요할 수 있기 때문.
		int result = 0; // num1과 num2 는 정수이므로 결과값들은 정수가 나올 것이다. 그래서 타입 int 를 쓰고 0이라고 초기화 해준다.
		result = num1 + num2; // 10 +5 = 15
		System.out.println(result); // 위의  result 값이 나온다.
		result = num1 - num2; // 10- 5 = 5
		System.out.println(result); // 위의 값이 나오고
		result = num1 * num2; // 10 * 5 = 50
		System.out.println(result);
		result = num1 / num2; // 10 / 5 의 몫은 2 이르모 = 2
		System.out.println(result);
		result = num1 % num2; // 10 % 5 의 나머지는 0이므로 = 0
		System.out.println(result);
		
		// 계산 결과 변수를 따로 선언
		int sumResult = num1 + num2; // 정수 타입 int 를 써서 sumResult의 이름에 num1 + num2 를 대입한다.
		System.out.println(sumResult); // 위에 대입한 값이 나온다.--> 15
		int subResult = num1 - num2; // 변수의 이름은 변수랑 어울리는 이름 짓기 위해 썻다.
		System.out.println(subResult); // 5
		int mulResult = num1 * num2; // 10*5 = 50
		System.out.println(mulResult);// 50
		int divResult = num1 / num2; // 10 / 5 = 2가 몫이니까 = 2
		System.out.println(divResult);// 2
		int remainResult = num1 % num2; // 10 % 5 = 0이 나머지 이므로 = 0
		System.out.println(remainResult); // 0
	}



	}


