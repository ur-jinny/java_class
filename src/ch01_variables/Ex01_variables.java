package ch01_variables;

public class Ex01_variables {

	public static void main(String[] args) {
		//본인의 이름(name), 나이(age), 키(height), 주소(address), 전화번호(mobile)
		// 를 입력할 수 있는 변수를 각각 선언해봅시다. 
		// 변수 선언
		// String; // x 타입만 주면 안됨
		// name = "이름"; // x 변수이름만 주면 안됨

		String name = "김민지"; // 문자 타입의 name 이라는 이름에 "김민지"를 대입한다.
		int age = 19;  // 정수 타입의 age 이라는 변수에 19를 대입한다.
		double height = 169.0; // 소수형 타입의 height 이라는 변수에 169.0 을 대입한다. // 왜 double 을 썻냐면 값이 소수점이기 때문이다.
		String address = "인천광역시"; // 문자형 값이기 때문에 String 타입을 쓴다. -->String 타입의 변수 address에 "인천광역시" 대입.
		String mobile = "010-2222-3333"; // 값은 숫자 이지만 "-"가 있기 때문에 문자로 반영 , 그러므로 String 타입을 써서 변수에 값을 설정.
		
		// 변수값 출력   //이제  변수값을 출력하겠습니다!
		System.out.println(name); // 내가 지정한 name 이 "김민지" 니깐 출력은 김민지 가 나온다.
		System.out.println("name"); // "" 안에 name 이 있으니깐 출력은 그대로 name 이 나옵니다.
//		System.out.println(name1); name1 은 지정한 적이 없음. 출력 오류
		System.out.println("저의 이름은 : " + name);
		// 저의 이름은 "" 이 있으므로 그대로 출력 되고 +는 연산이기 때문에 출력 되지 않고 다음 문장을 이어준다.
		// name 은 아까 지정한 김민지가 출력되어서 출력값은 /저의 이름은 김민지/ 가 출력된다.
 		System.out.println("저의 이름은 " + name + " 입니다."); // " 저의 이름은 " 그대로 출력 +이어주고 name 아까 지정한 김민지 +연결해주고 입니다 출력.
	}

	}


