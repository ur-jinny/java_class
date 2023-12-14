package ch03_scanner;

//java.util 패키지에 소속된 Scanner 클래스를 가져옴.
import java.util.Scanner;

public class Ex01_scanner {

	public static void main(String[] args) {
		// // scanner 라는 이름의 Scanner 클래스 객체 선언
		Scanner scanner = new Scanner(System.in); // 입력을 받기 위해서 사용하는 클래스/ 이걸을 사용위해 객체 선언
		System.out.print("숫자를 입력하세요: "); //  "숫자를 입력하세요" 를 먼저 출력을 하고
		int num1 = scanner.nextInt();	//내가 작성하고 싶으니까 //내가 적는 정수의 값이 num1에 담긴다. --> 정수형 변수 num1 에 이 시스템 안에 작성할꺼야. 정수이므로 nextInt();
		System.out.println(num1); // 내가 쓴 정수값이  출력 될것이다.
		
		System.out.print("이름을 입력하세요: "); // print 에는 ln이 빠져 띄어쓰기 되어서 가로 안에 글이 출력
		String name = scanner.next(); // 이름은 문자형이기 때문에 String 을 써서 문자형 변수 name 에 이 문서에 추출할거야. 문자형은 nex(); 작성 or nextline();
		System.out.println(name);
		
		scanner.nextLine(); // or nextline(); 로 작성
		
		System.out.print("주소를 입력하세요: "); // 띄어쓰고 그대로 추출되면은
		String address = scanner.nextLine(); // 입력하기 위한 문자형 주소 압력하기 위한  객체를 선언하다.
		System.out.println(address);

	}

// 00

	}


